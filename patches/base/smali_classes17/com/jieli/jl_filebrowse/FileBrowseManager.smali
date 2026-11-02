.class public Lcom/jieli/jl_filebrowse/FileBrowseManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;
.implements Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;


# static fields
.field public static MAX_FOLDER_LEVEL:I = 0x8

.field public static WAITING_CMD_TIMEOUT:J = 0x4e20L

.field public static final v:Ljava/lang/String; = "FileBrowseManager"

.field public static final w:I = 0x1010

.field public static volatile x:Lcom/jieli/jl_filebrowse/FileBrowseManager; = null
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field public static final y:I = 0xc00

.field public static z:Ljava/lang/String;


# instance fields
.field public a:Lcom/jieli/jl_filebrowse/interfaces/FileBrowseOperator;

.field public b:Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadOperator;

.field public final c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

.field public final d:Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;

.field public final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_filebrowse/bean/Folder;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/io/ByteArrayOutputStream;

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;"
        }
    .end annotation
.end field

.field public h:I

.field public volatile i:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field public volatile j:Z

.field public volatile k:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

.field public volatile l:Lcom/jieli/jl_filebrowse/bean/PathData;

.field public m:Landroid/content/Context;

.field public volatile n:Z

.field public o:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

.field public final p:Landroid/os/Handler;

