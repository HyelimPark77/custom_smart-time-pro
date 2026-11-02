.class public Lcom/jieli/jl_bt_ota/thread/OtaDataCache;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Ljava/util/concurrent/ExecutorService;

.field private c:[B

.field private d:Ljava/io/RandomAccessFile;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_bt_ota/thread/OtaDataCache;IILcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a(IILcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/jieli/jl_bt_ota/thread/OtaDataCache;Ljava/io/File;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a(Ljava/io/File;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/thread/OtaDataCache;)Ljava/lang/String;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a:Ljava/lang/String;

    return-object p0
.end method

.method private synthetic a(IILcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 6

    const-string v0, "readOtaData"

    .line 3
    :try_start_0
    new-array v1, p1, [B

    .line 4
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->d:Ljava/io/RandomAccessFile;

    int-to-long v3, p2

    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 5
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->d:Ljava/io/RandomAccessFile;

    invoke-virtual {v2, v1}, Ljava/io/RandomAccessFile;->read([B)I

    move-result v2

    if-eq v2, p1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->d:Ljava/io/RandomAccessFile;

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v3

    .line 7
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a:Ljava/lang/String;

    const-string v5, "Can not read file data by RandomAccessFile. offset = %d, len = %d, read data size = %d, file data length = %d."

    .line 8
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    filled-new-array {p2, p1, v2, v3}, [Ljava/lang/Object;

    move-result-object p1

    .line 9
    invoke-static {v5, p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x4004

    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    .line 10
    invoke-static {v1, v0, p3, p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->callbackError(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    const/4 p1, 0x0

    .line 11
    invoke-static {v1, p1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 12
    :goto_0
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to read data. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x5006

    invoke-static {v1, p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    .line 14
    invoke-static {p2, v0, p3, p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->callbackError(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    :cond_1
    return-void
.end method

.method private synthetic a(Ljava/io/File;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 2

    .line 23
    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "r"

    invoke-direct {v0, p1, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->d:Ljava/io/RandomAccessFile;

    if-eqz p2, :cond_0

    .line 24
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 26
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a:Ljava/lang/String;

    const/16 v0, 0x5004

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    const-string v1, "readFile"

    invoke-static {p1, v1, p2, v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->callbackError(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 15
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->b:Ljava/util/concurrent/ExecutorService;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 18
    :cond_1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    iput-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->b:Ljava/util/concurrent/ExecutorService;

    .line 19
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v1

    sget-wide v3, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->FILE_CACHE_DATA_LIMIT:J

    cmp-long v1, v1, v3

    if-gtz v1, :cond_3

    .line 20
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/jieli/jl_bt_ota/thread/ReadFileThread;

    new-instance v2, Lcom/jieli/jl_bt_ota/thread/OtaDataCache$1;

    invoke-direct {v2, p0, p2}, Lcom/jieli/jl_bt_ota/thread/OtaDataCache$1;-><init>(Lcom/jieli/jl_bt_ota/thread/OtaDataCache;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    invoke-direct {v1, p1, v2}, Lcom/jieli/jl_bt_ota/thread/ReadFileThread;-><init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 21
    :cond_3
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dj1;

    invoke-direct {v1, p0, v0, p2}, Lcom/android/mltcode/paycertificationapi/dj1;-><init>(Lcom/jieli/jl_bt_ota/thread/OtaDataCache;Ljava/io/File;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 22
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a:Ljava/lang/String;

    const/16 v0, 0x5004

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    const-string v1, "readFile"

    invoke-static {p1, v1, p2, v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->callbackError(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/thread/OtaDataCache;[B)[B
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->c:[B

    return-object p1
.end method


# virtual methods
.method public init(Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "init"

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a:Ljava/lang/String;

    const/16 v1, 0x1001

    const-string v2, "BluetoothOTAConfigure is null."

    invoke-static {v1, v2}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v1

    invoke-static {p1, v0, p2, v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->callbackError(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getFirmwareFilePath()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ota file path : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/FileUtil;->checkFileExist(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {p0, v1, p2}, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getFirmwareFileData()[B

    move-result-object p1

    if-eqz p1, :cond_3

    array-length v1, p1

    if-lez v1, :cond_3

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->c:[B

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ota data size : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_2
    return-void

    :cond_3
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a:Ljava/lang/String;

    const/16 v1, 0x5005

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v1

    invoke-static {p1, v0, p2, v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->callbackError(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public readOtaData(IILcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "[B>;)V"
        }
    .end annotation

    const-string v0, "readOtaData"

    if-ltz p1, :cond_3

    if-ltz p2, :cond_3

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->c:[B

    if-eqz v1, :cond_2

    array-length v2, v1

    if-lez v2, :cond_2

    new-array v2, p2, [B

    add-int v3, p1, p2

    array-length v4, v1

    if-gt v3, v4, :cond_1

    const/4 v0, 0x0

    invoke-static {v1, p1, v2, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz p3, :cond_0

    invoke-interface {p3, v2}, Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->c:[B

    array-length v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {p1, p2, v2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "Can not read file data by Buffer. offset = %d, len = %d, file data length = %d."

    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x4004

    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-static {v1, v0, p3, p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->callbackError(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->d:Ljava/io/RandomAccessFile;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->b:Ljava/util/concurrent/ExecutorService;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cj1;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/android/mltcode/paycertificationapi/cj1;-><init>(Lcom/jieli/jl_bt_ota/thread/OtaDataCache;IILcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_3
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "Can not read file data. offset = %d, len = %d."

    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x1001

    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-static {v1, v0, p3, p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->callbackError(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->b:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    iput-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->b:Ljava/util/concurrent/ExecutorService;

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->c:[B

    if-eqz v0, :cond_1

    iput-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->c:[B

    invoke-static {}, Ljava/lang/System;->gc()V

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->d:Ljava/io/RandomAccessFile;

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->d:Ljava/io/RandomAccessFile;

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->d:Ljava/io/RandomAccessFile;

    goto :goto_1

    :goto_0
    iput-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->d:Ljava/io/RandomAccessFile;

    throw v0

    :cond_2
    :goto_1
    return-void
.end method
