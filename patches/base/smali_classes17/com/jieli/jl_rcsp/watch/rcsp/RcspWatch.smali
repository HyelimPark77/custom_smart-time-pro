.class public Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;
.super Lcom/jieli/jl_rcsp/watch/WatchBase;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;
.implements Lcom/jieli/jl_rcsp/task/TaskListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$ListDirObserver;
    }
.end annotation


# static fields
.field public static final o:I = 0x1012


# instance fields
.field public e:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

.field public f:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "[B>;"
        }
    .end annotation
.end field

.field public g:Lcom/jieli/jl_fatfs/tool/PackResFormat;

.field public h:Lcom/jieli/jl_rcsp/task/ITask;

.field public i:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

.field public volatile j:Z

.field public volatile k:Z

.field public l:Ljava/util/concurrent/ExecutorService;

.field public final m:Landroid/os/Handler;

.field public final n:Lcom/jieli/jl_filebrowse/interfaces/FileObserver;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->l:Ljava/util/concurrent/ExecutorService;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ff2;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ff2;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V

    invoke-direct {p1, p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->m:Landroid/os/Handler;

    new-instance p1, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$9;

    invoke-direct {p1, p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$9;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->n:Lcom/jieli/jl_filebrowse/interfaces/FileObserver;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->i:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    return-object p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;I)V
    .locals 0

    .line 6
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->b(I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)Z
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->k:Z

    return p1
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->i:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    return-object p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic e(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic f(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic g(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    return-object p0
.end method

.method public static synthetic h(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic i(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic j(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    return-object p0
.end method

.method public static synthetic k(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic l(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object p0
.end method

.method public static synthetic m(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic n(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic o(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource:Z

    return p0
.end method

.method public static synthetic p(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource:Z

    return p0
.end method

.method public static synthetic q(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mWatchCallbackManager:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    return-object p0
.end method

.method public static synthetic r(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->m:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic s(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic t(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic u(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->j:Z

    return p0
.end method

.method public static synthetic v(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V
    .locals 0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->i()V

    return-void
.end method

.method public static synthetic w(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic x(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object p0
.end method

.method public static synthetic y(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/jieli/jl_filebrowse/bean/FileStruct;
    .locals 7

    .line 19
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->getFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "getFileStructByFlashPath"

    if-nez v0, :cond_0

    .line 20
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    const-string v0, "fileName is null."

    invoke-static {p1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v3

    if-nez v3, :cond_1

    .line 22
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    const-string v0, "flash is null."

    invoke-static {p1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 23
    :cond_1
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v3

    if-nez v3, :cond_2

    .line 24
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    const-string v0, "folder is null."

    invoke-static {p1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 25
    :cond_2
    invoke-virtual {v3}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildFileStructs()Ljava/util/List;

    move-result-object v3

    .line 26
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/jieli/jl_filebrowse/bean/FileStruct;

    .line 27
    invoke-virtual {v5}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    return-object v5

    .line 28
    :cond_4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "not found file info. file size = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", path = "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final a(Ljava/util/List;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;)",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;"
        }
    .end annotation

    .line 15
    sget-object v0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->WATCH_STORAGE_INDEX_LIST:[I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 16
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    .line 17
    array-length v3, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget v5, v0, v4

    .line 18
    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getIndex()I

    move-result v6

    if-ne v6, v5, :cond_2

    return-object v2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public final a(F)V
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->m:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/gf2;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/gf2;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;F)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a(I)V
    .locals 2

    .line 60
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->m:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ef2;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/ef2;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    .line 64
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->instance(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;

    new-instance v2, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;-><init>()V

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    new-instance v2, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$11;

    invoke-direct {v2, p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$11;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->settingFunction(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void
.end method

.method public final a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 2

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 30
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p2

    new-instance v1, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$10;

    invoke-direct {v1, p0, p3}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$10;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    invoke-virtual {p2, p1, v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->deleteFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I

    move-result p1

    .line 32
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "delResult = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "deleteFlashFile"

    invoke-static {p2, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    .line 33
    invoke-interface {p3, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    return-void
.end method

.method public final synthetic a(Ljava/lang/String;Z)V
    .locals 2

    .line 53
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->readFileData(Ljava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_3

    .line 54
    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    if-nez p2, :cond_2

    .line 55
    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Ljava/lang/String;[B)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/16 p1, 0x4200

    .line 56
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(I)V

    return-void

    .line 57
    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->b(Ljava/lang/String;)V

    return-void

    :cond_3
    :goto_1
    const/4 p1, 0x4

    .line 58
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(I)V

    return-void
.end method

.method public final a(Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 1

    .line 49
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p3, :cond_0

    const/16 p1, 0x1100

    .line 50
    invoke-interface {p3, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    return-void

    .line 51
    :cond_1
    iput-object p3, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    .line 52
    iget-object p3, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->l:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cf2;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/cf2;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Ljava/lang/String;Z)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final synthetic a(Landroid/os/Message;)Z
    .locals 3

    .line 8
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x1012

    if-ne p1, v0, :cond_3

    .line 9
    iget-boolean p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->j:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object p1

    .line 11
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "flash = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "MSG_INIT_WATCH"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    .line 12
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->isOnline()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 13
    :cond_1
    new-instance p1, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;

    invoke-direct {p1, p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->listWatchList(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    goto :goto_1

    :cond_2
    :goto_0
    const/16 p1, 0x4000

    .line 14
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->b(I)V

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)Z
    .locals 3

    .line 61
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "networkInfo = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "checkNetworkOTAState"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 62
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->isMandatoryOTA()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mWatchCallbackManager:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onNetworkModuleException(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final a(Ljava/lang/String;[B)Z
    .locals 9

    .line 34
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->getJsonFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 35
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->g:Lcom/jieli/jl_fatfs/tool/PackResFormat;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    if-eqz p1, :cond_8

    if-eqz p2, :cond_8

    array-length v2, p2

    if-nez v2, :cond_0

    goto/16 :goto_5

    .line 36
    :cond_0
    invoke-virtual {v0, p2, p1}, Lcom/jieli/jl_fatfs/tool/PackResFormat;->getFileData([BLjava/lang/String;)[B

    move-result-object p1

    .line 37
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "data = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", text = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_1

    const-string v2, ""

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, p1}, Ljava/lang/String;-><init>([B)V

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "isMatchVersion"

    invoke-static {p2, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_2

    return v1

    .line 38
    :cond_2
    :try_start_0
    new-instance p2, Lcom/google/gson/GsonBuilder;

    invoke-direct {p2}, Lcom/google/gson/GsonBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object p2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-class v0, Lcom/jieli/jl_fatfs/model/FileExtMsg;

    invoke-virtual {p2, p1, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_fatfs/model/FileExtMsg;

    .line 39
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fileExtMsg = "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_3

    return v1

    .line 40
    :cond_3
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getExternalFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 41
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getExternalFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object p2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getMatchVersions()[Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_4

    :cond_4
    const/4 p2, 0x0

    .line 42
    :goto_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "matchVersions = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p2, :cond_5

    const-string v4, "null"

    goto :goto_2

    .line 43
    :cond_5
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eqz p2, :cond_7

    .line 44
    array-length v3, p2

    if-lez v3, :cond_7

    .line 45
    array-length v3, p2

    move v4, v1

    :goto_3
    if-ge v4, v3, :cond_8

    aget-object v5, p2, v4

    .line 46
    iget-object v6, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "version = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v2, v7}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p1}, Lcom/jieli/jl_fatfs/model/FileExtMsg;->getVersionID()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_6

    return v0

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    return v0

    .line 48
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_8
    :goto_5
    return v1
.end method

.method public final synthetic b(F)V
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz v0, :cond_0

    .line 18
    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onProgress(F)V

    :cond_0
    return-void
.end method

.method public final b(I)V
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->j:Z

    .line 15
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", isInit = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->j:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "callbackWatchSystemInit"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mWatchCallbackManager:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onWatchSystemInit(I)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 p1, 0x4000

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(I)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->isRun()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->isRun()Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 p1, 0x1100

    .line 6
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(I)V

    return-void

    .line 7
    :cond_2
    :goto_0
    new-instance v0, Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/task/TransferTask$Param;-><init>()V

    .line 8
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getDevHandler()I

    move-result v1

    iput v1, v0, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->devHandler:I

    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->useFlash:Z

    .line 10
    new-instance v1, Lcom/jieli/jl_rcsp/task/TransferTask;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {v1, v2, p1, v0}, Lcom/jieli/jl_rcsp/task/TransferTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;Lcom/jieli/jl_rcsp/task/TransferTask$Param;)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {v0, p0}, Lcom/jieli/jl_rcsp/task/ITask;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    .line 12
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    check-cast v0, Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->setPath(Ljava/lang/String;)V

    .line 13
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {p1}, Lcom/jieli/jl_rcsp/task/ITask;->start()V

    return-void
.end method

.method public final c()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->m:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/df2;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/df2;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final synthetic c(I)V
    .locals 4

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "result = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "callbackStop"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 5
    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    .line 6
    iput-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    instance-of v2, v0, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->f:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz v2, :cond_2

    if-nez p1, :cond_1

    .line 8
    check-cast v0, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->getCacheData()[B

    move-result-object p1

    .line 9
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->f:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    .line 10
    :cond_1
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, p1, v3}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {v2, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    .line 11
    :goto_0
    iput-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->f:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    :cond_2
    return-void
.end method

.method public cancelTransfer()Z
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->d()Z

    move-result v0

    return v0
.end method

.method public createWatchFile(Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 4

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-nez v0, :cond_0

    if-eqz p3, :cond_3

    const/16 p1, 0x4000

    invoke-interface {p3, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    return-void

    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFilePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fatFilePath : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", OnFatFileProgressListener = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "createWatchFile"

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1, p3}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;-><init>(Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;ILcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    return-void

    :cond_2
    :goto_0
    if-eqz p3, :cond_3

    const/4 p1, 0x5

    invoke-interface {p3, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_3
    return-void
.end method

.method public final d(I)V
    .locals 4

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 p1, 0x4000

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(I)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->isRun()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {p1}, Lcom/jieli/jl_rcsp/task/ITask;->isRun()Z

    move-result p1

    if-eqz p1, :cond_3

    const/16 p1, 0x1100

    .line 6
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(I)V

    return-void

    .line 7
    :cond_2
    :goto_0
    new-instance v0, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getDevHandler()I

    move-result v1

    const/4 v2, 0x0

    const-string v3, "byte_array_stream"

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;-><init>(IIILjava/lang/String;)V

    .line 8
    new-instance p1, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {p1, v1, v0}, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    .line 9
    :cond_3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {p1, p0}, Lcom/jieli/jl_rcsp/task/ITask;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    .line 10
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {p1}, Lcom/jieli/jl_rcsp/task/ITask;->start()V

    return-void
.end method

.method public final d()Z
    .locals 2

    .line 11
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->isRun()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/task/ITask;->cancel(B)V

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public deleteWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 3

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_1

    const/16 p1, 0x4000

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Ljava/lang/String;)Lcom/jieli/jl_filebrowse/bean/FileStruct;

    move-result-object p1

    if-nez p1, :cond_2

    if-eqz p2, :cond_1

    const/4 p1, 0x4

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_1
    return-void

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStart(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onProgress(F)V

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$6;

    invoke-direct {v2, p0, v0, p1, p2}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$6;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    invoke-virtual {p0, v1, v2}, Lcom/jieli/jl_rcsp/watch/WatchBase;->deleteFileStart(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void
.end method

.method public destroy()V
    .locals 3

    invoke-super {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->destroy()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->j:Z

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->d()Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->m:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->l:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->l:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->i:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->stopThread()V

    :cond_1
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->n:Lcom/jieli/jl_filebrowse/interfaces/FileObserver;

    invoke-virtual {v0, v2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->removeFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->g:Lcom/jieli/jl_fatfs/tool/PackResFormat;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/tool/PackResFormat;->destroy()V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->g:Lcom/jieli/jl_fatfs/tool/PackResFormat;

    :cond_2
    iput-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    return-void
.end method

.method public final e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 1

    .line 2
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineDev()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Ljava/util/List;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->isRun()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getCurrentBrowsePath()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/File;->getPathString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getWatchFileByPath(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatFile;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Ljava/lang/String;)Lcom/jieli/jl_filebrowse/bean/FileStruct;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1}, Lcom/jieli/jl_fatfs/model/FatFile;->create(Lcom/jieli/jl_filebrowse/bean/FileStruct;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object p1

    return-object p1
.end method

.method public getWatchFileSize(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_rcsp/model/WatchFileContent;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x13

    invoke-static {v0}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFsErrorCodeMsg(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashGetFileMsgCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    new-instance v2, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$8;

    invoke-direct {v3, p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$8;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V

    const-string v4, "getWatchFileSize"

    invoke-direct {v2, v4, p2, v3}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    const/16 p2, 0x1388

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public getWatchSysLeftSize(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashGetLeftSpaceCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$7;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$7;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V

    const-string v5, "getWatchSysLeftSize"

    invoke-direct {v3, v5, p1, v4}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final synthetic h()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h:Lcom/jieli/jl_rcsp/task/ITask;

    if-eqz v0, :cond_0

    .line 4
    instance-of v1, v0, Lcom/jieli/jl_rcsp/task/TransferTask;

    if-eqz v1, :cond_0

    .line 5
    check-cast v0, Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->getPath()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    invoke-interface {v1, v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStart(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final i()V
    .locals 5

    .line 2
    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->j:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->k:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->m:Landroid/os/Handler;

    const/16 v2, 0x1012

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->isOnline()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->m:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    .line 7
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->m:Landroid/os/Handler;

    const-wide/16 v3, 0xbb8

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_3
    :goto_1
    return-void
.end method

.method public init()V
    .locals 8

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->j:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->k:Z

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->n:Lcom/jieli/jl_filebrowse/interfaces/FileObserver;

    invoke-virtual {v1, v2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->addFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    new-instance v1, Lcom/jieli/jl_fatfs/tool/PackResFormat;

    invoke-direct {v1}, Lcom/jieli/jl_fatfs/tool/PackResFormat;-><init>()V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->g:Lcom/jieli/jl_fatfs/tool/PackResFormat;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->l:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    iput-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->l:Ljava/util/concurrent/ExecutorService;

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v2

    iget-object v3, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "init"

    invoke-static {v3, v5, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v2, :cond_1

    const/16 v0, 0x2000

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->b(I)V

    return-void

    :cond_1
    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getExternalFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v1

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getSysStatus()I

    move-result v4

    if-eqz v4, :cond_2

    move v4, v3

    goto :goto_0

    :cond_2
    move v4, v0

    :goto_0
    invoke-virtual {p0, v4}, Lcom/jieli/jl_rcsp/watch/WatchBase;->setSysException(Z)V

    iget-object v4, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "isSysException = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v7, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->isSysException:Z

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v4, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->isSysException:Z

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getSysStatus()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->b(I)V

    return-void

    :cond_3
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getExpandMode()I

    move-result v1

    if-ne v1, v3, :cond_4

    move v0, v3

    :cond_4
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->setOTAResource(Z)V

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportDevConfigure()Z

    move-result v0

    if-eqz v0, :cond_5

    iput-boolean v3, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->k:Z

    new-instance v0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->requestDeviceConfigure(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void

    :cond_5
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->i()V

    return-void
.end method

.method public isInit()Z
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getExternalFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getSysStatus()I

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->j:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public listWatchList(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "flash = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "listWatchList"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_0

    const/16 v0, 0x4000

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->onCallbackError(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;I)V

    return-void

    :cond_0
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "folder = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_1

    const/16 v0, 0x4003

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->onCallbackError(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isReading()Z

    move-result v2

    iget-object v4, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "isReading = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v3, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_2

    const/16 v0, 0x4001

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->onCallbackError(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;I)V

    return-void

    :cond_2
    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildFileStructs()Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinished(Z)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$ListDirObserver;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$ListDirObserver;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;)V

    invoke-virtual {v1, v2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->addFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)I

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    const-string v0, "loadMore >>>> "

    invoke-static {p1, v3, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_filebrowse/bean/FileStruct;

    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/jieli/jl_fatfs/FatFileSystem;->isIgnoreFile(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {v2}, Lcom/jieli/jl_fatfs/model/FatFile;->create(Lcom/jieli/jl_filebrowse/bean/FileStruct;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "callback ----> "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_6

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_6
    return-void
.end method

.method public onBegin()V
    .locals 0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->c()V

    return-void
.end method

.method public onCancel(I)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCancel ==== >>> reason = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Transfer"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x1002

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(I)V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onError ==== >>> code = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", message = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Transfer"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x3005

    if-ne p1, v0, :cond_3

    invoke-static {p2}, Lcom/jieli/jl_rcsp/model/base/CmdError;->parseCmdError(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CmdError;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CmdError;->getCmdId()I

    move-result v0

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CmdError;->getCmdId()I

    move-result v0

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_3

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CmdError;->getSubCode()I

    move-result p2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_2

    const/4 v0, 0x4

    if-eq p2, v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 p1, 0x14

    goto :goto_0

    :cond_2
    const/16 p1, 0x3100

    :cond_3
    :goto_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(I)V

    return-void
.end method

.method public onFinish()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    const-string v1, "Transfer"

    const-string v2, "onFinish ==== >>> "

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(I)V

    return-void
.end method

.method public onProgress(I)V
    .locals 0

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(F)V

    return-void
.end method

.method public openWatchFile(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "[B>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 p1, 0x4000

    invoke-virtual {p0, p2, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->onCallbackError(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;I)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Ljava/lang/String;)Lcom/jieli/jl_filebrowse/bean/FileStruct;

    move-result-object p1

    if-nez p1, :cond_2

    if-eqz p2, :cond_1

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/4 v0, 0x4

    invoke-static {v0}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFsErrorCodeMsg(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_1
    return-void

    :cond_2
    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->f:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->d(I)V

    return-void
.end method

.method public reLoadFolder(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->cleanCache(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->listWatchList(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void
.end method

.method public replaceWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_1

    const/16 p1, 0x4000

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    return-void

    :cond_0
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->isFileExist(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p2, :cond_1

    const/4 p1, 0x5

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0, p2}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->createWatchFile(Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    return-void
.end method

.method public restoreWatchSystem(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 6

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    const/16 v0, 0x4000

    invoke-interface {p1, v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    return-void

    :cond_1
    if-eqz p1, :cond_2

    const-string v0, "/"

    invoke-interface {p1, v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStart(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onProgress(F)V

    :cond_2
    new-instance v0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1, p1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;-><init>(Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;ILcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashRestoreSystemCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$3;

    invoke-direct {v4, p0, v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$3;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V

    new-instance v0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$4;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$4;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V

    const-string v5, "restoreWatchSystem"

    invoke-direct {v3, v5, v4, v0}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    const/16 v0, 0x1388

    invoke-virtual {p1, v1, v2, v0, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public updateWatchResource(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;)V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    const/16 p1, 0x4000

    invoke-static {p1}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;->onError(ILjava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;

    invoke-direct {v0, p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->listWatchList(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void
.end method
