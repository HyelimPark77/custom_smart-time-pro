.class public Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;
    }
.end annotation


# static fields
.field public static final n:Ljava/lang/String; = "UpdateResourceThread"


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Z

.field public c:I

.field public final d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

.field public final e:Lcom/jieli/jl_fatfs/FatFileSystem;

.field public final f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public final i:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

.field public final j:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

.field public final k:Landroid/os/Handler;

.field public l:Z

.field public m:Lcom/jieli/jl_rcsp/model/base/BaseError;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a:Ljava/lang/Object;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->k:Landroid/os/Handler;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->getWatchSystem()Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->f:Ljava/lang/String;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->i:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    iput-object p4, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->j:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "FatFsWatch can not be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;I)I
    .locals 0

    .line 6
    iput p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->c:I

    return p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;Lcom/jieli/jl_rcsp/model/base/BaseError;)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->m:Lcom/jieli/jl_rcsp/model/base/BaseError;

    return-object p1
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 4
    sget-object v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->g()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILjava/lang/String;)V
    .locals 0

    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->b(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILjava/lang/String;F)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->b(ILjava/lang/String;F)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILjava/lang/String;Z)V
    .locals 0

    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(ILjava/lang/String;Z)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->l:Z

    return p1
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->c:I

    return p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->f()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/RuntimeException;)I
    .locals 2

    const/16 v0, 0x3000

    if-nez p1, :cond_0

    return v0

    .line 58
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

    .line 59
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 60
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return v0
.end method

