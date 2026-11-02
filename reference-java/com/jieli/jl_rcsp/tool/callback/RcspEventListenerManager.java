package com.jieli.jl_rcsp.tool.callback;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspEventListener;
import com.jieli.jl_rcsp.model.LtvBean;
import com.jieli.jl_rcsp.model.device.AlarmBean;
import com.jieli.jl_rcsp.model.device.AlarmListInfo;
import com.jieli.jl_rcsp.model.device.BatteryInfo;
import com.jieli.jl_rcsp.model.device.ChannelInfo;
import com.jieli.jl_rcsp.model.device.DefaultAlarmBell;
import com.jieli.jl_rcsp.model.device.DevStorageInfo;
import com.jieli.jl_rcsp.model.device.DynamicLimiterParam;
import com.jieli.jl_rcsp.model.device.EqInfo;
import com.jieli.jl_rcsp.model.device.EqPresetInfo;
import com.jieli.jl_rcsp.model.device.FmStatusInfo;
import com.jieli.jl_rcsp.model.device.ID3MusicInfo;
import com.jieli.jl_rcsp.model.device.LightControlInfo;
import com.jieli.jl_rcsp.model.device.MusicNameInfo;
import com.jieli.jl_rcsp.model.device.MusicStatusInfo;
import com.jieli.jl_rcsp.model.device.PlayModeInfo;
import com.jieli.jl_rcsp.model.device.ReverberationParam;
import com.jieli.jl_rcsp.model.device.VoiceMode;
import com.jieli.jl_rcsp.model.device.VolumeInfo;
import com.jieli.jl_rcsp.model.device.health.HealthData;
import com.jieli.jl_rcsp.model.device.health.HealthSettingInfo;
import com.jieli.jl_rcsp.model.device.health.SportsInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class RcspEventListenerManager extends BaseCallbackManager<OnRcspEventListener> {
    public void onAlarmDefaultBellListChange(final BluetoothDevice bluetoothDevice, final List<DefaultAlarmBell> list) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.xd2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onAlarmDefaultBellListChange(bluetoothDevice, list);
            }
        });
    }

    public void onAlarmListChange(final BluetoothDevice bluetoothDevice, final AlarmListInfo alarmListInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.se2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onAlarmListChange(bluetoothDevice, alarmListInfo);
            }
        });
    }

    public void onAlarmNotify(final BluetoothDevice bluetoothDevice, final AlarmBean alarmBean) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.we2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onAlarmNotify(bluetoothDevice, alarmBean);
            }
        });
    }

    public void onAlarmStop(final BluetoothDevice bluetoothDevice, final AlarmBean alarmBean) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.ne2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onAlarmStop(bluetoothDevice, alarmBean);
            }
        });
    }

    public void onAuxStatusChange(final BluetoothDevice bluetoothDevice, final boolean z) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.vd2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onAuxStatusChange(bluetoothDevice, z);
            }
        });
    }

    public void onBatteryChange(final BluetoothDevice bluetoothDevice, final BatteryInfo batteryInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.oe2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onBatteryChange(bluetoothDevice, batteryInfo);
            }
        });
    }

    public void onCurrentVoiceMode(final BluetoothDevice bluetoothDevice, final VoiceMode voiceMode) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.ze2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onCurrentVoiceMode(bluetoothDevice, voiceMode);
            }
        });
    }

    public void onDevStorageInfoChange(final BluetoothDevice bluetoothDevice, final DevStorageInfo devStorageInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.he2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onDevStorageInfoChange(bluetoothDevice, devStorageInfo);
            }
        });
    }

    public void onDeviceModeChange(final BluetoothDevice bluetoothDevice, final int i) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.ae2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onDeviceModeChange(bluetoothDevice, i);
            }
        });
    }

    public void onDynamicLimiter(final BluetoothDevice bluetoothDevice, final DynamicLimiterParam dynamicLimiterParam) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.pe2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onDynamicLimiter(bluetoothDevice, dynamicLimiterParam);
            }
        });
    }

    public void onEqChange(final BluetoothDevice bluetoothDevice, final EqInfo eqInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.ud2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onEqChange(bluetoothDevice, eqInfo);
            }
        });
    }

    public void onEqPresetChange(final BluetoothDevice bluetoothDevice, final EqPresetInfo eqPresetInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.td2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onEqPresetChange(bluetoothDevice, eqPresetInfo);
            }
        });
    }

    public void onExpandFunction(final BluetoothDevice bluetoothDevice, final int i, final byte[] bArr) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.wd2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onExpandFunction(bluetoothDevice, i, bArr);
            }
        });
    }

    public void onFileFormatChange(final BluetoothDevice bluetoothDevice, final String str) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.qd2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onFileFormatChange(bluetoothDevice, str);
            }
        });
    }

    public void onFmChannelsChange(final BluetoothDevice bluetoothDevice, final List<ChannelInfo> list) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.ke2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onFmChannelsChange(bluetoothDevice, list);
            }
        });
    }

    public void onFmStatusChange(final BluetoothDevice bluetoothDevice, final FmStatusInfo fmStatusInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.le2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onFmStatusChange(bluetoothDevice, fmStatusInfo);
            }
        });
    }

    public void onFrequencyTx(final BluetoothDevice bluetoothDevice, final float f) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.fe2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onFrequencyTx(bluetoothDevice, f);
            }
        });
    }

    public void onHealthDataChange(final BluetoothDevice bluetoothDevice, final HealthData healthData) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.ce2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onHealthDataChange(bluetoothDevice, healthData);
            }
        });
    }

    public void onHealthSettingChange(final BluetoothDevice bluetoothDevice, final HealthSettingInfo healthSettingInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.sd2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onHealthSettingChange(bluetoothDevice, healthSettingInfo);
            }
        });
    }

    public void onHighAndBassChange(final BluetoothDevice bluetoothDevice, final int i, final int i2) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.pd2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onHighAndBassChange(bluetoothDevice, i, i2);
            }
        });
    }

    public void onID3MusicInfo(final BluetoothDevice bluetoothDevice, final ID3MusicInfo iD3MusicInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.ve2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onID3MusicInfo(bluetoothDevice, iD3MusicInfo);
            }
        });
    }

    public void onLightControlInfo(final BluetoothDevice bluetoothDevice, final LightControlInfo lightControlInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.de2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onLightControlInfo(bluetoothDevice, lightControlInfo);
            }
        });
    }

    public void onMusicNameChange(final BluetoothDevice bluetoothDevice, final MusicNameInfo musicNameInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.xe2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onMusicNameChange(bluetoothDevice, musicNameInfo);
            }
        });
    }

    public void onMusicStatusChange(final BluetoothDevice bluetoothDevice, final MusicStatusInfo musicStatusInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.ue2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onMusicStatusChange(bluetoothDevice, musicStatusInfo);
            }
        });
    }

    public void onPeripheralsConnectStatusChange(final BluetoothDevice bluetoothDevice, final boolean z, final String str) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.zd2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onPeripheralsConnectStatusChange(bluetoothDevice, z, str);
            }
        });
    }

    public void onPeripheralsModeChange(final BluetoothDevice bluetoothDevice, final int i) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.me2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onPeripheralsModeChange(bluetoothDevice, i);
            }
        });
    }

    public void onPhoneCallStatusChange(final BluetoothDevice bluetoothDevice, final int i) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.be2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onPhoneCallStatusChange(bluetoothDevice, i);
            }
        });
    }

    public void onPlatformInterfaceInfoChange(final BluetoothDevice bluetoothDevice, final Map<Integer, List<LtvBean>> map) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.ie2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onPlatformInterfaceInfoChange(bluetoothDevice, map);
            }
        });
    }

    public void onPlayModeChange(final BluetoothDevice bluetoothDevice, final PlayModeInfo playModeInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.ee2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onPlayModeChange(bluetoothDevice, playModeInfo);
            }
        });
    }

    public void onReverberation(final BluetoothDevice bluetoothDevice, final ReverberationParam reverberationParam) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.te2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onReverberation(bluetoothDevice, reverberationParam);
            }
        });
    }

    public void onSensorLogDataChange(final BluetoothDevice bluetoothDevice, final int i, final byte[] bArr) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.je2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onSensorLogDataChange(bluetoothDevice, i, bArr);
            }
        });
    }

    public void onSoundCardEqChange(final BluetoothDevice bluetoothDevice, final EqInfo eqInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.rd2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onSoundCardEqChange(bluetoothDevice, eqInfo);
            }
        });
    }

    public void onSoundCardStatusChange(final BluetoothDevice bluetoothDevice, final long j, final byte[] bArr) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.yd2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onSoundCardStatusChange(bluetoothDevice, j, bArr);
            }
        });
    }

    public void onSportInfoChange(final BluetoothDevice bluetoothDevice, final SportsInfo sportsInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.ye2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onSportInfoChange(bluetoothDevice, sportsInfo);
            }
        });
    }

    public void onSportsState(final BluetoothDevice bluetoothDevice, final int i) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.qe2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onSportsState(bluetoothDevice, i);
            }
        });
    }

    public void onVoiceModeList(final BluetoothDevice bluetoothDevice, final List<VoiceMode> list) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.ge2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onVoiceModeList(bluetoothDevice, list);
            }
        });
    }

    public void onVolumeChange(final BluetoothDevice bluetoothDevice, final VolumeInfo volumeInfo) {
        callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.re2
            @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
            public final void onPost(Object obj) {
                ((OnRcspEventListener) obj).onVolumeChange(bluetoothDevice, volumeInfo);
            }
        });
    }
}
