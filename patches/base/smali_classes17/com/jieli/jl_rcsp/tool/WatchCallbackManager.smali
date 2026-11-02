.class public Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;
.super Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;,
        Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$OnWatchRunnable;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a:Ljava/util/ArrayList;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->b:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic a(ILcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 4
    invoke-virtual {p1, p0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;->onWatchSystemInit(I)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 11
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;I[BLcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 9
    invoke-virtual {p3, p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;->onReceiveBigData(Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 3
    invoke-virtual {p1, p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 10
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;->onBigDataError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 2
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 8
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;->onDevicePower(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 12
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;->onNetworkModuleException(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 6
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;->onExternalFlashMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 7
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;->onCurrentWatchInfo(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 5
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;->onExternalFlashWriteFlag(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public static synthetic b(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 4
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;->onWatchSystemException(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 5
    invoke-virtual {p1, p0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;->onResourceUpdateUnfinished(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 3
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 2
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    return-void
.end method

.method public static synthetic b(Landroid/bluetooth/BluetoothDevice;ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    .line 13
    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$OnWatchRunnable;

    invoke-direct {v0, p0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$OnWatchRunnable;-><init>(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-eqz p1, :cond_1

    .line 15
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 16
    :cond_1
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$OnWatchRunnable;->run()V

    return-void
.end method

.method public onBigDataError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/XXI;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/XXI;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/X0O;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/X0O;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onCurrentWatchInfo(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/iO;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/iO;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onDevicePower(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/OXO1;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/OXO1;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onExternalFlashMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/OIi0;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/OIi0;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onExternalFlashWriteFlag(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/O10IXXX0X;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/O10IXXX0X;-><init>(Landroid/bluetooth/BluetoothDevice;Z)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/OIX0iXi;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/tool/OIX0iXi;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onNetworkModuleException(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/XIi00iiXO;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/XIi00iiXO;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/I0IIOi;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/I0IIOi;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/IiI10X;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/IiI10X;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/I0iXXO;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/I0iXXO;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/I1XOi1;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/I1XOi1;-><init>(Landroid/bluetooth/BluetoothDevice;Z)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onReceiveBigData(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/O00;

    invoke-direct {v0, p1, p2, p3}, Lcom/jieli/jl_rcsp/tool/O00;-><init>(Landroid/bluetooth/BluetoothDevice;I[B)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onResourceUpdateUnfinished(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/XOO0ii0;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/tool/XOO0ii0;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onWatchSystemException(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/X1ii;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/X1ii;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public onWatchSystemInit(I)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/XO0O10;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/tool/XO0O10;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V

    return-void
.end method

.method public registerWatchCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->b:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public unregisterWatchCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
