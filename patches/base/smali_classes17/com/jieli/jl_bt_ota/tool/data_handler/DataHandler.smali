.class public Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;,
        Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;,
        Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$ThreadStateListener;,
        Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final g:Ljava/lang/String; = "DataHandler"


# instance fields
.field private final a:Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;

.field private final b:Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;

.field private final c:Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;

.field private final d:Landroid/os/Handler;

.field private e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;

.field private f:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "IBtProxy can not be null."

    invoke-static {p1, v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->a:Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->b:Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;

    new-instance p1, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;

    invoke-direct {p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->c:Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->d:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->a()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->f:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;)Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->f:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    return-object p1
.end method

.method private a()V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->f:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    invoke-direct {v0, p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;-><init>(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->f:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    .line 5
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->start()V

    .line 6
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->b()V

    :cond_0
    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->c:Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;

    return-object p0
.end method

.method private b()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;

    const-string v1, "Work_Thread"

    invoke-direct {v0, p0, v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;-><init>(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->a:Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;

    return-object p0
.end method

.method private c()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->f:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->stopThread()V

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->d()V

    return-void
.end method

.method public static synthetic d(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->d:Landroid/os/Handler;

    return-object p0
.end method

.method private d()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;

    :cond_0
    return-void
.end method

.method public static synthetic e(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->b:Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;

    return-object p0
.end method


# virtual methods
.method public addRecvData(Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->a()V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;->tryToAddRecvData(Lcom/jieli/jl_bt_ota/model/data/DataInfo;)V

    return-void
.end method

.method public addSendData(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->a()V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$WorkThread;->tryToAddSendData(Lcom/jieli/jl_bt_ota/model/data/DataInfo;)V

    return-void
.end method

.method public release()V
    .locals 3

    const-string v0, "release"

    const-string v1, ""

    const-string v2, "DataHandler"

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->c()V

    return-void
.end method