.field public q:[B

.field public r:I

.field public s:Lcom/jieli/jl_filebrowse/bean/FileStruct;

.field public t:Lcom/jieli/jl_filebrowse/interfaces/LrcDecoder;

.field public u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->e:Ljava/util/Map;

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->f:Ljava/io/ByteArrayOutputStream;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->g:Ljava/util/List;

    const/16 v0, 0xa

    iput v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->h:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->j:Z

    iput-boolean v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->n:Z

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_filebrowse/FileBrowseManager$1;

    invoke-direct {v3, p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager$1;-><init>(Lcom/jieli/jl_filebrowse/FileBrowseManager;)V

    invoke-direct {v1, v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->p:Landroid/os/Handler;

    iput v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->r:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->u:Z

    new-instance v0, Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    invoke-direct {v0, v1}, Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    new-instance v0, Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;

    invoke-direct {v0, v1}, Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->d:Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_filebrowse/FileBrowseManager;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I

    move-result p0

    return p0
.end method

.method public static synthetic a(Lcom/jieli/jl_filebrowse/FileBrowseManager;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->k:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    return-object p0
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic a(Lcom/jieli/jl_filebrowse/FileBrowseManager;I)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_filebrowse/FileBrowseManager;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/FileStruct;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_filebrowse/FileBrowseManager;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c()V

    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_filebrowse/FileBrowseManager;)Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    return-object p0
.end method

.method public static getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;
    .locals 2

    sget-object v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->x:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    if-nez v0, :cond_0

    const-class v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-direct {v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;-><init>()V

    sput-object v1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->x:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    :goto_0
    sget-object v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->x:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    return-object v0
.end method


# virtual methods
.method public OnFlayCallback(Z)V
    .locals 3

    sget-object v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isSuccess : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "OnFlayCallback"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c()V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;->OnFlayCallback(Z)V

    return-void
.end method

.method public final a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;Z",
            "Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;",
            ")I"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v6, p2

    if-eqz p1, :cond_3

    if-nez v6, :cond_0

    goto :goto_1

    .line 13
    :cond_0
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v8, 0x0

    if-eqz v0, :cond_1

    return v8

    .line 14
    :cond_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    move v13, v2

    goto :goto_0

    :cond_2
    move v13, v8

    .line 15
    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-interface {v6, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_filebrowse/bean/FileStruct;

    .line 16
    invoke-virtual {v1, v2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Z)V

    .line 17
    iget-object v9, v1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a:Lcom/jieli/jl_filebrowse/interfaces/FileBrowseOperator;

    invoke-virtual/range {p1 .. p1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getDevHandler()I

    move-result v10

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isFile()Z

    move-result v2

    int-to-byte v11, v2

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result v12

    new-instance v15, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;

    move-object/from16 v5, p1

    move/from16 v7, p3

    move-object/from16 v3, p4

    move-object v2, v0

    move v4, v13

    move-object v0, v15

    invoke-direct/range {v0 .. v7}, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;-><init>(Lcom/jieli/jl_filebrowse/FileBrowseManager;Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;ZLcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;Z)V

    move v14, v7

    invoke-interface/range {v9 .. v15}, Lcom/jieli/jl_filebrowse/interfaces/FileBrowseOperator;->deleteFile(IBIZZLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    return v8

    :cond_3
    :goto_1
    const/16 v0, 0x1001

    return v0
.end method

.method public final a(Lcom/jieli/jl_filebrowse/bean/Folder;)Lcom/jieli/jl_filebrowse/bean/Folder;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 40
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->clean()V

    .line 41
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/File;->getParent()Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v0

    :goto_0
    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    if-eqz p1, :cond_1

    .line 42
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->clean()V

    .line 43
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/File;->getParent()Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v0

    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/Folder;->clean()V

    return-object v0
.end method

.method public final a(Lcom/jieli/jl_filebrowse/bean/Folder;Ljava/lang/String;)Lcom/jieli/jl_filebrowse/bean/Folder;
    .locals 3

    if-eqz p1, :cond_5

    if-eqz p2, :cond_5

    .line 45
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 46
    :cond_0
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 47
    invoke-virtual {p2, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_4

    .line 48
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 49
    invoke-virtual {p2, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 50
    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 51
    array-length v1, v0

    if-nez v1, :cond_2

    const/4 v0, 0x1

    .line 52
    new-array v0, v0, [Ljava/lang/String;

    .line 53
    aput-object p2, v0, v2

    .line 54
    :cond_2
    array-length p2, v0

    :goto_0
    if-ge v2, p2, :cond_4

    aget-object v1, v0, v2

    .line 55
    invoke-virtual {p1, v1}, Lcom/jieli/jl_filebrowse/bean/Folder;->findFolderByName(Ljava/lang/String;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    move-object p1, v1

    goto :goto_0

    :cond_4
    :goto_1
    return-object p1

    :cond_5
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(I)Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 3

    .line 11
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getSdCardBeans()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    .line 12
    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getIndex()I

    move-result v2

    if-ne p1, v2, :cond_0

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->isOnline()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    if-nez p1, :cond_0

    return-object v0

    .line 59
    :cond_0
    sget-object v1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->z:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 61
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "lrcCache"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->z:Ljava/lang/String;

    .line 63
    :cond_1
    new-instance p1, Ljava/io/File;

    sget-object v1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->z:Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 64
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_2

    .line 65
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-nez v1, :cond_2

    .line 66
    sget-object p1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    const-string v1, "getLrcCachePath"

    const-string v2, "can not create lrc cache path"

    invoke-static {p1, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 67
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/content/Context;Lcom/jieli/jl_filebrowse/bean/FileStruct;)Ljava/lang/String;
    .locals 1

    if-nez p2, :cond_0

    .line 57
    const-string p1, "lrc_Default"

    return-object p1

    .line 58
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    .line 18
    const-string p1, ""

    return-object p1

    .line 19
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-nez v0, :cond_1

    .line 20
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getIndex()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 21
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getIndex()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/jieli/jl_filebrowse/bean/Folder;I)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_filebrowse/bean/Folder;",
            "I)",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;"
        }
    .end annotation

    .line 22
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineStorage(Lcom/jieli/jl_filebrowse/bean/FileStruct;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object p1

    if-nez p1, :cond_0

    .line 23
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 24
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object p1

    if-nez p1, :cond_1

    .line 25
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 26
    :cond_1
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    .line 27
    invoke-virtual {p1, v1}, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinished(Z)Z

    move-result v1

    .line 28
    sget-object v2, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", offset = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", isLoadFinished = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "readCacheFiles"

    invoke-static {v2, v4, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_2

    if-lt v0, p2, :cond_2

    .line 29
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildFileStructs()Ljava/util/List;

    move-result-object p1

    add-int/lit8 p2, p2, -0x1

    add-int/2addr v0, p2

    invoke-interface {p1, p2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 30
    :cond_2
    iget v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->h:I

    add-int/2addr v1, p2

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_3

    .line 31
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 32
    :cond_3
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildFileStructs()Ljava/util/List;

    move-result-object p1

    add-int/lit8 p2, p2, -0x1

    iget v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->h:I

    add-int/2addr v0, p2

    invoke-interface {p1, p2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/jieli/jl_filebrowse/bean/FileStruct;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getDevIndex()B

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(I)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p0, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    if-eqz v0, :cond_4

    .line 38
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/bean/Folder;->removeChild(I)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    .line 39
    :cond_3
    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/File;->getParent()Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v0

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method public final synthetic a(Lcom/jieli/jl_filebrowse/bean/PathData;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 1

    .line 8
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/PathData;->getRepeatTimes()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lcom/jieli/jl_filebrowse/bean/PathData;->setRepeatTimes(I)V

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/PathData;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->d:Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;->onLrcReadStop(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic a(Ljava/util/List;Z)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;->onFileReceiver(Ljava/util/List;)V

    .line 7
    iget-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    invoke-virtual {p1, p2}, Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;->onFileReadStop(Z)V

    return-void
.end method

.method public final a(Z)V
    .locals 0

    .line 10
    iput-boolean p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->j:Z

    return-void
.end method

.method public final a(Lcom/jieli/jl_filebrowse/bean/Folder;Lcom/jieli/jl_filebrowse/bean/FileStruct;)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineStorage(Lcom/jieli/jl_filebrowse/bean/FileStruct;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object p1

    if-nez p1, :cond_1

    return v0

    .line 34
    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object p1

    if-nez p1, :cond_2

    return v0

    .line 35
    :cond_2
    invoke-virtual {p1, p2}, Lcom/jieli/jl_filebrowse/bean/Folder;->isEndElement(Lcom/jieli/jl_filebrowse/bean/FileStruct;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public addFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->registerCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public addLrcReadObserver(Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadObserver;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->d:Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->registerCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public appenBrowse(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)I
    .locals 5

    const/16 v0, 0x1001

    if-eqz p1, :cond_7

    if-nez p2, :cond_0

    goto/16 :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0, p2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 p1, 0x4000

    return p1

    .line 2
    :cond_1
    invoke-virtual {p0, p2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v1

    const-string v2, "appenBrowse"

    if-nez v1, :cond_2

    .line 3
    sget-object p2, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No file found. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x4003

    return p1

    .line 4
    :cond_2
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildFile(I)Lcom/jieli/jl_filebrowse/bean/File;

    move-result-object v3

    if-nez v3, :cond_3

    .line 5
    new-instance v3, Lcom/jieli/jl_filebrowse/bean/Folder;

    invoke-direct {v3, v1, p1}, Lcom/jieli/jl_filebrowse/bean/Folder;-><init>(Lcom/jieli/jl_filebrowse/bean/Folder;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V

    .line 6
    :cond_3
    invoke-virtual {v3}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isFile()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 7
    sget-object p2, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Target is not folder. "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0

    .line 8
    :cond_4
    check-cast v3, Lcom/jieli/jl_filebrowse/bean/Folder;

    .line 9
    invoke-virtual {v3}, Lcom/jieli/jl_filebrowse/bean/File;->getLevel()I

    move-result p1

    sget v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->MAX_FOLDER_LEVEL:I

    if-le p1, v0, :cond_5

    .line 10
    sget-object p1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Folders are too deep. limit level = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->MAX_FOLDER_LEVEL:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x4004

    return p1

    .line 11
    :cond_5
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isReading()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 12
    sget-object p1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    const-string p2, "Reading file data."

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x4001

    return p1

    .line 13
    :cond_6
    sget-object p1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->e:Ljava/util/Map;

    invoke-virtual {p0, p2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v3, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->listFiles(Lcom/jieli/jl_filebrowse/bean/Folder;I)I

    move-result v0

    if-eqz v0, :cond_7

    .line 16
    iget-object v4, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->e:Ljava/util/Map;

    invoke-virtual {p0, p2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v4, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "result = "

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", target = "

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ",\n cacheFolder = "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    :goto_0
    return v0
.end method

.method public appenBrowse(Lcom/jieli/jl_filebrowse/bean/Folder;)I
    .locals 2

    if-nez p1, :cond_0

    const/16 p1, 0x1001

    return p1

    .line 18
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getDevIndex()B

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(I)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 19
    invoke-virtual {p0, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/File;->getFileStruct()Lcom/jieli/jl_filebrowse/bean/FileStruct;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->appenBrowse(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)I

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/16 p1, 0x4000

    return p1
.end method

.method public final b()V
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->p:Landroid/os/Handler;

    const/16 v1, 0x1010

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method public final b(I)V
    .locals 3

    .line 3
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b()V

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->p:Landroid/os/Handler;

    const/16 v1, 0x1010

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    sget-wide v1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->WAITING_CMD_TIMEOUT:J

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public final b(Lcom/jieli/jl_filebrowse/bean/PathData;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 3

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iput-object p2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->k:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    .line 7
    iput-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->l:Lcom/jieli/jl_filebrowse/bean/PathData;

    .line 8
    sget-object v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "sendPathDataToDevice"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a:Lcom/jieli/jl_filebrowse/interfaces/FileBrowseOperator;

    invoke-static {p1}, Lcom/jieli/jl_filebrowse/FileBrowseUtil;->coverPathDataToCmd(Lcom/jieli/jl_filebrowse/bean/PathData;)[B

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;

    invoke-direct {v2, p0, p1, p2}, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;-><init>(Lcom/jieli/jl_filebrowse/FileBrowseManager;Lcom/jieli/jl_filebrowse/bean/PathData;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    invoke-interface {v0, p1, v1, v2}, Lcom/jieli/jl_filebrowse/interfaces/FileBrowseOperator;->sendPathDataCmd(Lcom/jieli/jl_filebrowse/bean/PathData;[BLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final b(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Z
    .locals 1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getIndex()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isOnline(I)Z

    move-result p1

    xor-int/2addr p1, v0

    return p1
.end method

.method public backBrowse(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)I
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->backBrowse(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Z)I

    move-result p1

    return p1
.end method

.method public backBrowse(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Z)I
    .locals 6

    if-nez p1, :cond_0

    const/16 p1, 0x1001

    return p1

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p1, 0x4000

    return p1

    .line 3
    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v0

    if-nez v0, :cond_2

    const/16 p1, 0x4003

    return p1

    .line 4
    :cond_2
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isReading()Z

    move-result v1

    const-string v2, "backBrowse"

    if-eqz v1, :cond_3

    .line 5
    sget-object p1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    const-string p2, "Reading file data."

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x4001

    return p1

    .line 6
    :cond_3
    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/File;->getParent()Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v1

    if-nez v1, :cond_4

    move-object v1, v0

    .line 7
    :cond_4
    sget-object v3, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v4, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->e:Ljava/util/Map;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x1

    .line 9
    invoke-virtual {p0, v1, v4, p2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->listFiles(Lcom/jieli/jl_filebrowse/bean/Folder;IZ)I

    move-result p2

    if-eqz p2, :cond_5

    .line 10
    iget-object v4, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->e:Ljava/util/Map;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v4, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "result = "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", target = "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n currentFolder = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, v2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    return p2
.end method

.method public final c()V
    .locals 2

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Z)V

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->f:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 4
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b()V

    .line 5
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 6
    iput-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->k:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    .line 7
    iput-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->l:Lcom/jieli/jl_filebrowse/bean/PathData;

    return-void
.end method

.method public cleanCache()V
    .locals 3

    .line 1
    sget-object v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    const-string v1, "cleanCache"

    const-string v2, "clear all"

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    .line 3
    invoke-virtual {p0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->cleanCache(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public cleanCache(Landroid/bluetooth/BluetoothDevice;)V
    .locals 4

    if-nez p1, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    sget-object v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "cleanCache"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 7
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 8
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_filebrowse/bean/Folder;

    if-nez v2, :cond_2

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {p0, v2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/Folder;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v2

    .line 10
    invoke-interface {v1, v2}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public cleanCache(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 4

    if-nez p1, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Ljava/lang/String;

    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->e:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_filebrowse/bean/Folder;

    if-nez v1, :cond_1

    :goto_0
    return-void

    .line 13
    :cond_1
    sget-object v2, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ",\n "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v3, "cleanCache"

    invoke-static {v2, v3, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/Folder;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object p1

    .line 15
    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->e:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public deleteFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;",
            "Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;",
            ")I"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->deleteFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I

    move-result p1

    return p1
.end method

.method public deleteFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;Z",
            "Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;",
            ")I"
        }
    .end annotation

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    .line 2
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p1, 0x4000

    return p1

    .line 4
    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isReading()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p1, 0x4001

    return p1

    .line 5
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, p1, v0, p3, p4}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I

    move-result p1

    return p1

    :cond_3
    :goto_0
    const/16 p1, 0x1001

    return p1
.end method

.method public deleteFile(Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;Z",
            "Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;",
            ")I"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 7
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_filebrowse/bean/FileStruct;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineStorage(Lcom/jieli/jl_filebrowse/bean/FileStruct;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0, v1, p2, p3}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->deleteFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/16 p1, 0x1001

    return p1
.end method

.method public formatDevice(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;)I
    .locals 3

    if-nez p1, :cond_0

    const/16 p1, 0x1001

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p1, 0x4000

    return p1

    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isReading()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p1, 0x4001

    return p1

    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Z)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a:Lcom/jieli/jl_filebrowse/interfaces/FileBrowseOperator;

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getDevHandler()I

    move-result v1

    new-instance v2, Lcom/jieli/jl_filebrowse/FileBrowseManager$2;

    invoke-direct {v2, p0, p1, p2}, Lcom/jieli/jl_filebrowse/FileBrowseManager$2;-><init>(Lcom/jieli/jl_filebrowse/FileBrowseManager;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    invoke-interface {v0, v1, v2}, Lcom/jieli/jl_filebrowse/interfaces/FileBrowseOperator;->formatDevice(ILcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    const/4 p1, 0x0

    return p1
.end method

.method public getCurrentFileStructs(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ")",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildFileStructs()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->e:Ljava/util/Map;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_filebrowse/bean/Folder;

    return-object p1
.end method

.method public getOnlineDev()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getSdCardBeans()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->isOnline()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getOnlineStorage(Lcom/jieli/jl_filebrowse/bean/FileStruct;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getDevIndex()B

    move-result p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(I)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object p1

    return-object p1
.end method

.method public getPageSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->h:I

    return v0
.end method

.method public getSdCardBeans()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->g:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public init(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->n:Z

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->i:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v0, Lcom/jieli/jl_rcsp/tool/filebrowse/LrcReadOperatorImpl;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/tool/filebrowse/LrcReadOperatorImpl;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->setLrcReadOperator(Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadOperator;)V

    new-instance v0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->setFileBrowseOperator(Lcom/jieli/jl_filebrowse/interfaces/FileBrowseOperator;)V

    new-instance v0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;

    invoke-direct {v0, p1, p0, p0}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;)V

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->o:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->n:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "It cannot be initialize morn than once!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isInit()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->n:Z

    return v0
.end method

.method public isOnline(I)Z
    .locals 3

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getSdCardBeans()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getIndex()I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->isOnline()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public isOpenLrcCache()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->u:Z

    return v0
.end method

.method public isReading()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->j:Z

    return v0
.end method

.method public listFiles(Lcom/jieli/jl_filebrowse/bean/Folder;I)I
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->listFiles(Lcom/jieli/jl_filebrowse/bean/Folder;IZ)I

    move-result p1

    return p1
.end method

.method public listFiles(Lcom/jieli/jl_filebrowse/bean/Folder;IZ)I
    .locals 7

    const/16 v0, 0x1001

    if-nez p1, :cond_0

    return v0

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineStorage(Lcom/jieli/jl_filebrowse/bean/FileStruct;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v1

    const-string v2, "listFiles"

    if-eqz v1, :cond_7

    .line 3
    invoke-virtual {p0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_0

    .line 4
    :cond_1
    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    if-nez v3, :cond_2

    .line 5
    sget-object p1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    const-string p2, "Wrong parameters."

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0

    .line 6
    :cond_2
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isReading()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    sget-object p1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    const-string p2, "Reading file data."

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x4001

    return p1

    .line 8
    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/Folder;I)Ljava/util/List;

    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 10
    sget-object v4, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", offset = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", cacheFiles size = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v2, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-lez v3, :cond_5

    if-eqz p3, :cond_4

    .line 11
    const-string p2, "callback cache file list."

    invoke-static {v4, v2, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sub-int/2addr v3, v6

    .line 12
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_filebrowse/bean/FileStruct;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/Folder;Lcom/jieli/jl_filebrowse/bean/FileStruct;)Z

    move-result p1

    .line 13
    iget-object p2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->p:Landroid/os/Handler;

    new-instance p3, Lcom/android/mltcode/paycertificationapi/O1X0O1iI;

    invoke-direct {p3, p0, v0, p1}, Lcom/android/mltcode/paycertificationapi/O1X0O1iI;-><init>(Lcom/jieli/jl_filebrowse/FileBrowseManager;Ljava/util/List;Z)V

    const-wide/16 v0, 0x12c

    invoke-virtual {p2, p3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    return v5

    :cond_5
    int-to-short p2, p2

    .line 14
    iget p3, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->h:I

    invoke-virtual {p1, v1, p2, p3}, Lcom/jieli/jl_filebrowse/bean/File;->convertPathData(Lcom/jieli/jl_filebrowse/bean/SDCardBean;SI)Lcom/jieli/jl_filebrowse/bean/PathData;

    move-result-object p1

    if-nez p1, :cond_6

    .line 15
    const-string p1, "File is not in storage."

    invoke-static {v4, v2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x4006

    return p1

    .line 16
    :cond_6
    invoke-virtual {p0, v6}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Z)V

    .line 17
    invoke-virtual {p0, p1, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/PathData;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return v5

    .line 18
    :cond_7
    :goto_0
    sget-object p1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "Storage[%s] is offline."

    invoke-static {p3, p2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x4000

    return p1
.end method

.method public loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)I
    .locals 4

    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p1, 0x4000

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object p1

    if-nez p1, :cond_1

    const/16 p1, 0x4003

    return p1

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinished(Z)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p1, 0x4002

    return p1

    :cond_2
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    sget-object v1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", offset = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "loadMore"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->listFiles(Lcom/jieli/jl_filebrowse/bean/Folder;I)I

    move-result p1

    return p1
.end method

.method public onBluetoothConnectionChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", status : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onBluetoothConnectionChange"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->cleanCache(Landroid/bluetooth/BluetoothDevice;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onFileDataReceive([B)V
    .locals 5

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isReading()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    sget-object v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    const-string v1, "onFileDataReceive"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    if-nez p1, :cond_1

    move v4, v3

    goto :goto_0

    :cond_1
    array-length v4, p1

    :goto_0
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(I)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->f:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    return-void
.end method

.method public onFileReadFailed(I)V
    .locals 5

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isReading()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->l:Lcom/jieli/jl_filebrowse/bean/PathData;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->k:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    sget-object v2, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "reason : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "+ "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "onFileReadFailed"

    invoke-static {v2, v4, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x3

    if-ne p1, v2, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/PathData;->getRepeatTimes()I

    move-result v2

    if-lez v2, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->p:Landroid/os/Handler;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X1I0iXXX;

    invoke-direct {v2, p0, v0, v1}, Lcom/android/mltcode/paycertificationapi/X1I0iXXX;-><init>(Lcom/jieli/jl_filebrowse/FileBrowseManager;Lcom/jieli/jl_filebrowse/bean/PathData;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    const-wide/16 v0, 0x1f4

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c()V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;->onFileReadFailed(I)V

    return-void
.end method

.method public onFileReadStart()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;->onFileReadStart()V

    return-void
.end method

.method public onFileReadStop(Z)V
    .locals 11

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isReading()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->k:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->l:Lcom/jieli/jl_filebrowse/bean/PathData;

    iget-object v2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->f:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    sget-object v3, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "isEnd = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, ", storage = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", data size = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v5, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "onFileReadStop"

    invoke-static {v3, v5, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a:Lcom/jieli/jl_filebrowse/interfaces/FileBrowseOperator;

    invoke-interface {v4}, Lcom/jieli/jl_filebrowse/interfaces/FileBrowseOperator;->dataHasPacket()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v2}, Lcom/jieli/jl_filebrowse/FileBrowseUtil;->parseDataHasPacket([B)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lcom/jieli/jl_filebrowse/FileBrowseUtil;->parseData([B)Ljava/util/List;

    move-result-object v2

    :goto_0
    iget-object v4, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->f:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->reset()V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v4

    if-nez v4, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "not found read folder. "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, v5, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c()V

    iget-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    const/16 v0, 0x4003

    invoke-virtual {p1, v0}, Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;->onFileReadFailed(I)V

    return-void

    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/jieli/jl_filebrowse/bean/FileStruct;

    if-nez v7, :cond_3

    goto :goto_1

    :cond_3
    sget-object v8, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, ""

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v5, v9}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isFile()Z

    move-result v8

    if-eqz v8, :cond_4

    new-instance v8, Lcom/jieli/jl_filebrowse/bean/RegFile;

    invoke-direct {v8, v4, v7}, Lcom/jieli/jl_filebrowse/bean/RegFile;-><init>(Lcom/jieli/jl_filebrowse/bean/Folder;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V

    goto :goto_2

    :cond_4
    new-instance v8, Lcom/jieli/jl_filebrowse/bean/Folder;

    invoke-direct {v8, v4, v7}, Lcom/jieli/jl_filebrowse/bean/Folder;-><init>(Lcom/jieli/jl_filebrowse/bean/Folder;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V

    :goto_2
    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_6

    const/4 v6, 0x0

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/jieli/jl_filebrowse/bean/File;

    invoke-virtual {v6}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getDevIndex()B

    move-result v6

    invoke-virtual {v4}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getDevIndex()B

    move-result v7

    if-eq v6, v7, :cond_6

    sget-object p1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    const-string v2, "File data does not match."

    invoke-static {p1, v5, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/PathData;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void

    :cond_6
    if-nez p1, :cond_7

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 p1, 0x1

    :cond_7
    invoke-virtual {v4, v3}, Lcom/jieli/jl_filebrowse/bean/Folder;->addChild(Ljava/util/List;)V

    invoke-virtual {v4, p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->setLoadFinished(Z)V

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c()V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    invoke-virtual {v0, v2}, Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;->onFileReceiver(Ljava/util/List;)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;->onFileReadStop(Z)V

    return-void
.end method

.method public onFileStructureChange(Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;)V
    .locals 5

    if-nez p1, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineDev()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getDevHandler()I

    move-result v2

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->getDevHandle()I

    move-result v3

    if-ne v2, v3, :cond_2

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getDevHandler()I

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->getDevHandle()I

    move-result v2

    if-eq v0, v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/File;->getParent()Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v1

    if-eqz v1, :cond_6

    move-object v0, v1

    :cond_6
    if-nez v1, :cond_5

    sget-object v1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ",\n "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "onFileStructureChange"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->getFilePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/Folder;Ljava/lang/String;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "op = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->getOp()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", targetFolder = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->getOp()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_9

    const/4 p1, 0x2

    if-eq v1, p1, :cond_8

    goto :goto_1

    :cond_8
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->setLoadFinished(Z)V

    return-void

    :cond_9
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->getCluster()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->removeChild(I)Z

    :cond_a
    :goto_1
    return-void
.end method

.method public onLrcDataReceive([B)V
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->q:[B

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->r:I

    array-length v2, p1

    add-int/2addr v2, v1

    array-length v3, v0

    const/4 v4, 0x0

    if-le v2, v3, :cond_0

    array-length v2, v0

    mul-int/lit8 v2, v2, 0x2

    new-array v2, v2, [B

    invoke-static {v0, v4, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->q:[B

    :cond_0
    sget-object v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "lrcBuffer ---> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->q:[B

    array-length v3, v2

    invoke-static {v2, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([BI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onLrcDataReceive"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->q:[B

    iget v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->r:I

    array-length v2, p1

    const/4 v3, 0x3

    sub-int/2addr v2, v3

    invoke-static {p1, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->r:I

    array-length v1, p1

    sub-int/2addr v1, v3

    add-int/2addr v0, v1

    iput v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->r:I

    aget-byte p1, p1, v4

    const/16 v0, 0xff

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->onLrcReadStop()V

    :cond_1
    return-void
.end method

.method public onLrcReadFailed(I)V
    .locals 3

    sget-object v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reason : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onLrcReadFailed"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->r:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->q:[B

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->d:Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;->onLrcReadFailed(I)V

    return-void
.end method

.method public onLrcReadStart()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->r:I

    const/16 v0, 0xc00

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->q:[B

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->d:Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;->onLrcReadStart()V

    return-void
.end method

.method public onLrcReadStop()V
    .locals 6

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->q:[B

    const/4 v1, -0x1

    if-eqz v0, :cond_7

    iget v2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->r:I

    const/4 v3, 0x5

    if-ge v2, v3, :cond_0

    goto/16 :goto_7

    :cond_0
    new-array v3, v2, [B

    const/4 v4, 0x0

    invoke-static {v0, v4, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->t:Lcom/jieli/jl_filebrowse/interfaces/LrcDecoder;

    if-eqz v0, :cond_1

    invoke-interface {v0, v3}, Lcom/jieli/jl_filebrowse/interfaces/LrcDecoder;->decode([B)[B

    move-result-object v3

    :cond_1
    aget-byte v0, v3, v4

    if-ne v0, v1, :cond_2

    const-string v0, "utf_16le"

    goto :goto_0

    :cond_2
    const/4 v2, -0x2

    const/4 v5, 0x1

    if-ne v0, v2, :cond_3

    aget-byte v2, v3, v5

    if-ne v2, v1, :cond_3

    const-string v0, "utf_16be"

    goto :goto_0

    :cond_3
    const/16 v1, -0x11

    if-ne v0, v1, :cond_4

    aget-byte v0, v3, v5

    const/16 v1, -0x45

    if-ne v0, v1, :cond_4

    const/4 v0, 0x2

    aget-byte v0, v3, v0

    const/16 v1, -0x41

    if-ne v0, v1, :cond_4

    const-string v0, "utf-8"

    goto :goto_0

    :cond_4
    const-string v0, "gbk"

    :goto_0
    :try_start_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v3, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    const/4 v0, 0x0

    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->m:Landroid/content/Context;

    iget-object v5, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->s:Lcom/jieli/jl_filebrowse/bean/FileStruct;

    invoke-virtual {p0, v2, v5}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Landroid/content/Context;Lcom/jieli/jl_filebrowse/bean/FileStruct;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1, v3}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iput v4, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->r:I

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->q:[B

    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->m:Landroid/content/Context;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->s:Lcom/jieli/jl_filebrowse/bean/FileStruct;

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Landroid/content/Context;Lcom/jieli/jl_filebrowse/bean/FileStruct;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v2

    goto :goto_5

    :catch_2
    move-exception v2

    goto :goto_3

    :catchall_1
    move-exception v1

    move-object v2, v1

    move-object v1, v0

    goto :goto_5

    :catch_3
    move-exception v2

    move-object v1, v0

    :goto_3
    :try_start_4
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    const/16 v2, 0x4005

    invoke-virtual {p0, v2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->onLrcReadFailed(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    iput v4, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->r:I

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->q:[B

    if-eqz v1, :cond_5

    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_4

    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_5
    :goto_4
    return-void

    :goto_5
    iput v4, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->r:I

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->q:[B

    if-eqz v1, :cond_6

    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_6

    :catch_5
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_6
    :goto_6
    throw v2

    :cond_7
    :goto_7
    invoke-virtual {p0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->onLrcReadFailed(I)V

    return-void
.end method

.method public onSdCardChange(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->k:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->g:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->isOnline()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->cleanCache(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->p:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isReading()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x4000

    invoke-virtual {p0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->onFileReadFailed(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->e:Ljava/util/Map;

    invoke-virtual {p0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getIndex()I

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_filebrowse/bean/File;->createRootFolder(I)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineDev()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;->onSdCardStatusChange(Ljava/util/List;)V

    return-void
.end method

.method public playFile(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)I
    .locals 2

    const/16 v0, 0x1001

    if-eqz p1, :cond_4

    if-nez p2, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0, p2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 p1, 0x4000

    return p1

    .line 2
    :cond_1
    invoke-virtual {p0, p2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object p2

    if-nez p2, :cond_2

    const/16 p1, 0x4003

    return p1

    .line 3
    :cond_2
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildFile(I)Lcom/jieli/jl_filebrowse/bean/File;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 4
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/File;->isFolder()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_0

    .line 5
    :cond_3
    check-cast p1, Lcom/jieli/jl_filebrowse/bean/RegFile;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->playFile(Lcom/jieli/jl_filebrowse/bean/RegFile;)I

    move-result p1

    return p1

    :cond_4
    :goto_0
    return v0
.end method

.method public playFile(Lcom/jieli/jl_filebrowse/bean/RegFile;)I
    .locals 4

    if-nez p1, :cond_0

    const/16 p1, 0x1001

    return p1

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineStorage(Lcom/jieli/jl_filebrowse/bean/FileStruct;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {p0, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isReading()Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 p1, 0x4001

    return p1

    .line 9
    :cond_2
    sget-object v1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "playFile"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 10
    invoke-virtual {p0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Z)V

    .line 11
    iget v2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->h:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/jieli/jl_filebrowse/bean/File;->convertPathData(Lcom/jieli/jl_filebrowse/bean/SDCardBean;SI)Lcom/jieli/jl_filebrowse/bean/PathData;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/PathData;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_0
    const/16 p1, 0x4000

    return p1
.end method

.method public release()V
    .locals 3

    sget-object v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    const-string v1, "release"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->n:Z

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->i:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->i:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->o:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c()V

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->cleanCache()V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->release()V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->d:Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->release()V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    sput-object v0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->x:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    return-void
.end method

.method public removeFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c:Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->unregisterCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public removeLrcReadObserver(Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadObserver;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->d:Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->unregisterCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public setFileBrowseOperator(Lcom/jieli/jl_filebrowse/interfaces/FileBrowseOperator;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a:Lcom/jieli/jl_filebrowse/interfaces/FileBrowseOperator;

    return-void
.end method

.method public setLrcDecoder(Lcom/jieli/jl_filebrowse/interfaces/LrcDecoder;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->t:Lcom/jieli/jl_filebrowse/interfaces/LrcDecoder;

    return-void
.end method

.method public setLrcReadOperator(Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadOperator;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b:Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadOperator;

    return-void
.end method

.method public setOpenLrcCache(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->u:Z

    return-void
.end method

.method public setPageSize(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->h:I

    return-void
.end method

.method public startLrcRead(Landroid/content/Context;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b:Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadOperator;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Landroid/content/Context;Lcom/jieli/jl_filebrowse/bean/FileStruct;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/jieli/jl_filebrowse/FileBrowseManager;->v:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "path : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "startLrcRead"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isOpenLrcCache()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_1
    iput-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->m:Landroid/content/Context;

    iput-object p2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->s:Lcom/jieli/jl_filebrowse/bean/FileStruct;

    iget-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b:Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadOperator;

    new-instance p2, Lcom/jieli/jl_filebrowse/FileBrowseManager$5;

    invoke-direct {p2, p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager$5;-><init>(Lcom/jieli/jl_filebrowse/FileBrowseManager;)V

    invoke-interface {p1, p2}, Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadOperator;->startLrcRead(Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    :cond_2
    return-void
.end method
