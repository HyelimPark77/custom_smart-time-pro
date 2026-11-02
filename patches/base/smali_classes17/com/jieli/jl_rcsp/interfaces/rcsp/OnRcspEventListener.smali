.class public abstract Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAlarmDefaultBellListChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/DefaultAlarmBell;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onAlarmListChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;)V
    .locals 0

    return-void
.end method

.method public onAlarmNotify(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;)V
    .locals 0

    return-void
.end method

.method public onAlarmStop(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;)V
    .locals 0

    return-void
.end method

.method public onAuxStatusChange(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 0

    return-void
.end method

.method public onBatteryChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;)V
    .locals 0

    return-void
.end method

.method public onCurrentVoiceMode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/VoiceMode;)V
    .locals 0

    return-void
.end method

.method public onDevStorageInfoChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;)V
    .locals 0

    return-void
.end method

.method public onDeviceModeChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    return-void
.end method

.method public onDynamicLimiter(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;)V
    .locals 0

    return-void
.end method

.method public onEqChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V
    .locals 0

    return-void
.end method

.method public onEqPresetChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;)V
    .locals 0

    return-void
.end method

.method public onExpandFunction(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 0

    return-void
.end method

.method public onFileFormatChange(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onFmChannelsChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/ChannelInfo;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onFmStatusChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;)V
    .locals 0

    return-void
.end method

.method public onFrequencyTx(Landroid/bluetooth/BluetoothDevice;F)V
    .locals 0

    return-void
.end method

.method public onHealthDataChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/HealthData;)V
    .locals 0

    return-void
.end method

.method public onHealthSettingChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;)V
    .locals 0

    return-void
.end method

.method public onHighAndBassChange(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 0

    return-void
.end method

.method public onID3MusicInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;)V
    .locals 0

    return-void
.end method

.method public onLightControlInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/LightControlInfo;)V
    .locals 0

    return-void
.end method

.method public onMusicNameChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;)V
    .locals 0

    return-void
.end method

.method public onMusicStatusChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;)V
    .locals 0

    return-void
.end method

.method public onPeripheralsConnectStatusChange(Landroid/bluetooth/BluetoothDevice;ZLjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onPeripheralsModeChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    return-void
.end method

.method public onPhoneCallStatusChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    return-void
.end method

.method public onPlatformInterfaceInfoChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/LtvBean;",
            ">;>;)V"
        }
    .end annotation

    return-void
.end method

.method public onPlayModeChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;)V
    .locals 0

    return-void
.end method

.method public onReverberation(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/ReverberationParam;)V
    .locals 0

    return-void
.end method

.method public onSensorLogDataChange(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 0

    return-void
.end method

.method public onSoundCardEqChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V
    .locals 0

    return-void
.end method

.method public onSoundCardStatusChange(Landroid/bluetooth/BluetoothDevice;J[B)V
    .locals 0

    return-void
.end method

.method public onSportInfoChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;)V
    .locals 0

    return-void
.end method

.method public onSportsState(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    return-void
.end method

.method public onVoiceModeList(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/VoiceMode;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onVolumeChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/VolumeInfo;)V
    .locals 0

    return-void
.end method
