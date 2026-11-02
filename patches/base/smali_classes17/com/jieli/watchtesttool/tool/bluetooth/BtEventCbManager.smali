.class public Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;,
        Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;
    }
.end annotation


# instance fields
.field private final mHandler:Landroid/os/Handler;

.field private final mListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->mListeners:Ljava/util/ArrayList;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic access$200(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->mListeners:Ljava/util/ArrayList;

    return-object p0
.end method

.method private callbackEvent(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;)V
    .locals 3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;

    invoke-direct {v1, p0, p1, v2}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    new-instance v0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;

    invoke-direct {v0, p0, p1, v2}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$1;)V

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;->run()V

    return-void
.end method


# virtual methods
.method public addBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public destroy()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public onAdapterStatus(Z)V
    .locals 1

    new-instance v0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$1;

    invoke-direct {v0, p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$1;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Z)V

    invoke-direct {p0, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->callbackEvent(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;)V

    return-void
.end method

.method public onBleMtuChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1

    new-instance v0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$5;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$5;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Landroid/bluetooth/BluetoothGatt;II)V

    invoke-direct {p0, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->callbackEvent(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;)V

    return-void
.end method

.method public onBtDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
    .locals 1

    new-instance v0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$3;

    invoke-direct {v0, p0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$3;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    invoke-direct {p0, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->callbackEvent(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;)V

    return-void
.end method

.method public onBtDiscoveryStatus(ZZ)V
    .locals 1

    new-instance v0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$2;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;ZZ)V

    invoke-direct {p0, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->callbackEvent(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;)V

    return-void
.end method

.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$6;

    invoke-direct {v0, p0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$6;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Landroid/bluetooth/BluetoothDevice;I)V

    invoke-direct {p0, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->callbackEvent(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;)V

    return-void
.end method

.method public onError(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
    .locals 1

    new-instance v0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$9;

    invoke-direct {v0, p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$9;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    invoke-direct {p0, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->callbackEvent(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;)V

    return-void
.end method

.method public onReceiveData(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 1

    new-instance v0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$7;

    invoke-direct {v0, p0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$7;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Landroid/bluetooth/BluetoothDevice;[B)V

    invoke-direct {p0, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->callbackEvent(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;)V

    return-void
.end method

.method public onShowDialog(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
    .locals 1

    new-instance v0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$4;

    invoke-direct {v0, p0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$4;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    invoke-direct {p0, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->callbackEvent(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;)V

    return-void
.end method

.method public onSwitchConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    new-instance v0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$8;

    invoke-direct {v0, p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$8;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Landroid/bluetooth/BluetoothDevice;)V

    invoke-direct {p0, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->callbackEvent(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;)V

    return-void
.end method

.method public removeBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
