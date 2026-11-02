.class Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;
    }
.end annotation


# static fields
.field protected static final OPERATION_TIMEOUT:I = 0x1770


# instance fields
.field protected TAG:Ljava/lang/String;

.field private a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;

.field private b:Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

.field protected final mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

.field protected final mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

.field protected final mContext:Landroid/content/Context;

.field protected final mHasBle:Z

.field protected final mUIHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/impl/bt/OXO1;

    invoke-direct {v2, p0}, Lcom/jieli/jl_bt_ota/impl/bt/OXO1;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mUIHandler:Landroid/os/Handler;

    const-string v0, "Context can not be null."

    invoke-static {p1, v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->setMainContext(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->hasBle(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mHasBle:Z

    new-instance v0, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-static {}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->createDefault()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->b:Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    const-string v0, "bluetooth"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothManager;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->a()V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "clazz : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "init"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$1;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;

    :cond_0
    return-void
.end method


# virtual methods
.method public addOnBtAssistantCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->addCallback(Ljava/lang/Object;)Z

    return-void
.end method

.method public configure(Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->b:Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    return-void
.end method

.method public executeTimeoutTask(ILandroid/bluetooth/BluetoothDevice;J)V
    .locals 3

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeTimeoutTask(I)V

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-gez v2, :cond_0

    move-wide p3, v0

    :cond_0
    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mUIHandler:Landroid/os/Handler;

    invoke-virtual {p2, p1, p3, p4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mUIHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1, p3, p4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->b:Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    return-object v0
.end method

.method public handleMessageEvent(Landroid/os/Message;)Z
    .locals 0
    .param p1    # Landroid/os/Message;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x1

    return p1
.end method

.method public isBluetoothEnable()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isHasTimeoutTask(I)Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mUIHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result p1

    return p1
.end method

.method public isInvalidEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkHasConnectPermission(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "Missing connect permissions."

    invoke-static {p2, p1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "Device is null."

    invoke-static {p2, p1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    invoke-static {}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->isBluetoothEnable()Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "Bluetooth is off."

    invoke-static {p2, p1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public onAdapterStatus(Z)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mHasBle:Z

    invoke-virtual {v0, p1, v1}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onAdapterStatus(ZZ)V

    return-void
.end method

.method public printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printBtDeviceInfo(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public release()V
    .locals 3

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->b()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mUIHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->release()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "clazz : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "release"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public removeOnBtAssistantCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->removeCallback(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeTimeoutTask(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mUIHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method public runOnMainThread(Ljava/lang/Runnable;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mUIHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