.method public final a(Ljava/io/File;)Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    .line 18
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->readFileData(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 19
    array-length v2, v0

    const/16 v3, 0x200

    if-ge v2, v3, :cond_0

    goto/16 :goto_1

    .line 20
    :cond_0
    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    invoke-virtual {v2}, Lcom/jieli/jl_fatfs/FatFileSystem;->getCurBrowsePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFilePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 21
    iget-object v4, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    invoke-virtual {v4, v2}, Lcom/jieli/jl_fatfs/FatFileSystem;->getFatFileMsg(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 22
    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    invoke-virtual {v5, v2}, Lcom/jieli/jl_fatfs/FatFileSystem;->getFileHead(Ljava/lang/String;)[B

    move-result-object v2

    if-eqz v2, :cond_3

    .line 23
    new-array v5, v3, [B

    const/4 v6, 0x0

    .line 24
    invoke-static {v0, v6, v5, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    invoke-static {v5, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v2

    invoke-virtual {v4}, Lcom/jieli/jl_fatfs/model/FatFile;->getSize()J

    move-result-wide v5

    cmp-long v2, v2, v5

    if-eqz v2, :cond_1

    goto :goto_0

    .line 26
    :cond_1
    sget-object v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "head same, file size : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", fat File size = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    invoke-virtual {v4}, Lcom/jieli/jl_fatfs/model/FatFile;->getSize()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 28
    const-string v2, "convertUpdateTask"

    invoke-static {v0, v2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 29
    :cond_2
    :goto_0
    new-instance v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;

    invoke-direct {v2, v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$1;)V

    .line 30
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->filePath:Ljava/lang/String;

    .line 31
    array-length p1, v0

    int-to-long v0, p1

    iput-wide v0, v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->fileSize:J

    const/4 p1, 0x2

    .line 32
    iput p1, v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->op:I

    return-object v2

    .line 33
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const/16 v0, 0x18

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 34
    :cond_4
    new-instance v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;

    invoke-direct {v2, v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$1;)V

    .line 35
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->filePath:Ljava/lang/String;

    .line 36
    array-length p1, v0

    int-to-long v0, p1

    iput-wide v0, v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->fileSize:J

    const/4 p1, 0x1

    .line 37
    iput p1, v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->op:I

    return-object v2

    :cond_5
    :goto_1
    return-object v1
.end method

.method public final a(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_4

    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    goto :goto_1

    .line 39
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;

    .line 42
    iget v3, v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->op:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    .line 43
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_3
    return-object v0

    :cond_4
    :goto_1
    return-object p1
.end method

.method public final a(I)V
    .locals 1

    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(IZ)V

    return-void
.end method

.method public final synthetic a(ILjava/lang/String;)V
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->i:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public final synthetic a(ILjava/lang/String;F)V
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->i:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    invoke-interface {v0, p1, p2, p3}, Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;->onProgress(ILjava/lang/String;F)V

    return-void
.end method

.method public final a(ILjava/lang/String;Z)V
    .locals 1

    if-eqz p3, :cond_0

    .line 15
    iget-boolean p3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->l:Z

    if-eqz p3, :cond_0

    .line 16
    iget-object p3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    new-instance v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$7;

    invoke-direct {v0, p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$7;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILjava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p3, p1, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->jumpToUpdateResource(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void

    .line 17
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->b(ILjava/lang/String;)V

    return-void
.end method

.method public final a(IZ)V
    .locals 1

    .line 14
    invoke-static {p1}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFsErrorCodeMsg(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(ILjava/lang/String;Z)V

    return-void
.end method

.method public final synthetic a(Ljava/lang/String;)V
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->i:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;->onStop(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic a(Ljava/lang/String;I)V
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->i:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;->onStart(Ljava/lang/String;I)V

    return-void
.end method

.method public final a(Ljava/util/List;)Z
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;",
            ">;)Z"
        }
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-eqz p1, :cond_7

    .line 48
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_1

    .line 49
    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->d()J

    move-result-wide v2

    .line 50
    sget-object v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "leftSize = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "hasEnoughSpace"

    invoke-static {v4, v6, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-wide/16 v7, 0x0

    if-eqz v4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;

    .line 52
    sget-object v5, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "task = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->filePath:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, ", size = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v10, v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->fileSize:J

    invoke-virtual {v9, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v10, ", op = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v10, v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->op:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v5, v6, v9}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    iget v5, v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->op:I

    if-eq v5, v0, :cond_4

    const/4 v9, 0x2

    if-eq v5, v9, :cond_3

    goto :goto_0

    .line 54
    :cond_3
    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    invoke-virtual {v5}, Lcom/jieli/jl_fatfs/FatFileSystem;->getCurBrowsePath()Ljava/lang/String;

    move-result-object v9

    iget-object v10, v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->filePath:Ljava/lang/String;

    invoke-static {v9, v10}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFilePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Lcom/jieli/jl_fatfs/FatFileSystem;->getFatFileMsg(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object v5

    .line 55
    iget-wide v9, v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->fileSize:J

    invoke-virtual {v5}, Lcom/jieli/jl_fatfs/model/FatFile;->getSize()J

    move-result-wide v4

    sub-long/2addr v9, v4

    sub-long/2addr v2, v9

    goto :goto_0

    .line 56
    :cond_4
    iget-wide v4, v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->fileSize:J

    sub-long/2addr v2, v4

    :goto_0
    cmp-long v4, v2, v7

    if-gez v4, :cond_2

    :cond_5
    cmp-long p1, v2, v7

    if-ltz p1, :cond_6

    move v1, v0

    .line 57
    :cond_6
    sget-object p1, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", leftSize = "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v6, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_7
    :goto_1
    return v0
.end method

.method public final b()I
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->m:Lcom/jieli/jl_rcsp/model/base/BaseError;

    if-nez v0, :cond_0

    const/16 v0, 0x3000

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v0

    return v0
.end method

.method public final b(ILjava/lang/String;)V
    .locals 3

    .line 7
    sget-object v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

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

    .line 8
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->g:Ljava/lang/String;

    const-string v1, ".ufw"

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->obtainUpdateFilePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->deleteFile(Ljava/lang/String;)Z

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "res.ori"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->deleteFile(Ljava/lang/String;)Z

    .line 12
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->i:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    if-eqz v0, :cond_0

    .line 13
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->k:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/m96;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/m96;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->j:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;->onFinish(J)V

    :cond_1
    return-void
.end method

.method public final b(ILjava/lang/String;F)V
    .locals 2

    .line 15
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->i:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    if-eqz v0, :cond_0

    .line 16
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->k:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/o96;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/o96;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILjava/lang/String;F)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->i:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->k:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/n96;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/n96;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->j:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;->onFinish(J)V

    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/String;I)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->i:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->k:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/l96;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/l96;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->m:Lcom/jieli/jl_rcsp/model/base/BaseError;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()J
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->getFreeSize()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x1000

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->b:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->b:Z

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a:Ljava/lang/Object;

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

    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->b:Z

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->g:Ljava/lang/String;

    const-string v1, ".ufw"

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->obtainUpdateFilePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    new-instance v1, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$5;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$5;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;)V

    invoke-virtual {v0, v2, v1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->writeResourceOTAFlag(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void

    :cond_0
    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->l:Z

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    new-instance v1, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$6;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$6;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;)V

    invoke-virtual {v0, v2, v1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->jumpToUpdateResource(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->f:Ljava/lang/String;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->deleteFile(Ljava/lang/String;)Z

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "res.ori"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->deleteFile(Ljava/lang/String;)Z

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->b:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a:Ljava/lang/Object;

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

.method public final h()V
    .locals 9

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    array-length v4, v0

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v0, v5

    :try_start_0
    invoke-virtual {p0, v6}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Ljava/io/File;)Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :goto_2
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Ljava/lang/RuntimeException;)I

    move-result v0

    invoke-virtual {p0, v0, v3}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(IZ)V

    return-void

    :cond_1
    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Ljava/util/List;)Z

    move-result v1

    if-nez v1, :cond_2

    const/16 v0, 0x4201

    invoke-virtual {p0, v0, v3}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(IZ)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    sget-object v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

    const-string v5, "updateResource"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "isOTAResource = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-virtual {v7}, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource()Z

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource()Z

    move-result v5

    if-nez v5, :cond_3

    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    new-instance v6, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$1;

    invoke-direct {v6, p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$1;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;)V

    invoke-virtual {v5, v2, v6}, Lcom/jieli/jl_rcsp/watch/WatchBase;->writeResourceOTAFlag(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e()V

    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->b()I

    move-result v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v0, v3, v2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(ILjava/lang/String;Z)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_3
    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    new-instance v6, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$2;

    invoke-direct {v6, p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$2;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;)V

    invoke-virtual {v5, v2, v6}, Lcom/jieli/jl_rcsp/watch/WatchBase;->jumpToUpdateResource(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e()V

    iget-boolean v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->l:Z

    if-nez v5, :cond_4

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->b()I

    move-result v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v0, v3, v2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(ILjava/lang/String;Z)V

    monitor-exit v1

    return-void

    :cond_4
    const-string v5, "updateResource"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "task size : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->f()V

    monitor-exit v1

    return-void

    :cond_5
    iget-object v4, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {p0, v4, v5}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->b(Ljava/lang/String;I)V

    :goto_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_d

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;

    iget v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->c:I

    if-eqz v5, :cond_6

    goto/16 :goto_5

    :cond_6
    iget v5, v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->op:I

    const/16 v6, 0x16

    if-ne v5, v3, :cond_9

    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-nez v5, :cond_7

    iput v6, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->c:I

    sget-object v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

    const-string v2, "updateResource"

    const-string v4, "createFatFile ---> updateResult : 2"

    invoke-static {v0, v2, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_7
    sget-object v5, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

    const-string v6, "updateResource"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "createFatFile ---> filePath : "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->filePath:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v6, v7}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v6, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    iget-object v7, v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->filePath:Ljava/lang/String;

    new-instance v8, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$3;

    invoke-direct {v8, p0, v2, v4}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$3;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;)V

    invoke-virtual {v6, v7, v3, v8}, Lcom/jieli/jl_fatfs/FatFileSystem;->createFatFile(Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    iget v4, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->c:I

    if-eqz v4, :cond_8

    goto :goto_5

    :cond_8
    const-string v4, "updateResource"

    const-string v6, "createFatFile ---> lock... >> "

    invoke-static {v5, v4, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e()V

    const-string v4, "updateResource"

    const-string v6, "createFatFile ---> unlock... >> "

    invoke-static {v5, v4, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_9
    const/4 v7, 0x2

    if-ne v5, v7, :cond_c

    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-nez v5, :cond_a

    iput v6, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->c:I

    sget-object v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

    const-string v2, "updateResource"

    const-string v4, "replaceFatFile ---> updateResult : 2"

    invoke-static {v0, v2, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_a
    iget-object v6, v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->filePath:Ljava/lang/String;

    new-instance v7, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;

    invoke-direct {v7, p0, v2, v4}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;)V

    invoke-virtual {v5, v6, v7}, Lcom/jieli/jl_fatfs/FatFileSystem;->replaceFatFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    iget v4, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->c:I

    if-eqz v4, :cond_b

    goto :goto_5

    :cond_b
    sget-object v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

    const-string v5, "updateResource"

    const-string v6, "replaceFatFile ---> lock >> "

    invoke-static {v4, v5, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->e()V

    const-string v5, "updateResource"

    const-string v6, "replaceFatFile ---> unlock >> "

    invoke-static {v4, v5, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_3

    :cond_d
    :goto_5
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "end >> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "updateResource"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->c:I

    if-nez v0, :cond_e

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->f()V

    return-void

    :cond_e
    invoke-virtual {p0, v0, v3}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(IZ)V

    return-void

    :goto_6
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->j:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;->onStart(J)V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->f:Ljava/lang/String;

    const/4 v1, 0x5

    if-nez v0, :cond_1

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(I)V

    return-void

    :cond_1
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->f:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(I)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->f:Ljava/lang/String;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->getDirPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->g:Ljava/lang/String;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->f:Ljava/lang/String;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->getFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "dirPath = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->g:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/jieli/jl_fatfs/utils/ZipUtil;->unZipFolder(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->g:Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->findFolder(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->h:Ljava/lang/String;

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->h:Ljava/lang/String;

    :cond_4
    :goto_1
    sget-object v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->n:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "targetPath = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->h:Ljava/lang/String;

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->h()V

    goto :goto_2

    :cond_5
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->g:Ljava/lang/String;

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

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(I)V

    goto :goto_2

    :cond_6
    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->b(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public stopThread()V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->c:I

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->g()V

    return-void
.end method
