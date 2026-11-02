.class Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;
.super Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;
    }
.end annotation


# static fields
.field private static final m:I = 0x1234

.field private static final n:I = 0x1235


# instance fields
.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;

.field private f:Landroid/bluetooth/le/BluetoothLeScanner;

.field private volatile g:I

.field private volatile h:Z

.field private volatile i:Z

.field private final j:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;

.field private final k:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

.field private final l:Landroid/bluetooth/le/ScanCallback;
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x15
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;-><init>(Landroid/content/Context;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->c:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->d:Ljava/util/List;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->h:Z

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->i:Z

    new-instance p1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$1;

    invoke-direct {p1, p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$1;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->j:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;

    new-instance v0, Lcom/jieli/jl_bt_ota/impl/bt/O00;

    invoke-direct {v0, p0}, Lcom/jieli/jl_bt_ota/impl/bt/O00;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->k:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    new-instance v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$2;

    invoke-direct {v0, p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$2;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->l:Landroid/bluetooth/le/ScanCallback;

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->f:Landroid/bluetooth/le/BluetoothLeScanner;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->addOnBtAssistantCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void
.end method

.method private a()V
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->e:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 36
    new-instance v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$1;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->e:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;

    .line 37
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 38
    const-string v1, "android.bluetooth.adapter.action.DISCOVERY_STARTED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 39
    const-string v1, "android.bluetooth.adapter.action.DISCOVERY_FINISHED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 40
    const-string v1, "android.bluetooth.device.action.FOUND"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 41
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->e:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method private a(I)V
    .locals 0

    .line 16
    iput p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->g:I

    return-void
.end method

.method private synthetic a(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 1

    const/4 v0, 0x1

    .line 42
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Landroid/bluetooth/BluetoothDevice;I[BZ)V

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;I[BZ)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 17
    const-string v0, "filterDevice"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 19
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    new-instance v1, Lcom/jieli/jl_bt_ota/model/BleScanMessage;

    invoke-direct {v1}, Lcom/jieli/jl_bt_ota/model/BleScanMessage;-><init>()V

    invoke-virtual {v1, p3}, Lcom/jieli/jl_bt_ota/model/BleScanMessage;->setRawData([B)Lcom/jieli/jl_bt_ota/model/BleScanMessage;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/jieli/jl_bt_ota/model/BleScanMessage;->setRssi(I)Lcom/jieli/jl_bt_ota/model/BleScanMessage;

    move-result-object p2

    invoke-virtual {p2, p4}, Lcom/jieli/jl_bt_ota/model/BleScanMessage;->setEnableConnect(Z)Lcom/jieli/jl_bt_ota/model/BleScanMessage;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->c()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;Landroid/bluetooth/BluetoothDevice;I[BZ)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Landroid/bluetooth/BluetoothDevice;I[BZ)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 6

    .line 21
    iget v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->g:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    .line 22
    :goto_0
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "scanType : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->g:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", bStart : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "notifyDiscoveryStatus"

    invoke-static {v3, v5, v4}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    if-eqz v0, :cond_1

    .line 23
    iput-boolean v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->h:Z

    .line 24
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    goto :goto_1

    .line 25
    :cond_1
    iput-boolean v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->i:Z

    .line 26
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    .line 27
    iput-boolean v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->h:Z

    const/16 v1, 0x1235

    .line 28
    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeTimeoutTask(I)V

    goto :goto_1

    .line 29
    :cond_3
    iput-boolean v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->i:Z

    const/16 v1, 0x1234

    .line 30
    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeTimeoutTask(I)V

    .line 31
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->b()V

    .line 32
    :goto_1
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-virtual {v1, v0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onDiscoveryStatus(ZZ)V

    if-nez p1, :cond_4

    .line 33
    invoke-direct {p0, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(I)V

    return-void

    .line 34
    :cond_4
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->b(Z)V

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 14
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkHasConnectPermission(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result p1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    return v0
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;Ljava/lang/String;Z)Z
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method private a(Ljava/lang/String;Z)Z
    .locals 2

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkHasScanPermission(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 7
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "Missing bluetooth scan permissions."

    invoke-static {p2, p1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    if-nez p2, :cond_1

    .line 8
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkHasLocationPermission(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 9
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "Missing location permissions."

    invoke-static {p2, p1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 10
    :cond_1
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-nez p2, :cond_2

    .line 11
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "The device is not supported bluetooth."

    invoke-static {p2, p1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 12
    :cond_2
    invoke-static {}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->isBluetoothEnable()Z

    move-result p2

    if-nez p2, :cond_3

    .line 13
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "Bluetooth is off."

    invoke-static {p2, p1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->g:I

    return p0
.end method

.method private b()V
    .locals 2

    .line 13
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->e:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    if-eqz v1, :cond_0

    .line 14
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->e:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;

    :cond_0
    return-void
.end method

.method private b(Z)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->getSystemConnectedBtDeviceList(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    if-eqz p1, :cond_2

    .line 5
    invoke-direct {p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 6
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 7
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    new-instance v3, Lcom/jieli/jl_bt_ota/model/BleScanMessage;

    invoke-direct {v3}, Lcom/jieli/jl_bt_ota/model/BleScanMessage;-><init>()V

    invoke-virtual {v2, v1, v3}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;)V

    goto :goto_0

    :cond_2
    if-nez p1, :cond_1

    .line 9
    invoke-direct {p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 10
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->d:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 11
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->d:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    new-instance v3, Lcom/jieli/jl_bt_ota/model/BleScanMessage;

    invoke-direct {v3}, Lcom/jieli/jl_bt_ota/model/BleScanMessage;-><init>()V

    invoke-virtual {v2, v1, v3}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->d:Ljava/util/List;

    return-object p0
.end method

.method private c()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(I)V

    .line 3
    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->h:Z

    .line 4
    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->i:Z

    .line 5
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method


# virtual methods
.method public getDiscoveredBluetoothDevices()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation

    iget v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->g:I

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->c:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->d:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getScanType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->g:I

    return v0
.end method

.method public handleMessageEvent(Landroid/os/Message;)Z
    .locals 3
    .param p1    # Landroid/os/Message;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x1234

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1235

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "MSG_STOP_BLE"

    const-string v2, "stopBLEScan"

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->stopBLEScan()I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "MSG_STOP_EDR"

    const-string v2, "stopDeviceScan"

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->stopDeviceScan()I

    :goto_0
    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->handleMessageEvent(Landroid/os/Message;)Z

    move-result p1

    return p1
.end method

.method public isBleScanning()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->h:Z

    return v0
.end method

.method public isDeviceScanning()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->i:Z

    return v0
.end method

.method public isScanning()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->i:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->h:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->j:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeOnBtAssistantCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->b()V

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->stopDeviceScan()I

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->stopBLEScan()I

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->c()V

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->release()V

    return-void
.end method

.method public startBLEScan(J)I
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "startBLEScan"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 p1, 0x1011

    return p1

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->isDeviceScanning()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v3, "stopDeviceScan"

    invoke-static {v1, v0, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->stopDeviceScan()I

    move-result v1

    if-nez v1, :cond_3

    move v1, v2

    :cond_1
    const-wide/16 v3, 0x32

    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    add-int/lit8 v1, v1, 0x32

    const/16 v3, 0x3e8

    if-le v1, v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothAdapter;->isDiscovering()Z

    move-result v3

    if-nez v3, :cond_1

    :cond_3
    :goto_0
    invoke-direct {p0, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(I)V

    const-wide/16 v3, 0x0

    cmp-long v1, p1, v3

    if-gtz v1, :cond_4

    const-wide/16 p1, 0x1f40

    :cond_4
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->isBleScanning()Z

    move-result v1

    const/4 v3, 0x0

    const/16 v4, 0x1235

    const/4 v5, 0x1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "scanning ble ..... timeout = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v0, v6}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->f:Landroid/bluetooth/le/BluetoothLeScanner;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->l:Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {v0, v1}, Landroid/bluetooth/le/BluetoothLeScanner;->flushPendingScanResults(Landroid/bluetooth/le/ScanCallback;)V

    :cond_5
    invoke-virtual {p0, v4, v3, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->executeTimeoutTask(ILandroid/bluetooth/BluetoothDevice;J)V

    invoke-direct {p0, v5}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Z)V

    return v2

    :cond_6
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->f:Landroid/bluetooth/le/BluetoothLeScanner;

    if-eqz v1, :cond_7

    new-instance v1, Landroid/bluetooth/le/ScanSettings$Builder;

    invoke-direct {v1}, Landroid/bluetooth/le/ScanSettings$Builder;-><init>()V

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v6

    invoke-virtual {v6}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getBleScanMode()I

    move-result v6

    invoke-virtual {v1, v6}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/bluetooth/le/ScanSettings$Builder;->setMatchMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object v1

    const/4 v6, 0x3

    invoke-virtual {v1, v6}, Landroid/bluetooth/le/ScanSettings$Builder;->setNumOfMatches(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/le/ScanSettings$Builder;->build()Landroid/bluetooth/le/ScanSettings;

    move-result-object v1

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iget-object v7, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->f:Landroid/bluetooth/le/BluetoothLeScanner;

    iget-object v8, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->l:Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {v7, v6, v1, v8}, Landroid/bluetooth/le/BluetoothLeScanner;->startScan(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v6, "startScan : true"

    invoke-static {v1, v0, v6}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    iget-object v6, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->k:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    invoke-virtual {v1, v6}, Landroid/bluetooth/BluetoothAdapter;->startLeScan(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z

    move-result v1

    iget-object v6, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "startLeScan : "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v0, v7}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_8

    const/16 p1, 0x2002

    return p1

    :cond_8
    :goto_1
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Ready to scan, timeout : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v0, v6}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v4, v3, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->executeTimeoutTask(ILandroid/bluetooth/BluetoothDevice;J)V

    invoke-direct {p0, v5}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Z)V

    return v2
.end method

.method public startDeviceScan(JI)I
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    if-nez p3, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->startBLEScan(J)I

    move-result p1

    return p1

    :cond_0
    const-string v0, "startDeviceScan"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 p1, 0x1011

    return p1

    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->isBleScanning()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->stopBLEScan()I

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v2, "stopBLEScan."

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v1, 0x64

    invoke-static {v1, v2}, Landroid/os/SystemClock;->sleep(J)V

    :cond_2
    invoke-direct {p0, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(I)V

    const-wide/16 v1, 0x0

    cmp-long p3, p1, v1

    if-gtz p3, :cond_3

    const-wide/16 v1, 0x1f40

    goto :goto_0

    :cond_3
    move-wide v1, p1

    :goto_0
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->isDeviceScanning()Z

    move-result p3

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x1234

    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "scanning br/edr ..... timeout = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, v0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v6, v5, v1, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->executeTimeoutTask(ILandroid/bluetooth/BluetoothDevice;J)V

    invoke-direct {p0, v4}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Z)V

    return v3

    :cond_4
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a()V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->startDiscovery()Z

    move-result p1

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "startDiscovery : "

    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, v0, p3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_5

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->b()V

    const/16 p1, 0x2002

    return p1

    :cond_5
    invoke-virtual {p0, v6, v5, v1, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->executeTimeoutTask(ILandroid/bluetooth/BluetoothDevice;J)V

    invoke-direct {p0, v4}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Z)V

    return v3
.end method

.method public stopBLEScan()I
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "stopBLEScan"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v0, 0x1011

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->isBleScanning()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-virtual {v0, v1, v3}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onDiscoveryStatus(ZZ)V

    return v3

    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->f:Landroid/bluetooth/le/BluetoothLeScanner;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->l:Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {v1, v2}, Landroid/bluetooth/le/BluetoothLeScanner;->stopScan(Landroid/bluetooth/le/ScanCallback;)V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v2, "stopScan"

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->k:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    invoke-virtual {v1, v2}, Landroid/bluetooth/BluetoothAdapter;->stopLeScan(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v2, "stopLeScan"

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    const/16 v0, 0x1235

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeTimeoutTask(I)V

    invoke-direct {p0, v3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Z)V

    return v3
.end method

.method public stopDeviceScan()I
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const/4 v0, 0x1

    const-string v1, "stopDeviceScan"

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x1011

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->isDeviceScanning()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-virtual {v0, v2, v2}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onDiscoveryStatus(ZZ)V

    return v2

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->cancelDiscovery()Z

    move-result v0

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "cancelDiscovery = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v1, v4}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_2

    const/16 v0, 0x2002

    return v0

    :cond_2
    const/16 v0, 0x1234

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeTimeoutTask(I)V

    return v2
.end method
