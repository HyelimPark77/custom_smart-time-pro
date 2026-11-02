.class public Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;
.super Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager<",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;FLcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 15
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onFrequencyTx(Landroid/bluetooth/BluetoothDevice;F)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;IILcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 18
    invoke-virtual {p3, p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onHighAndBassChange(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onDeviceModeChange(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;I[BLcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 20
    invoke-virtual {p3, p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onExpandFunction(Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;J[BLcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 24
    invoke-virtual {p4, p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onSoundCardStatusChange(Landroid/bluetooth/BluetoothDevice;J[B)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 14
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onAlarmNotify(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 12
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onAlarmListChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 9
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onBatteryChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 4
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onDevStorageInfoChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 22
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onDynamicLimiter(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 3
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onEqChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 19
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onEqPresetChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 11
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onFmStatusChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 17
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onID3MusicInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/LightControlInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 23
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onLightControlInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/LightControlInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 6
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onMusicNameChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 7
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onMusicStatusChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 8
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onPlayModeChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/ReverberationParam;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 21
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onReverberation(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/ReverberationParam;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/VoiceMode;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 25
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onCurrentVoiceMode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/VoiceMode;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/VolumeInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 2
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onVolumeChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/VolumeInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/HealthData;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 26
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onHealthDataChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/HealthData;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 27
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onHealthSettingChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 28
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onSportInfoChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 5
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onFileFormatChange(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 13
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onAlarmDefaultBellListChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Ljava/util/Map;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 29
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onPlatformInterfaceInfoChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;ZLcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 10
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onAuxStatusChange(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;ZLjava/lang/String;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 16
    invoke-virtual {p3, p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onPeripheralsConnectStatusChange(Landroid/bluetooth/BluetoothDevice;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 3
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onPeripheralsModeChange(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic b(Landroid/bluetooth/BluetoothDevice;I[BLcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 5
    invoke-virtual {p3, p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onSensorLogDataChange(Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void
.end method

.method public static synthetic b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 2
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onAlarmStop(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;)V

    return-void
.end method

.method public static synthetic b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqInfo;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 4
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onSoundCardEqChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    return-void
.end method

.method public static synthetic b(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onFmChannelsChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic c(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onPhoneCallStatusChange(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic c(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    .line 2
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onVoiceModeList(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic d(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 0

    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;->onSportsState(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method


# virtual methods
.method public onAlarmDefaultBellListChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/DefaultAlarmBell;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xd2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/xd2;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onAlarmListChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/se2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/se2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onAlarmNotify(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/we2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/we2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onAlarmStop(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ne2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ne2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onAuxStatusChange(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vd2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/vd2;-><init>(Landroid/bluetooth/BluetoothDevice;Z)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onBatteryChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/oe2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/oe2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onCurrentVoiceMode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/VoiceMode;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ze2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ze2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/VoiceMode;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onDevStorageInfoChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/he2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/he2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onDeviceModeChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ae2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ae2;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onDynamicLimiter(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pe2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/pe2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onEqChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ud2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ud2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onEqPresetChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/td2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/td2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onExpandFunction(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wd2;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/wd2;-><init>(Landroid/bluetooth/BluetoothDevice;I[B)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onFileFormatChange(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qd2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/qd2;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onFmChannelsChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/ChannelInfo;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ke2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ke2;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onFmStatusChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/le2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/le2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onFrequencyTx(Landroid/bluetooth/BluetoothDevice;F)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fe2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/fe2;-><init>(Landroid/bluetooth/BluetoothDevice;F)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onHealthDataChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/HealthData;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ce2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ce2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/HealthData;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onHealthSettingChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sd2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/sd2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onHighAndBassChange(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pd2;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/pd2;-><init>(Landroid/bluetooth/BluetoothDevice;II)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onID3MusicInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ve2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ve2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onLightControlInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/LightControlInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/de2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/de2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/LightControlInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onMusicNameChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xe2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/xe2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onMusicStatusChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ue2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ue2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onPeripheralsConnectStatusChange(Landroid/bluetooth/BluetoothDevice;ZLjava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zd2;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/zd2;-><init>(Landroid/bluetooth/BluetoothDevice;ZLjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onPeripheralsModeChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/me2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/me2;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onPhoneCallStatusChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/be2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/be2;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onPlatformInterfaceInfoChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/Map;)V
    .locals 1
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ie2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ie2;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onPlayModeChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ee2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ee2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onReverberation(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/ReverberationParam;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/te2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/te2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/ReverberationParam;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onSensorLogDataChange(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/je2;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/je2;-><init>(Landroid/bluetooth/BluetoothDevice;I[B)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onSoundCardEqChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rd2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/rd2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onSoundCardStatusChange(Landroid/bluetooth/BluetoothDevice;J[B)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yd2;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/android/mltcode/paycertificationapi/yd2;-><init>(Landroid/bluetooth/BluetoothDevice;J[B)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onSportInfoChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ye2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ye2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onSportsState(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qe2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/qe2;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onVoiceModeList(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/VoiceMode;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ge2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ge2;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onVolumeChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/VolumeInfo;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/re2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/re2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/VolumeInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method
