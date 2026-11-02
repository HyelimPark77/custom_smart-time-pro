.class public Lcom/jieli/jl_fatfs/FatFileSystem;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final u:Ljava/lang/String; = "FatFileSystem"

.field public static final v:[Ljava/lang/String;


# instance fields
.field public volatile a:Z

.field public volatile b:J

.field public final c:Ljava/util/concurrent/ExecutorService;

.field public final d:Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;

.field public final e:Landroid/os/Handler;

.field public final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;>;"
        }
    .end annotation
.end field

.field public g:Ljava/lang/String;

.field public h:[B

.field public i:I

.field public j:S

.field public k:I

.field public l:[B

.field public m:I

.field public n:[B

.field public o:I

.field public final p:Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;

.field public q:Lcom/jieli/jl_fatfs/model/FatOpParam;

.field public r:Lcom/jieli/jl_fatfs/tool/PackResFormat;

.field public s:Lcom/google/gson/Gson;

.field public final t:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    :try_start_0
    const-string v0, "jl_fatfs"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    const-string v0, "FONT"

    const-string v1, "SIDEBAR"

    const-string v2, "JL"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/jieli/jl_fatfs/FatFileSystem;->v:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(III[Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->e:Landroid/os/Handler;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->f:Ljava/util/Map;

    const-string v1, "/"

    iput-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->g:Ljava/lang/String;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->h:[B

    const/4 v3, 0x0

    iput v3, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->i:I

    iput-short v3, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->j:S

    iput-object v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->n:[B

    iput v3, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->o:I

    iput-object p4, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->t:[Ljava/lang/String;

    iput-object p5, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->d:Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;

    iput-object p6, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->p:Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;

    if-eqz p5, :cond_3

    if-le p1, p2, :cond_0

    move p1, p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_fatfs/FatFileSystem;->libInit(II)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    iget-wide p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    const-wide/16 p4, 0x0

    cmp-long p1, p1, p4

    if-eqz p1, :cond_2

    invoke-virtual {p0, v3}, Lcom/jieli/jl_fatfs/FatFileSystem;->a(Z)V

    iget-wide p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_fatfs/FatFileSystem;->updateSysStatus(JI)V

    if-eqz p3, :cond_1

    if-eqz p7, :cond_1

    new-instance p1, Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-direct {p1}, Lcom/jieli/jl_fatfs/model/FatOpParam;-><init>()V

    const/16 p2, 0xff

    invoke-virtual {p1, p2}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setOp(I)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setFilePath(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object p1

    const-wide/16 p4, 0x2000

    invoke-virtual {p1, p4, p5}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setTotalSize(J)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object p1

    invoke-virtual {p1, p7}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setProgressListener(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    :cond_1
    new-instance p1, Lcom/android/mltcode/paycertificationapi/IIXOXX11;

    invoke-direct {p1, p0, p3}, Lcom/android/mltcode/paycertificationapi/IIXOXX11;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;I)V

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "init lib failed."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "IBluetoothCtrl cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;I)V
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;->onResult(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;J)V
    .locals 0

    if-eqz p0, :cond_0

    .line 31
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;->onResult(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;Ljava/util/ArrayList;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 28
    invoke-interface {p0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;->onResult(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;[B)V
    .locals 0

    .line 34
    invoke-interface {p0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;->onResult(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;[B)V
    .locals 0

    if-eqz p0, :cond_0

    .line 4
    invoke-interface {p0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;->onResult(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static isIgnoreFile(Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    sget-object v1, Lcom/jieli/jl_fatfs/FatFileSystem;->v:[Ljava/lang/String;

    if-eqz v1, :cond_2

    array-length v2, v1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    array-length v2, v1

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    invoke-virtual {v4, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v0
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 45
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 46
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_fatfs/model/FatFile;

    .line 48
    invoke-virtual {v1}, Lcom/jieli/jl_fatfs/model/FatFile;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/jieli/jl_fatfs/FatFileSystem;->isIgnoreFile(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    return-object p1
.end method

.method public final a()V
    .locals 3

    .line 36
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->e:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXOX10;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XXOX10;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 37
    sget-object v0, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "callbackInitOk"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 39
    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    :cond_0
    return-void
.end method

.method public final a(F)V
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->e:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1IO1XI00;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/I1IO1XI00;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;F)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a(I)V
    .locals 4

    .line 40
    sget-object v0, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "code : %d(0x%X), %s"

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "callbackInitFailed"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-eqz v0, :cond_0

    .line 42
    invoke-virtual {p0, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->e:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O1IiI1;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/O1IiI1;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final synthetic a(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V
    .locals 4

    .line 29
    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->d()J

    move-result-wide v0

    .line 30
    iget-object v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->e:Landroid/os/Handler;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/O1Ii0i0;

    invoke-direct {v3, p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/O1Ii0i0;-><init>(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;J)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final synthetic a(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V
    .locals 2

    .line 32
    invoke-virtual {p0, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->getFileHead(Ljava/lang/String;)[B

    move-result-object p1

    if-eqz p2, :cond_0

    .line 33
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->e:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XX01111iO;

    invoke-direct {v1, p2, p1}, Lcom/android/mltcode/paycertificationapi/XX01111iO;-><init>(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;[B)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .line 44
    iput-boolean p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->a:Z

    return-void
.end method

.method public final synthetic a(ZLjava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-nez v0, :cond_0

    const/16 p1, 0x1001

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getFilePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->readFileData(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x4

    if-eqz v0, :cond_b

    .line 5
    array-length v2, v0

    if-nez v2, :cond_1

    goto/16 :goto_2

    .line 6
    :cond_1
    iget-object v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->d:Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;

    invoke-interface {v2}, Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    if-nez v2, :cond_2

    const/16 p1, 0x2000

    .line 7
    invoke-virtual {p0, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    return-void

    .line 8
    :cond_2
    iget-object v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    array-length v3, v0

    add-int/lit16 v3, v3, 0x4000

    int-to-long v3, v3

    invoke-virtual {v2, v3, v4}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setTotalSize(J)Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-nez p1, :cond_4

    .line 9
    iget-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {p1}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getFilePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->isMatchVersion(Ljava/lang/String;[B)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    const/16 p1, 0x4200

    .line 10
    invoke-virtual {p0, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    return-void

    .line 11
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->g:Ljava/lang/String;

    iget-object v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {v2}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getFilePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFilePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->getFatFileMsg(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object v2

    .line 13
    array-length v3, v0

    invoke-virtual {p0, v3}, Lcom/jieli/jl_fatfs/FatFileSystem;->d(I)Z

    move-result v3

    const/4 v4, 0x0

    const-string v5, "createFatFile"

    if-eqz v3, :cond_9

    .line 14
    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b()V

    if-eqz v2, :cond_5

    .line 15
    invoke-virtual {p0, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->deleteFile(Ljava/lang/String;)I

    move-result p2

    .line 16
    sget-object p3, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteFile ---> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", fatFilePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v5, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    const/4 p2, 0x0

    :goto_1
    if-eqz p2, :cond_6

    if-eq p2, v1, :cond_6

    const/4 p3, 0x5

    if-ne p2, p3, :cond_7

    .line 17
    :cond_6
    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->createNewFile(Ljava/lang/String;[B)I

    move-result p2

    .line 18
    :cond_7
    sget-object p1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "createNewFile ---> "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, v5, p3}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    invoke-virtual {p0, p2}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    if-nez p2, :cond_8

    .line 20
    const-string p1, "/"

    invoke-virtual {p0, p1, v4}, Lcom/jieli/jl_fatfs/FatFileSystem;->listFatDir(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V

    :cond_8
    return-void

    :cond_9
    if-eqz v2, :cond_a

    .line 21
    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->d()J

    move-result-wide v6

    invoke-virtual {v2}, Lcom/jieli/jl_fatfs/model/FatFile;->getSize()J

    move-result-wide v1

    add-long/2addr v6, v1

    .line 22
    sget-object p1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "freeSize = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", file data size = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v5, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    array-length p1, v0

    int-to-long v0, p1

    cmp-long p1, v6, v0

    if-ltz p1, :cond_a

    .line 24
    iput-object v4, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    .line 25
    invoke-virtual {p0, p2, p3}, Lcom/jieli/jl_fatfs/FatFileSystem;->replaceFatFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    return-void

    :cond_a
    const/16 p1, 0x14

    .line 26
    invoke-virtual {p0, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    return-void

    .line 27
    :cond_b
    :goto_2
    invoke-virtual {p0, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 50
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 51
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public final b()V
    .locals 2

    .line 14
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setSumFileDataLen(I)Lcom/jieli/jl_fatfs/model/FatOpParam;

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->e:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XOOXiii0I;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XOOXiii0I;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final synthetic b(F)V
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getProgressListener()Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 18
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getProgressListener()Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onProgress(F)V

    :cond_0
    return-void
.end method

.method public final b(I)V
    .locals 2

    .line 19
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->e:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OXOIX0I;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/OXOIX0I;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final synthetic b(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->mountDevice(J)I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    sget-object v1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    const-string v2, "mount"

    const-string v3, "FatFs mount ok."

    invoke-static {v1, v2, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->e:Landroid/os/Handler;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/O010;

    invoke-direct {v2, p1, v0}, Lcom/android/mltcode/paycertificationapi/O010;-><init>(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final synthetic b(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V
    .locals 4

    .line 5
    invoke-virtual {p0, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->listDir(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->g:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 7
    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->g:Ljava/lang/String;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->g:Ljava/lang/String;

    goto :goto_0

    .line 9
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->g:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->g:Ljava/lang/String;

    .line 10
    :cond_1
    :goto_0
    sget-object p1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "put list in cache. curBrowsePath = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", fatFiles size = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "listFatDir"

    invoke-static {p1, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->f:Ljava/util/Map;

    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->g:Ljava/lang/String;

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    :cond_2
    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->a(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    .line 13
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->e:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iIO0IX01;

    invoke-direct {v1, p2, p1}, Lcom/android/mltcode/paycertificationapi/iIO0IX01;-><init>(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final c(I)F
    .locals 4

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getTotalSize()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getSumFileDataLen()I

    move-result v0

    add-int/2addr v0, p1

    .line 6
    iget-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setSumFileDataLen(I)Lcom/jieli/jl_fatfs/model/FatOpParam;

    int-to-float p1, v0

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr p1, v0

    .line 7
    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {v1}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getTotalSize()J

    move-result-wide v1

    long-to-float v1, v1

    div-float/2addr p1, v1

    cmpl-float v1, p1, v0

    if-lez v1, :cond_1

    return v0

    :cond_1
    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c()Lcom/google/gson/Gson;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->s:Lcom/google/gson/Gson;

    if-nez v0, :cond_0

    .line 9
    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->s:Lcom/google/gson/Gson;

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->s:Lcom/google/gson/Gson;

    return-object v0
.end method

.method public final synthetic c(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->openFile(Ljava/lang/String;)[B

    move-result-object p1

    .line 2
    sget-object v0, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "file data : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "openFatFile"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->e:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iOIX1X;

    invoke-direct {v1, p2, p1}, Lcom/android/mltcode/paycertificationapi/iOIX1X;-><init>(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;[B)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public callbackProgress(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->c(I)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->a(F)V

    :cond_0
    iget v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->i:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->i:I

    iget v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->k:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->k:I

    iget v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->m:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->m:I

    return-void
.end method

.method public createFatFile(Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 2

    iget-boolean v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->a:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "An operation is in progress. "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "createFatFile"

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_3

    const/16 p1, 0x1100

    invoke-interface {p3, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    return-void

    :cond_1
    new-instance v0, Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-direct {v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setOp(I)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setFilePath(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setProgressListener(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IIiX1O;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/android/mltcode/paycertificationapi/IIiX1O;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;ZLjava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_2
    :goto_0
    if-eqz p3, :cond_3

    const/16 p1, 0x16

    invoke-interface {p3, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_3
    return-void
.end method

.method public native createNewFile(Ljava/lang/String;[B)I
.end method

.method public createReadBuffer(I)V
    .locals 0

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->n:[B

    const/4 p1, 0x0

    iput p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->o:I

    return-void
.end method

.method public final d()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->getFreeSize()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x1000

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public final d(I)Z
    .locals 5

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->d()J

    move-result-wide v0

    .line 3
    sget-object v2, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "fatFsFreeSize = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ", dataLen = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "hasEnoughSpace"

    invoke-static {v2, v4, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    int-to-long v2, p1

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public deleteFatFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 2

    iget-boolean v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->a:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is in progress. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "deleteFatFile"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_3

    const/16 p1, 0x1100

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    return-void

    :cond_1
    new-instance v0, Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-direct {v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;-><init>()V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setOp(I)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setFilePath(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setProgressListener(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object p1

    const-wide/16 v0, 0x4000

    invoke-virtual {p1, v0, v1}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setTotalSize(J)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    iget-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/iiIX0IOI;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/iiIX0IOI;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    const/16 p1, 0x16

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_3
    return-void
.end method

.method public native deleteFile(Ljava/lang/String;)I
.end method

.method public destroy()V
    .locals 4

    sget-object v0, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    const-string v1, "destroy"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->j()V

    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->i()V

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->r:Lcom/jieli/jl_fatfs/tool/PackResFormat;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/tool/PackResFormat;->destroy()V

    iput-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->r:Lcom/jieli/jl_fatfs/tool/PackResFormat;

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->d:Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;

    invoke-interface {v0}, Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;->release()V

    iget-wide v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    invoke-virtual {p0, v2, v3}, Lcom/jieli/jl_fatfs/FatFileSystem;->libDestroy(J)V

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    iput-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->s:Lcom/google/gson/Gson;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->a(Z)V

    return-void
.end method

.method public final synthetic e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->p:Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;->onInitOk()V

    :cond_0
    return-void
.end method

.method public final synthetic e(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->p:Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;->onInitFailed(I)V

    :cond_0
    return-void
.end method

.method public final synthetic f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getProgressListener()Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getProgressListener()Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {v1}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getFilePath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStart(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final synthetic f(I)V
    .locals 3

    .line 4
    sget-object v0, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "result : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "callbackStop"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getProgressListener()Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->j()V

    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-eqz v0, :cond_0

    .line 9
    invoke-static {p1}, Lcom/jieli/jl_rcsp/constant/WatchError;->fatfsToWatchErr(I)I

    move-result p1

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    return-void
.end method

.method public final synthetic g()V
    .locals 4

    .line 19
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-nez v0, :cond_0

    const/16 v0, 0x1001

    .line 20
    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->d:Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;

    invoke-interface {v0}, Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-nez v0, :cond_1

    const/16 v0, 0x2000

    .line 22
    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    return-void

    .line 23
    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b()V

    .line 24
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getFilePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->deleteFile(Ljava/lang/String;)I

    move-result v0

    .line 25
    sget-object v1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteFile ---> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", FilePath : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {v3}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getFilePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "deleteFatFile"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    if-nez v0, :cond_2

    .line 27
    const-string v0, "/"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->listFatDir(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V

    :cond_2
    return-void
.end method

.method public final synthetic g(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b()V

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->initDiskOp()I

    move-result v0

    const-string v1, "init"

    if-nez v0, :cond_3

    .line 3
    sget-object v0, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    const-string v2, "FatFs init ok."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x64

    .line 4
    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 6
    :goto_0
    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->updateSysStatus(I)V

    .line 7
    :cond_0
    iget-wide v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    invoke-virtual {p0, v2, v3}, Lcom/jieli/jl_fatfs/FatFileSystem;->mountDevice(J)I

    move-result p1

    if-nez p1, :cond_1

    const/4 v0, 0x1

    .line 8
    :cond_1
    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->a(Z)V

    .line 9
    iget-boolean v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->a:Z

    if-eqz v0, :cond_2

    .line 10
    sget-object p1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    const-string v0, "FatFs mount ok."

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->a()V

    .line 12
    const-string p1, "/"

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->listFatDir(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V

    .line 13
    new-instance p1, Lcom/jieli/jl_fatfs/tool/PackResFormat;

    invoke-direct {p1}, Lcom/jieli/jl_fatfs/tool/PackResFormat;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->r:Lcom/jieli/jl_fatfs/tool/PackResFormat;

    .line 14
    new-instance p1, Lcom/google/gson/GsonBuilder;

    invoke-direct {p1}, Lcom/google/gson/GsonBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->s:Lcom/google/gson/Gson;

    goto :goto_1

    .line 15
    :cond_2
    sget-object v0, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FatFs mount failed. res = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p0, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->a(I)V

    :goto_1
    return-void

    .line 17
    :cond_3
    sget-object p1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FatFs init error. ret = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->a(I)V

    return-void
.end method

.method public getCrc16()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->j:S

    return v0
.end method

.method public getCurBrowsePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getFatFileMsg(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatFile;
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    sget-object v1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "filePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getFatFileMsg"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "/"

    invoke-virtual {p1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1

    return-object v0

    :cond_1
    if-lez v4, :cond_2

    const/4 v5, 0x0

    invoke-virtual {p1, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_2
    move-object v4, v2

    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "key = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v3, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->f:Ljava/util/Map;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->f:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    :cond_3
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_fatfs/model/FatFile;

    sget-object v4, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v3, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/jieli/jl_fatfs/model/FatFile;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    move-object v0, v2

    :cond_5
    sget-object p1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fatFile = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v3, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_1
    return-object v0
.end method

.method public getFatFsFreeSize(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O1IiO1I;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/O1IiO1I;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;->onResult(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public native getFileHead(Ljava/lang/String;)[B
.end method

.method public getFileHeadData(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener<",
            "[B>;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Ii0O0iIXX;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/Ii0O0iIXX;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;->onResult(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public getFlagStatus()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->getFlagStatus(J)I

    move-result v0

    return v0
.end method

.method public native getFlagStatus(J)I
.end method

.method public native getFreeSize()I
.end method

.method public getLeftDevSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->k:I

    return v0
.end method

.method public getNeedSendLeftData()[B
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->l:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    array-length v1, v0

    iget v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->m:I

    sub-int/2addr v1, v2

    new-array v3, v1, [B

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v3
.end method

.method public getNeedWriteData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->l:[B

    if-eqz v0, :cond_0

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getReadBuffer()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->n:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public getReadLeftSize()I
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->n:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    array-length v0, v0

    iget v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->o:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getReadStatus()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->getReadStatus(J)I

    move-result v0

    return v0
.end method

.method public native getReadStatus(J)I
.end method

.method public getWriteLeftData()[B
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->h:[B

    array-length v1, v0

    iget v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->i:I

    sub-int/2addr v1, v2

    new-array v3, v1, [B

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v3
.end method

.method public getWriteStatus()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->getWriteStatus(J)I

    move-result v0

    return v0
.end method

.method public native getWriteStatus(J)I
.end method

.method public final synthetic h()V
    .locals 7

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-nez v0, :cond_0

    const/16 v0, 0x1001

    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getFilePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->readFileData(Ljava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_5

    array-length v1, v0

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->d:Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;

    invoke-interface {v1}, Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    if-nez v1, :cond_2

    const/16 v0, 0x2000

    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    array-length v2, v0

    const v3, 0x8000

    add-int/2addr v2, v3

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setTotalSize(J)Lcom/jieli/jl_fatfs/model/FatOpParam;

    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->g:Ljava/lang/String;

    iget-object v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {v2}, Lcom/jieli/jl_fatfs/model/FatOpParam;->getFilePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFilePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    array-length v2, v0

    invoke-virtual {p0, v2}, Lcom/jieli/jl_fatfs/FatFileSystem;->d(I)Z

    move-result v2

    const-string v3, "replaceFatFile"

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b()V

    invoke-virtual {p0, v1, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->replaceFatFile(Ljava/lang/String;[B)I

    move-result v0

    sget-object v1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "replaceFatFile ---> "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b()V

    invoke-virtual {p0, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->deleteFile(Ljava/lang/String;)I

    move-result v2

    sget-object v4, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "deleteFile ---> "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v3, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_4

    invoke-virtual {p0, v2}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    return-void

    :cond_4
    invoke-virtual {p0, v1, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->createNewFile(Ljava/lang/String;[B)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createNewFile ---> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v3, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    return-void

    :cond_5
    :goto_0
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->b(I)V

    return-void
.end method

.method public final i()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->n:[B

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->o:I

    return-void
.end method

.method public native initDiskOp()I
.end method

.method public isMatchVersion(Ljava/lang/String;[B)Z
    .locals 9

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->getJsonFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->r:Lcom/jieli/jl_fatfs/tool/PackResFormat;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    if-eqz v0, :cond_7

    if-eqz p2, :cond_7

    array-length v1, p2

    if-nez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    sget-object v1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "filePath = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", jsonFileName = "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", file size = "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p2

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v3, "isMatchVersion"

    invoke-static {v1, v3, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->r:Lcom/jieli/jl_fatfs/tool/PackResFormat;

    invoke-virtual {p1, p2, v0}, Lcom/jieli/jl_fatfs/tool/PackResFormat;->getFileData([BLjava/lang/String;)[B

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "data = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", text = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_1

    const-string v0, ""

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, v3, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_2

    return v2

    :cond_2
    :try_start_0
    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->c()Lcom/google/gson/Gson;

    move-result-object p2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-class v0, Lcom/jieli/jl_fatfs/model/FileExtMsg;

    invoke-virtual {p2, p1, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_fatfs/model/FileExtMsg;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "fileExtMsg = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, v3, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_3

    return v2

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "matchVersions = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->t:[Ljava/lang/String;

    if-nez v0, :cond_4

    const-string v0, "null"

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_4
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, v3, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->t:[Ljava/lang/String;

    const/4 v0, 0x1

    if-eqz p2, :cond_6

    array-length v1, p2

    if-lez v1, :cond_6

    array-length v1, p2

    move v4, v2

    :goto_2
    if-ge v4, v1, :cond_7

    aget-object v5, p2, v4

    sget-object v6, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "version = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v3, v7}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/jieli/jl_fatfs/model/FileExtMsg;->getVersionID()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_5

    return v0

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    return v0

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_7
    :goto_4
    return v2
.end method

.method public final j()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->h:[B

    const/4 v1, 0x0

    iput-short v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->j:S

    iput v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->i:I

    iput v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->k:I

    iput v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->m:I

    iput-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->l:[B

    return-void
.end method

.method public judgeWriteFinish(I)Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->h:[B

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->i:I

    add-int/2addr v1, p1

    array-length p1, v0

    if-lt v1, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public native libDestroy(J)V
.end method

.method public native libInit(II)J
.end method

.method public native listDir(Ljava/lang/String;)Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;"
        }
    .end annotation
.end method

.method public listFatDir(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener<",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;>;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iO00I11X;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iO00I11X;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;->onResult(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public mount(Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/16 v0, 0x8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;->onResult(Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O10XO0;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/O10XO0;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public native mountDevice(J)I
.end method

.method public onReadDataNotify(II)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->d:Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;

    invoke-interface {v0}, Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;->readFatDataFromDevice(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public onWriteDataNotify([BI)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->d:Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;

    invoke-interface {v0}, Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-interface {v0, v1, p2, p1}, Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;->writeFatDataToDevice(Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void
.end method

.method public onWriteFailed(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatWriteOp;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onWriteFlagNotify(Z)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->d:Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;

    invoke-interface {v0}, Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;->sendWriteFlag(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public openFatFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener<",
            "[B>;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Xi0O11;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/Xi0O11;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;->onResult(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public native openFile(Ljava/lang/String;)[B
.end method

.method public putDataInReadBuff([B)V
    .locals 4

    if-eqz p1, :cond_1

    array-length v0, p1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->n:[B

    if-eqz v0, :cond_1

    array-length v1, p1

    iget v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->o:I

    add-int/2addr v1, v2

    array-length v3, v0

    if-le v1, v3, :cond_0

    goto :goto_0

    :cond_0
    array-length v1, p1

    const/4 v3, 0x0

    invoke-static {p1, v3, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->o:I

    array-length p1, p1

    add-int/2addr v0, p1

    iput v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->o:I

    return-void

    :cond_1
    :goto_0
    sget-object p1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    const-string v0, "putDataInReadBuff"

    const-string v1, "readBuffer no enough space."

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public readBufferIsEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->n:[B

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public native replaceFatFile(Ljava/lang/String;[B)I
.end method

.method public replaceFatFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->a:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    if-eqz v0, :cond_1

    .line 3
    sget-object p1, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is in progress. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "replaceFatFile"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_3

    const/16 p1, 0x1100

    .line 4
    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    return-void

    .line 5
    :cond_1
    new-instance v0, Lcom/jieli/jl_fatfs/model/FatOpParam;

    invoke-direct {v0}, Lcom/jieli/jl_fatfs/model/FatOpParam;-><init>()V

    const/4 v1, 0x4

    .line 6
    invoke-virtual {v0, v1}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setOp(I)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setFilePath(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object p1

    .line 8
    invoke-virtual {p1, p2}, Lcom/jieli/jl_fatfs/model/FatOpParam;->setProgressListener(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Lcom/jieli/jl_fatfs/model/FatOpParam;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->q:Lcom/jieli/jl_fatfs/model/FatOpParam;

    .line 9
    iget-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->c:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/XO1Ii1XI0;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/XO1Ii1XI0;-><init>(Lcom/jieli/jl_fatfs/FatFileSystem;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    const/16 p1, 0x16

    .line 10
    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_3
    return-void
.end method

.method public setNeedWriteData(I)V
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->h:[B

    if-eqz v0, :cond_1

    array-length v1, v0

    iget v2, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->i:I

    add-int v3, v2, p1

    if-lt v1, v3, :cond_0

    new-array v1, p1, [B

    iput-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->l:[B

    goto :goto_0

    :cond_0
    sub-int/2addr v1, v2

    new-array v1, v1, [B

    iput-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->l:[B

    :goto_0
    iget-object v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->l:[B

    array-length v3, v1

    const/4 v4, 0x0

    invoke-static {v0, v2, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v4, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->m:I

    :cond_1
    iput p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->k:I

    return-void
.end method

.method public setWriteBuffer([B)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    array-length v2, p1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->h:[B

    invoke-static {p1, v1}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result p1

    iput-short p1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->j:S

    iput v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->i:I

    iput v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->m:I

    iput-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->l:[B

    sget-object v0, Lcom/jieli/jl_fatfs/FatFileSystem;->u:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iget-short v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->j:S

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "crc16 : %d(0x%X)"

    invoke-static {v1, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "setWriteBuffer"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    iput-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->h:[B

    iput v1, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->i:I

    return-void
.end method

.method public native updateFlagStatus(JI)V
.end method

.method public updateFlagStatus(Z)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->updateFlagStatus(JI)V

    return-void
.end method

.method public native updateReadStatus(JI[B)V
.end method

.method public updateReadStatus(Z[B)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    invoke-virtual {p0, v0, v1, p1, p2}, Lcom/jieli/jl_fatfs/FatFileSystem;->updateReadStatus(JI[B)V

    return-void
.end method

.method public updateSysStatus(I)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->updateSysStatus(JI)V

    return-void
.end method

.method public native updateSysStatus(JI)V
.end method

.method public native updateWriteStatus(JI)V
.end method

.method public updateWriteStatus(Z)V
    .locals 2

    if-nez p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/FatFileSystem;->j()V

    .line 2
    :cond_0
    iget-wide v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->b:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->updateWriteStatus(JI)V

    return-void
.end method

.method public writeBufferIsEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/FatFileSystem;->h:[B

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
