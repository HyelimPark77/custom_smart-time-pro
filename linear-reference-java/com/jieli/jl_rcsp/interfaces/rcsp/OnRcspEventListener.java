package com.jieli.jl_rcsp.interfaces.rcsp;

import android.bluetooth.BluetoothDevice;
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
public abstract class OnRcspEventListener {
    public OnRcspEventListener() {
    }

    public void onAlarmDefaultBellListChange(BluetoothDevice r1, List<DefaultAlarmBell> r2) {
    }

    public void onAlarmListChange(BluetoothDevice r1, AlarmListInfo r2) {
    }

    public void onAlarmNotify(BluetoothDevice r1, AlarmBean r2) {
    }

    public void onAlarmStop(BluetoothDevice r1, AlarmBean r2) {
    }

    public void onAuxStatusChange(BluetoothDevice r1, boolean r2) {
    }

    public void onBatteryChange(BluetoothDevice r1, BatteryInfo r2) {
    }

    public void onCurrentVoiceMode(BluetoothDevice r1, VoiceMode r2) {
    }

    public void onDevStorageInfoChange(BluetoothDevice r1, DevStorageInfo r2) {
    }

    public void onDeviceModeChange(BluetoothDevice r1, int r2) {
    }

    public void onDynamicLimiter(BluetoothDevice r1, DynamicLimiterParam r2) {
    }

    public void onEqChange(BluetoothDevice r1, EqInfo r2) {
    }

    public void onEqPresetChange(BluetoothDevice r1, EqPresetInfo r2) {
    }

    public void onExpandFunction(BluetoothDevice r1, int r2, byte[] r3) {
    }

    public void onFileFormatChange(BluetoothDevice r1, String r2) {
    }

    public void onFmChannelsChange(BluetoothDevice r1, List<ChannelInfo> r2) {
    }

    public void onFmStatusChange(BluetoothDevice r1, FmStatusInfo r2) {
    }

    public void onFrequencyTx(BluetoothDevice r1, float r2) {
    }

    public void onHealthDataChange(BluetoothDevice r1, HealthData r2) {
    }

    public void onHealthSettingChange(BluetoothDevice r1, HealthSettingInfo r2) {
    }

    public void onHighAndBassChange(BluetoothDevice r1, int r2, int r3) {
    }

    public void onID3MusicInfo(BluetoothDevice r1, ID3MusicInfo r2) {
    }

    public void onLightControlInfo(BluetoothDevice r1, LightControlInfo r2) {
    }

    public void onMusicNameChange(BluetoothDevice r1, MusicNameInfo r2) {
    }

    public void onMusicStatusChange(BluetoothDevice r1, MusicStatusInfo r2) {
    }

    public void onPeripheralsConnectStatusChange(BluetoothDevice r1, boolean r2, String r3) {
    }

    public void onPeripheralsModeChange(BluetoothDevice r1, int r2) {
    }

    public void onPhoneCallStatusChange(BluetoothDevice r1, int r2) {
    }

    public void onPlatformInterfaceInfoChange(BluetoothDevice r1, Map<Integer, List<LtvBean>> r2) {
    }

    public void onPlayModeChange(BluetoothDevice r1, PlayModeInfo r2) {
    }

    public void onReverberation(BluetoothDevice r1, ReverberationParam r2) {
    }

    public void onSensorLogDataChange(BluetoothDevice r1, int r2, byte[] r3) {
    }

    public void onSoundCardEqChange(BluetoothDevice r1, EqInfo r2) {
    }

    public void onSoundCardStatusChange(BluetoothDevice r1, long r2, byte[] r4) {
    }

    public void onSportInfoChange(BluetoothDevice r1, SportsInfo r2) {
    }

    public void onSportsState(BluetoothDevice r1, int r2) {
    }

    public void onVoiceModeList(BluetoothDevice r1, List<VoiceMode> r2) {
    }

    public void onVolumeChange(BluetoothDevice r1, VolumeInfo r2) {
    }
}
