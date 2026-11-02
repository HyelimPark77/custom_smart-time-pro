.class Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ConnectionSppThread"
.end annotation


# static fields
.field private static final tag:Ljava/lang/String; = "ConnectionThread"


# instance fields
.field private final mDevice:Landroid/bluetooth/BluetoothDevice;

.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;


# direct methods
.method private constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0
        }
        names = {
            "this$0",
            "device"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    .line 3
    const-string p1, "ConnectionThread"

    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized run()V
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$100()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ConnectionThread"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "spp connect start. Device : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    iget-object v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v3, v4}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$200(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", uuid : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$1100(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v3

    invoke-virtual {v3}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getSppUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$900(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$900(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$1100(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v3

    invoke-virtual {v3}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getSppUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceHasProfile(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$100()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ConnectionThread"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device no spp uuid. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v4}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$1100(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getSppUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_0
    :goto_0
    const/4 v0, 0x2

    :try_start_1
    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$1100(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v3

    invoke-virtual {v3}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getSppUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/bluetooth/BluetoothDevice;->createRfcommSocketToServiceRecord(Ljava/util/UUID;)Landroid/bluetooth/BluetoothSocket;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothSocket;->connect()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v0

    goto :goto_2

    :catch_0
    move-exception v3

    goto :goto_1

    :catch_1
    move-exception v3

    move-object v2, v1

    :goto_1
    :try_start_3
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$100()Ljava/lang/String;

    move-result-object v4

    const-string v5, "ConnectionThread"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "spp connect occurred exception : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v5, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    :goto_2
    if-eq v0, v3, :cond_1

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$100()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ConnectionThread"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "spp connect failed. "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    iget-object v6, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v5, v6}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$200(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v2, v4}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, v2, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$300(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$1302(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;)Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_4
    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$100()Ljava/lang/String;

    move-result-object v3

    const-string v4, "ConnectionThread"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "spp connect ok. "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    iget-object v7, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v6, v7}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$200(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$1400(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    if-nez v3, :cond_2

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    iget-object v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v3, v4}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->setConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_2
    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$1500(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$1500(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$1600(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Ljava/util/Map;

    move-result-object v3

    iget-object v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    iget-object v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v3, v4, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothSocket;)V

    :cond_3
    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->mDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v2, v3, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$300(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;I)V

    :cond_4
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$1302(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;)Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$100()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ConnectionThread"

    const-string v2, "exit"

    invoke-static {v0, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :goto_3
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0
.end method
