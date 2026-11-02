.class public Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;
.super Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;
.source "SourceFile"


# static fields
.field private static volatile H:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static getInstance()Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;
    .locals 1

    sget-object v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->H:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    return-object v0
.end method

.method public static init(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->H:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    if-nez v0, :cond_1

    const-class v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->H:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    if-nez v1, :cond_0

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-direct {v1, p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->H:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    return-void
.end method

.method public static isInit()Z
    .locals 1

    sget-object v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->H:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public bridge synthetic addOnBtAssistantCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->addOnBtAssistantCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V

    return-void
.end method

.method public bridge synthetic addOnBtBleListener(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->addOnBtBleListener(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;)V

    return-void
.end method

.method public bridge synthetic configure(Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->configure(Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V

    return-void
.end method

.method public bridge synthetic connectBLEDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->connectBLEDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic deviceHasA2dp(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->deviceHasA2dp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic deviceHasHfp(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->deviceHasHfp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic disconnectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->disconnectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic disconnectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->disconnectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic disconnectFromA2dp(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->disconnectFromA2dp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic disconnectFromA2dp(Ljava/lang/String;)Z
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->disconnectFromA2dp(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic disconnectFromHfp(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->disconnectFromHfp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic disconnectFromHfp(Ljava/lang/String;)Z
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->disconnectFromHfp(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic getBleMtu(Landroid/bluetooth/BluetoothDevice;)I
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getBleMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getBluetoothHfp()Landroid/bluetooth/BluetoothHeadset;
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->getBluetoothHfp()Landroid/bluetooth/BluetoothHeadset;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getConnectedBleDevices()Ljava/util/List;
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getConnectedBleDevices()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getConnectingBleDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getConnectingBleDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getDevicesConnectedByProfile()Ljava/util/List;
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->getDevicesConnectedByProfile()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDiscoveredBluetoothDevices()Ljava/util/ArrayList;
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->getDiscoveredBluetoothDevices()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getScanType()I
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->getScanType()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getUsingBleDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getUsingBleDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getmBluetoothA2dp()Landroid/bluetooth/BluetoothA2dp;
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->getmBluetoothA2dp()Landroid/bluetooth/BluetoothA2dp;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic isBleConnecting()Z
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->isBleConnecting()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isBluetoothEnable()Z
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->isBluetoothEnable()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isConnectedBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->isConnectedBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic isConnectedByProfile(Landroid/bluetooth/BluetoothDevice;)I
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->isConnectedByProfile(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic isScanning()Z
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->isScanning()Z

    move-result v0

    return v0
.end method

.method public release()V
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->release()V

    const/4 v0, 0x0

    sput-object v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->H:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    return-void
.end method

.method public bridge synthetic removeOnBtAssistantCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeOnBtAssistantCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V

    return-void
.end method

.method public bridge synthetic removeOnBtBleListener(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->removeOnBtBleListener(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;)V

    return-void
.end method

.method public bridge synthetic requestBleMtu(Landroid/bluetooth/BluetoothDevice;I)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->requestBleMtu(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic sendBleData(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->sendBleData(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)V

    return-void
.end method

.method public bridge synthetic startBLEScan(J)I
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->startBLEScan(J)I

    move-result p1

    return p1
.end method

.method public bridge synthetic startDeviceScan(JI)I
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->startDeviceScan(JI)I

    move-result p1

    return p1
.end method

.method public bridge synthetic stopBLEScan()I
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->stopBLEScan()I

    move-result v0

    return v0
.end method

.method public bridge synthetic stopDeviceScan()I
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->stopDeviceScan()I

    move-result v0

    return v0
.end method

.method public bridge synthetic switchBleCharacteristic(Landroid/bluetooth/BluetoothGatt;Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->switchBleCharacteristic(Landroid/bluetooth/BluetoothGatt;Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic switchConnectedBleDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->switchConnectedBleDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public bridge synthetic writeBleData(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)Z
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission",
            "WrongConstant"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->writeBleData(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)Z

    move-result p1

    return p1
.end method
