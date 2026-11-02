.class Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;
.super Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;
    }
.end annotation


# instance fields
.field private o:Landroid/bluetooth/BluetoothHeadset;

.field private p:Landroid/bluetooth/BluetoothA2dp;

.field private q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;

.field private final r:Landroid/bluetooth/BluetoothProfile$ServiceListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$1;

    invoke-direct {v0, p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$1;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->r:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->init(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->a()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;Landroid/bluetooth/BluetoothA2dp;)Landroid/bluetooth/BluetoothA2dp;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->p:Landroid/bluetooth/BluetoothA2dp;

    return-object p1
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothHeadset;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->o:Landroid/bluetooth/BluetoothHeadset;

    return-object p1
.end method

.method private a()V
    .locals 3

    .line 17
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 18
    new-instance v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$1;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;

    .line 19
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 20
    const-string v1, "android.bluetooth.device.action.UUID"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 21
    const-string v1, "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 22
    const-string v1, "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 23
    const-string v1, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 24
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p2, v2, :cond_2

    .line 7
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-virtual {p2, p1, p3}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    if-eqz p3, :cond_1

    if-eq p3, v0, :cond_0

    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I

    move-result p2

    .line 9
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->deviceHasA2dp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v3

    if-eqz v3, :cond_5

    if-ne p2, v0, :cond_6

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I

    move-result p2

    if-nez p2, :cond_6

    goto :goto_0

    :cond_2
    if-ne p2, v0, :cond_6

    .line 11
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-virtual {p2, p1, p3}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    if-eqz p3, :cond_4

    if-eq p3, v0, :cond_3

    goto :goto_1

    .line 12
    :cond_3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I

    move-result p2

    .line 13
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->deviceHasHfp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v3

    if-eqz v3, :cond_5

    if-ne p2, v0, :cond_6

    goto :goto_0

    .line 14
    :cond_4
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I

    move-result p2

    if-nez p2, :cond_6

    :cond_5
    :goto_0
    move v1, v2

    .line 15
    :cond_6
    :goto_1
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isCallBtStatus : "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "handleProfileStatus"

    invoke-static {p2, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_7

    .line 16
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-virtual {p2, p1, p3}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_7
    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;Landroid/bluetooth/BluetoothDevice;II)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->a(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method private a(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->isInvalidEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->p:Landroid/bluetooth/BluetoothA2dp;

    if-nez p2, :cond_1

    .line 6
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "No a2dp manager."

    invoke-static {p2, p1, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private b()V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;

    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->isInvalidEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    .line 2
    :cond_0
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->o:Landroid/bluetooth/BluetoothHeadset;

    if-nez p2, :cond_1

    .line 3
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "No hfp manager."

    invoke-static {p2, p1, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private init(Landroid/content/Context;)V
    .locals 6

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->p:Landroid/bluetooth/BluetoothA2dp;

    const-string v2, "init"

    const/4 v3, 0x0

    if-nez v1, :cond_1

    :try_start_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->r:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    const/4 v4, 0x2

    invoke-virtual {v0, p1, v1, v4}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "init a2dp manager error. "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    if-nez v3, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "Failed to obtain a2dp manager."

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->o:Landroid/bluetooth/BluetoothHeadset;

    if-nez v0, :cond_2

    :try_start_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->r:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    const/4 v4, 0x1

    invoke-virtual {v0, p1, v1, v4}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    move-result v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "init hfp manager error. "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v2, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    if-nez v3, :cond_2

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "Failed to obtain hfp manager."

    invoke-static {p1, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_2
    return-void
.end method


# virtual methods
.method public deviceHasA2dp(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    sget-object v1, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->UUID_A2DP:Ljava/util/UUID;

    invoke-static {v0, p1, v1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceHasProfile(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;)Z

    move-result p1

    return p1
.end method

.method public deviceHasHfp(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    sget-object v1, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->UUID_HFP:Ljava/util/UUID;

    invoke-static {v0, p1, v1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceHasProfile(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;)Z

    move-result p1

    return p1
.end method

.method public disconnectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "disconnectByProfiles"

    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->isInvalidEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_4

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I

    move-result v1

    if-ne v1, v3, :cond_1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->disconnectFromA2dp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v4

    iget-object v5, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "disconnectFromA2dp : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v0, v6}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I

    move-result v5

    if-ne v5, v3, :cond_2

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->disconnectFromHfp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v4

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "disconnectFromHfp : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v0, v6}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    if-nez v1, :cond_3

    if-nez v5, :cond_3

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v3, "Classic Bluetooth is disconnected."

    invoke-static {v1, v0, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-virtual {v0, p1, v2}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-virtual {v0, p1, v2}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-virtual {v0, p1, v2}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V

    const/4 p1, 0x1

    return p1

    :cond_3
    return v4

    :cond_4
    return v2
.end method

.method public disconnectFromA2dp(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 6

    .line 1
    const-string v0, "disconnectFromA2dp"

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->a(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I

    move-result v1

    .line 3
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "deviceA2dpStatus : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printBtConnectionState(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v0, v4}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "A2dp is disconnected."

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 v3, 0x2

    if-ne v1, v3, :cond_2

    .line 5
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->p:Landroid/bluetooth/BluetoothA2dp;

    invoke-static {v1, v2, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->disconnectDeviceA2dp(Landroid/content/Context;Landroid/bluetooth/BluetoothA2dp;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " -------------> "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2
.end method

.method public disconnectFromA2dp(Ljava/lang/String;)Z
    .locals 0

    .line 7
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->disconnectFromA2dp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public disconnectFromHfp(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 6

    .line 1
    const-string v0, "disconnectFromHfp"

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->b(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I

    move-result v1

    .line 3
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "deviceHfpStatus : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printBtConnectionState(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v0, v4}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "Hfp is disconnected"

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 v3, 0x2

    if-ne v1, v3, :cond_2

    .line 5
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->o:Landroid/bluetooth/BluetoothHeadset;

    invoke-static {v1, v2, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->disconnectDeviceHfp(Landroid/content/Context;Landroid/bluetooth/BluetoothHeadset;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " ----> "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2
.end method

.method public disconnectFromHfp(Ljava/lang/String;)Z
    .locals 0

    .line 7
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->disconnectFromHfp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public getBluetoothHfp()Landroid/bluetooth/BluetoothHeadset;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->o:Landroid/bluetooth/BluetoothHeadset;

    return-object v0
.end method

.method public getDevicesConnectedByProfile()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkHasConnectPermission(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->o:Landroid/bluetooth/BluetoothHeadset;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothHeadset;->getConnectedDevices()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :cond_2
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->p:Landroid/bluetooth/BluetoothA2dp;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothA2dp;->getConnectedDevices()Ljava/util/List;

    move-result-object v0

    :cond_3
    if-eqz v0, :cond_5

    if-nez v1, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_4
    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_5
    return-object v1
.end method

.method public getmBluetoothA2dp()Landroid/bluetooth/BluetoothA2dp;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->p:Landroid/bluetooth/BluetoothA2dp;

    return-object v0
.end method

.method public isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "isConnectedByA2dp"

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->a(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->p:Landroid/bluetooth/BluetoothA2dp;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothA2dp;->getConnectedDevices()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, " ----> Connected"

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x2

    return p1

    :cond_2
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->p:Landroid/bluetooth/BluetoothA2dp;

    invoke-virtual {v1, p1}, Landroid/bluetooth/BluetoothA2dp;->getConnectionState(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "state : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printBtConnectionState(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return p1
.end method

.method public isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "isConnectedByHfp"

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->b(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->o:Landroid/bluetooth/BluetoothHeadset;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothHeadset;->getConnectedDevices()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "Hfp service is connected."

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x2

    return p1

    :cond_2
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->o:Landroid/bluetooth/BluetoothHeadset;

    invoke-virtual {v1, p1}, Landroid/bluetooth/BluetoothHeadset;->getConnectionState(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "state : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printBtConnectionState(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return p1
.end method

.method public isConnectedByProfile(Landroid/bluetooth/BluetoothDevice;)I
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "isConnectedByProfile"

    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->isInvalidEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->o:Landroid/bluetooth/BluetoothHeadset;

    if-eqz v1, :cond_6

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->p:Landroid/bluetooth/BluetoothA2dp;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothHeadset;->getConnectedDevices()Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x2

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "Hfp service is connected."

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_3
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->p:Landroid/bluetooth/BluetoothA2dp;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothA2dp;->getConnectedDevices()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "A2dp service is connected."

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_5
    return v2

    :cond_6
    :goto_0
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "No hfp manager or a2dp manager."

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2
.end method

.method public release()V
    .locals 4

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->b()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->p:Landroid/bluetooth/BluetoothA2dp;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v2, :cond_0

    const/4 v3, 0x2

    invoke-virtual {v2, v3, v0}, Landroid/bluetooth/BluetoothAdapter;->closeProfileProxy(ILandroid/bluetooth/BluetoothProfile;)V

    iput-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->p:Landroid/bluetooth/BluetoothA2dp;

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->o:Landroid/bluetooth/BluetoothHeadset;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    invoke-virtual {v2, v3, v0}, Landroid/bluetooth/BluetoothAdapter;->closeProfileProxy(ILandroid/bluetooth/BluetoothProfile;)V

    iput-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->o:Landroid/bluetooth/BluetoothHeadset;

    :cond_1
    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->release()V

    return-void
.end method
