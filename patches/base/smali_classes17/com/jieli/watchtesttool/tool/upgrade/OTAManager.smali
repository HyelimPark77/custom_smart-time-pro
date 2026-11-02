.class public Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;
.super Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;
    }
.end annotation


# static fields
.field public static final OTA_FILE_NAME:Ljava/lang/String; = "update.ufw"

.field public static final OTA_FILE_SUFFIX:Ljava/lang/String; = ".ufw"

.field public static final OTA_ZIP_SUFFIX:Ljava/lang/String; = ".zip"


# instance fields
.field private final mBluetoothEventListener:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;

.field private final mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

.field private mContext:Landroid/content/Context;

.field private mNeedReconnectAddress:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$1;

    invoke-direct {v0, p0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$1;-><init>(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;)V

    iput-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothEventListener:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getInstance(Landroid/app/Application;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {p1, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->addBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    invoke-direct {p0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->configureOTA()V

    return-void
.end method

.method public static synthetic access$000(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;
    .locals 0

    iget-object p0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    return-object p0
.end method

.method public static synthetic access$100(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mNeedReconnectAddress:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$102(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mNeedReconnectAddress:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic access$200(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;)Z
    .locals 0

    invoke-direct {p0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->isSingleOTA()Z

    move-result p0

    return p0
.end method

.method public static synthetic access$300(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->updateHistoryRecord(Ljava/lang/String;)V

    return-void
.end method

.method private checkDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getBleMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result v0

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    add-int/lit8 v0, v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    :cond_0
    return-void
.end method

.method private configureOTA()V
    .locals 5

    invoke-static {}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->createDefault()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getPriority()I

    move-result v1

    iget-object v2, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->isConnectedDevice()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getConnectedBtDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    :cond_0
    iget-object v2, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->setNotAssociatedEDR(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->setPriority(I)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->setNeedChangeMtu(Z)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v1

    const/16 v4, 0x14

    invoke-virtual {v1, v4}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->setMtu(I)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->setUseAuthDevice(Z)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->setUseReconnect(Z)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mContext:Landroid/content/Context;

    const-string v2, "upgrade"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/jieli/watchtesttool/util/AppUtil;->createFilePath(Landroid/content/Context;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->mkdir()Z

    move-result v4

    :cond_1
    if-eqz v4, :cond_3

    const-string v2, ".ufw"

    invoke-static {v1, v2}, Lcom/jieli/watchtesttool/util/AppUtil;->obtainUpdateFilePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "update.ufw"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual {v0, v2}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->setFirmwareFilePath(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    :cond_3
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "configureOTA >> "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->configure(Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->isConnectedDevice()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p0, v0, v3}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->onBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->checkDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_4
    return-void
.end method

.method private isSingleOTA()Z
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getDeviceInfo()Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isSupportDoubleBackup()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private updateHistoryRecord(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mNeedReconnectAddress:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getUpdateAddress()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getUpdateAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setUpdateAddress(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getHistoryRecordHelper()Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->updateHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public connectBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->updateHistoryRecord(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->connectDeviceWithoutRecord(Landroid/bluetooth/BluetoothDevice;)Z

    return-void
.end method

.method public disconnectBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->disconnectDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public getConnectedBluetoothGatt()Landroid/bluetooth/BluetoothGatt;
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {p0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getConnectedBluetoothGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    return-object v0
.end method

.method public getConnectedDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getConnectedBtDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public release()V
    .locals 2

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->release()V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothEventListener:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;

    invoke-virtual {v0, v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->removeBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    return-void
.end method

.method public sendDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->sendDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p1

    return p1
.end method

.method public startOTA(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;)V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->checkDevice(Landroid/bluetooth/BluetoothDevice;)V

    new-instance v0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;

    invoke-direct {v0, p0, p1}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;-><init>(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;)V

    invoke-super {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->startOTA(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;)V

    return-void
.end method
