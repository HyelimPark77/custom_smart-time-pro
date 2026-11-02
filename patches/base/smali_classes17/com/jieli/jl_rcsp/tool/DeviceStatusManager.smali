.class public Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/model/device/DeviceStatus;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->a:Ljava/util/Map;

    return-void
.end method

.method public static getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;
    .locals 2

    sget-object v0, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    if-nez v0, :cond_1

    const-class v0, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    if-nez v1, :cond_0

    new-instance v1, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;-><init>()V

    sput-object v1, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_2
    sget-object v0, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 2

    if-eqz p1, :cond_e

    if-eqz p2, :cond_e

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getVid()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getVid()I

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getVid()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getVid()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setVid(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getUid()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getUid()I

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getUid()I

    move-result v1

    if-eq v0, v1, :cond_1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getUid()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setUid(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getPid()I

    move-result v0

    if-ltz v0, :cond_2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getPid()I

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getPid()I

    move-result v1

    if-eq v0, v1, :cond_2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getPid()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setPid(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setDeviceName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_3
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getLeftDeviceQuantity()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getLeftDeviceQuantity()I

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getLeftDeviceQuantity()I

    move-result v1

    if-eq v0, v1, :cond_4

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getLeftDeviceQuantity()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setLeftDeviceQuantity(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_4
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getRightDeviceQuantity()I

    move-result v0

    if-ltz v0, :cond_5

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getRightDeviceQuantity()I

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getRightDeviceQuantity()I

    move-result v1

    if-eq v0, v1, :cond_5

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getRightDeviceQuantity()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setRightDeviceQuantity(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_5
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getChargingBinQuantity()I

    move-result v0

    if-ltz v0, :cond_6

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getChargingBinQuantity()I

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getChargingBinQuantity()I

    move-result v1

    if-eq v0, v1, :cond_6

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getChargingBinQuantity()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setChargingBinQuantity(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_6
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isLeftCharging()Z

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isLeftCharging()Z

    move-result v1

    if-eq v0, v1, :cond_7

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isLeftCharging()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setLeftCharging(Z)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_7
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isRightCharging()Z

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isRightCharging()Z

    move-result v1

    if-eq v0, v1, :cond_8

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isRightCharging()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setRightCharging(Z)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_8
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isDeviceCharging()Z

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isDeviceCharging()Z

    move-result v1

    if-eq v0, v1, :cond_9

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isDeviceCharging()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setDeviceCharging(Z)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_9
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getWorkModel()I

    move-result v0

    if-ltz v0, :cond_a

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getWorkModel()I

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getWorkModel()I

    move-result v1

    if-eq v0, v1, :cond_a

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getWorkModel()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setWorkModel(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_a
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getMicChannel()I

    move-result v0

    if-ltz v0, :cond_b

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getMicChannel()I

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getMicChannel()I

    move-result v1

    if-eq v0, v1, :cond_b

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getMicChannel()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setMicChannel(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_b
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getKeySettingsList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getKeySettingsList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getKeySettingsList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setKeySettingsList(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_c
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getLedSettingsList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getLedSettingsList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getLedSettingsList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setLedSettingsList(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    :cond_d
    return-object p1

    :cond_e
    if-eqz p1, :cond_f

    return-object p1

    :cond_f
    if-eqz p2, :cond_10

    return-object p2

    :cond_10
    const/4 p1, 0x0

    return-object p1
.end method

.method public getAdvInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getADVInfo()Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    move-result-object p1

    return-object p1
.end method

.method public getDevMD5(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getDevMD5()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getDeviceConfigure(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getDeviceConfigure()Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    move-result-object p1

    return-object p1
.end method

.method public getDeviceConnectStatus(Landroid/bluetooth/BluetoothDevice;)I
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getStatus()I

    move-result p1

    return p1
.end method

.method public getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object p1

    return-object p1
.end method

.method public getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    return-object p1
.end method

.method public getDeviceStatus(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 1

    .line 2
    invoke-static {p1}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getDeviceVoiceConfig(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/VoiceData;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getVoiceData()Lcom/jieli/jl_rcsp/model/device/VoiceData;

    move-result-object p1

    return-object p1
.end method

.method public getDeviceWorkMode(Landroid/bluetooth/BluetoothDevice;)I
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x3

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getWorkMode()I

    move-result p1

    return p1
.end method

.method public getExtFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getExtFlashMSg()Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object p1

    return-object p1
.end method

.method public getLatencySettings(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getLatencySettings()Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;

    move-result-object p1

    return-object p1
.end method

.method public getMaxCommunicationMtu(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getMaxCommunicationMtu()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getMaxCommunicationMtu()I

    move-result p1

    return p1

    :cond_0
    const/16 p1, 0x212

    return p1
.end method

.method public getMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getMaxReceiveMtu()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getMaxReceiveMtu()I

    move-result p1

    return p1

    :cond_0
    const/16 p1, 0x212

    return p1
.end method

.method public isAuthBtDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isAuthDevice()Z

    move-result p1

    return p1
.end method

.method public isDataTransfer(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isDataTransfer()Z

    move-result p1

    return p1
.end method

.method public isDoubleBackupUpgrade(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportDoubleBackup()Z

    move-result p1

    return p1
.end method

.method public isEnableLatencyMode(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isEnableLatencyMode()Z

    move-result p1

    return p1
.end method

.method public isEnterLowPowerMode(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isEnterLowPowerMode()Z

    move-result p1

    return p1
.end method

.method public isFileTransfer(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isFileTransfer()Z

    move-result p1

    return p1
.end method

.method public isMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isMandatoryUpgrade()Z

    move-result p1

    return p1
.end method

.method public isTwsConnected(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isTwsConnected()Z

    move-result p1

    return p1
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    sput-object v0, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    return-void
.end method

.method public removeDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->removeDeviceStatus(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object p1

    return-object p1
.end method

.method public removeDeviceStatus(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 1

    .line 2
    invoke-static {p1}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public updateDataTransfer(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isDataTransfer()Z

    move-result v1

    if-eq v1, p2, :cond_1

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setDataTransfer(Z)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public updateDeviceAdvInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;-><init>()V

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setADVInfo(Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getADVInfo()Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->a(Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setADVInfo(Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    return-void
.end method

.method public updateDeviceConfigure(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setDeviceConfigure(Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    return-void
.end method

.method public updateDeviceConnectStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;-><init>()V

    :cond_0
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setStatus(I)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    return-void
.end method

.method public updateDeviceInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceInfo;)V
    .locals 4

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;-><init>()V

    :cond_0
    const/4 v1, 0x1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->isMandatoryUpgrade()Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v3, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->mergeTargetInfos(Lcom/jieli/jl_rcsp/model/device/DeviceInfo;Lcom/jieli/jl_rcsp/model/device/DeviceInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setDeviceInfo(Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    goto :goto_1

    :cond_2
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setDeviceInfo(Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    :goto_1
    if-eqz v2, :cond_3

    const/4 v1, 0x2

    :cond_3
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setWorkMode(I)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    return-void
.end method

.method public updateDeviceIsAuth(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;-><init>()V

    :cond_0
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setAuthDevice(Z)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    return-void
.end method

.method public updateDeviceIsEnableLatencyMode(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setEnableLatencyMode(Z)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    return-void
.end method

.method public updateDeviceIsEnterLowPowerMode(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 0

    if-eqz p2, :cond_0

    const/4 p2, 0x3

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateWorkMode(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public updateDeviceLowLatencySettings(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setLatencySettings(Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    return-void
.end method

.method public updateDeviceMD5(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setDevMD5(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    return-void
.end method

.method public updateDeviceMaxCommunicationMtu(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;-><init>()V

    :cond_0
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setMaxCommunicationMtu(I)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    return-void
.end method

.method public updateDeviceMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;-><init>()V

    :cond_0
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setMaxReceiveMtu(I)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    return-void
.end method

.method public updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Ljava/lang/String;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    :cond_0
    return-void
.end method

.method public updateDeviceStatus(Ljava/lang/String;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V
    .locals 1

    .line 2
    invoke-static {p1}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public updateDeviceTargetInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;)V
    .locals 0

    invoke-static {p2}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->convertFromTargetInfo(Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceInfo;)V

    return-void
.end method

.method public updateDeviceVoiceConfig(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/VoiceData;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_2

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getVoiceData()Lcom/jieli/jl_rcsp/model/device/VoiceData;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/jieli/jl_rcsp/model/device/VoiceData;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :cond_2
    :goto_1
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setVoiceData(Lcom/jieli/jl_rcsp/model/device/VoiceData;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    return-void
.end method

.method public updateExtFlashMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;-><init>()V

    :cond_0
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setExtFlashMSg(Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    return-void
.end method

.method public updateFileTransfer(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isFileTransfer()Z

    move-result v1

    if-eq v1, p2, :cond_1

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setFileTransfer(Z)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public updateWorkMode(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getWorkMode()I

    move-result v1

    if-eq v1, p2, :cond_1

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setWorkMode(I)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceStatus(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceStatus;)V

    :cond_1
    :goto_0
    return-void
.end method
