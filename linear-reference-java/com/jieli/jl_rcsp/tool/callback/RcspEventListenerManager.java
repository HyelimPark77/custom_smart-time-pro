package com.jieli.jl_rcsp.tool.callback;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.ae2;
import com.android.mltcode.paycertificationapi.be2;
import com.android.mltcode.paycertificationapi.ce2;
import com.android.mltcode.paycertificationapi.de2;
import com.android.mltcode.paycertificationapi.ee2;
import com.android.mltcode.paycertificationapi.fe2;
import com.android.mltcode.paycertificationapi.ge2;
import com.android.mltcode.paycertificationapi.he2;
import com.android.mltcode.paycertificationapi.ie2;
import com.android.mltcode.paycertificationapi.je2;
import com.android.mltcode.paycertificationapi.ke2;
import com.android.mltcode.paycertificationapi.le2;
import com.android.mltcode.paycertificationapi.me2;
import com.android.mltcode.paycertificationapi.ne2;
import com.android.mltcode.paycertificationapi.oe2;
import com.android.mltcode.paycertificationapi.pd2;
import com.android.mltcode.paycertificationapi.pe2;
import com.android.mltcode.paycertificationapi.qd2;
import com.android.mltcode.paycertificationapi.qe2;
import com.android.mltcode.paycertificationapi.rd2;
import com.android.mltcode.paycertificationapi.re2;
import com.android.mltcode.paycertificationapi.sd2;
import com.android.mltcode.paycertificationapi.se2;
import com.android.mltcode.paycertificationapi.td2;
import com.android.mltcode.paycertificationapi.te2;
import com.android.mltcode.paycertificationapi.ud2;
import com.android.mltcode.paycertificationapi.ue2;
import com.android.mltcode.paycertificationapi.vd2;
import com.android.mltcode.paycertificationapi.ve2;
import com.android.mltcode.paycertificationapi.wd2;
import com.android.mltcode.paycertificationapi.we2;
import com.android.mltcode.paycertificationapi.xd2;
import com.android.mltcode.paycertificationapi.xe2;
import com.android.mltcode.paycertificationapi.yd2;
import com.android.mltcode.paycertificationapi.ye2;
import com.android.mltcode.paycertificationapi.zd2;
import com.android.mltcode.paycertificationapi.ze2;
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
    public RcspEventListenerManager() {
    }

    public static /* synthetic */ void a(BluetoothDevice r0, int r1, OnRcspEventListener r2) {
        r2.onDeviceModeChange(r0, r1);
    }

    public static /* synthetic */ void b(BluetoothDevice r0, List r1, OnRcspEventListener r2) {
        r2.onFmChannelsChange(r0, r1);
    }

    public static /* synthetic */ void c(BluetoothDevice r0, int r1, OnRcspEventListener r2) {
        r2.onPhoneCallStatusChange(r0, r1);
    }

    public static /* synthetic */ void d(BluetoothDevice r0, int r1, OnRcspEventListener r2) {
        r2.onSportsState(r0, r1);
    }

    public void onAlarmDefaultBellListChange(final BluetoothDevice r2, final List<DefaultAlarmBell> r3) {
        callbackEvent(new xd2(r2, r3));
    }

    public void onAlarmListChange(final BluetoothDevice r2, final AlarmListInfo r3) {
        callbackEvent(new se2(r2, r3));
    }

    public void onAlarmNotify(final BluetoothDevice r2, final AlarmBean r3) {
        callbackEvent(new we2(r2, r3));
    }

    public void onAlarmStop(final BluetoothDevice r2, final AlarmBean r3) {
        callbackEvent(new ne2(r2, r3));
    }

    public void onAuxStatusChange(final BluetoothDevice r2, final boolean r3) {
        callbackEvent(new vd2(r2, r3));
    }

    public void onBatteryChange(final BluetoothDevice r2, final BatteryInfo r3) {
        callbackEvent(new oe2(r2, r3));
    }

    public void onCurrentVoiceMode(final BluetoothDevice r2, final VoiceMode r3) {
        callbackEvent(new ze2(r2, r3));
    }

    public void onDevStorageInfoChange(final BluetoothDevice r2, final DevStorageInfo r3) {
        callbackEvent(new he2(r2, r3));
    }

    public void onDeviceModeChange(final BluetoothDevice r2, final int r3) {
        callbackEvent(new ae2(r2, r3));
    }

    public void onDynamicLimiter(final BluetoothDevice r2, final DynamicLimiterParam r3) {
        callbackEvent(new pe2(r2, r3));
    }

    public void onEqChange(final BluetoothDevice r2, final EqInfo r3) {
        callbackEvent(new ud2(r2, r3));
    }

    public void onEqPresetChange(final BluetoothDevice r2, final EqPresetInfo r3) {
        callbackEvent(new td2(r2, r3));
    }

    public void onExpandFunction(final BluetoothDevice r2, final int r3, final byte[] r4) {
        callbackEvent(new wd2(r2, r3, r4));
    }

    public void onFileFormatChange(final BluetoothDevice r2, final String r3) {
        callbackEvent(new qd2(r2, r3));
    }

    public void onFmChannelsChange(final BluetoothDevice r2, final List<ChannelInfo> r3) {
        callbackEvent(new ke2(r2, r3));
    }

    public void onFmStatusChange(final BluetoothDevice r2, final FmStatusInfo r3) {
        callbackEvent(new le2(r2, r3));
    }

    public void onFrequencyTx(final BluetoothDevice r2, final float r3) {
        callbackEvent(new fe2(r2, r3));
    }

    public void onHealthDataChange(final BluetoothDevice r2, final HealthData r3) {
        callbackEvent(new ce2(r2, r3));
    }

    public void onHealthSettingChange(final BluetoothDevice r2, final HealthSettingInfo r3) {
        callbackEvent(new sd2(r2, r3));
    }

    public void onHighAndBassChange(final BluetoothDevice r2, final int r3, final int r4) {
        callbackEvent(new pd2(r2, r3, r4));
    }

    public void onID3MusicInfo(final BluetoothDevice r2, final ID3MusicInfo r3) {
        callbackEvent(new ve2(r2, r3));
    }

    public void onLightControlInfo(final BluetoothDevice r2, final LightControlInfo r3) {
        callbackEvent(new de2(r2, r3));
    }

    public void onMusicNameChange(final BluetoothDevice r2, final MusicNameInfo r3) {
        callbackEvent(new xe2(r2, r3));
    }

    public void onMusicStatusChange(final BluetoothDevice r2, final MusicStatusInfo r3) {
        callbackEvent(new ue2(r2, r3));
    }

    public void onPeripheralsConnectStatusChange(final BluetoothDevice r2, final boolean r3, final String r4) {
        callbackEvent(new zd2(r2, r3, r4));
    }

    public void onPeripheralsModeChange(final BluetoothDevice r2, final int r3) {
        callbackEvent(new me2(r2, r3));
    }

    public void onPhoneCallStatusChange(final BluetoothDevice r2, final int r3) {
        callbackEvent(new be2(r2, r3));
    }

    public void onPlatformInterfaceInfoChange(final BluetoothDevice r2, final Map<Integer, List<LtvBean>> r3) {
        callbackEvent(new ie2(r2, r3));
    }

    public void onPlayModeChange(final BluetoothDevice r2, final PlayModeInfo r3) {
        callbackEvent(new ee2(r2, r3));
    }

    public void onReverberation(final BluetoothDevice r2, final ReverberationParam r3) {
        callbackEvent(new te2(r2, r3));
    }

    public void onSensorLogDataChange(final BluetoothDevice r2, final int r3, final byte[] r4) {
        callbackEvent(new je2(r2, r3, r4));
    }

    public void onSoundCardEqChange(final BluetoothDevice r2, final EqInfo r3) {
        callbackEvent(new rd2(r2, r3));
    }

    public void onSoundCardStatusChange(final BluetoothDevice r2, final long r3, final byte[] r5) {
        callbackEvent(new yd2(r2, r3, r5));
    }

    public void onSportInfoChange(final BluetoothDevice r2, final SportsInfo r3) {
        callbackEvent(new ye2(r2, r3));
    }

    public void onSportsState(final BluetoothDevice r2, final int r3) {
        callbackEvent(new qe2(r2, r3));
    }

    public void onVoiceModeList(final BluetoothDevice r2, final List<VoiceMode> r3) {
        callbackEvent(new ge2(r2, r3));
    }

    public void onVolumeChange(final BluetoothDevice r2, final VolumeInfo r3) {
        callbackEvent(new re2(r2, r3));
    }

    public static /* synthetic */ void a(BluetoothDevice r0, VolumeInfo r1, OnRcspEventListener r2) {
        r2.onVolumeChange(r0, r1);
    }

    public static /* synthetic */ void b(BluetoothDevice r0, AlarmBean r1, OnRcspEventListener r2) {
        r2.onAlarmStop(r0, r1);
    }

    public static /* synthetic */ void c(BluetoothDevice r0, List r1, OnRcspEventListener r2) {
        r2.onVoiceModeList(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, EqInfo r1, OnRcspEventListener r2) {
        r2.onEqChange(r0, r1);
    }

    public static /* synthetic */ void b(BluetoothDevice r0, int r1, OnRcspEventListener r2) {
        r2.onPeripheralsModeChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, DevStorageInfo r1, OnRcspEventListener r2) {
        r2.onDevStorageInfoChange(r0, r1);
    }

    public static /* synthetic */ void b(BluetoothDevice r0, EqInfo r1, OnRcspEventListener r2) {
        r2.onSoundCardEqChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, String r1, OnRcspEventListener r2) {
        r2.onFileFormatChange(r0, r1);
    }

    public static /* synthetic */ void b(BluetoothDevice r0, int r1, byte[] r2, OnRcspEventListener r3) {
        r3.onSensorLogDataChange(r0, r1, r2);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, MusicNameInfo r1, OnRcspEventListener r2) {
        r2.onMusicNameChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, MusicStatusInfo r1, OnRcspEventListener r2) {
        r2.onMusicStatusChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, PlayModeInfo r1, OnRcspEventListener r2) {
        r2.onPlayModeChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, BatteryInfo r1, OnRcspEventListener r2) {
        r2.onBatteryChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, boolean r1, OnRcspEventListener r2) {
        r2.onAuxStatusChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, FmStatusInfo r1, OnRcspEventListener r2) {
        r2.onFmStatusChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, AlarmListInfo r1, OnRcspEventListener r2) {
        r2.onAlarmListChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, List r1, OnRcspEventListener r2) {
        r2.onAlarmDefaultBellListChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, AlarmBean r1, OnRcspEventListener r2) {
        r2.onAlarmNotify(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, float r1, OnRcspEventListener r2) {
        r2.onFrequencyTx(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, boolean r1, String r2, OnRcspEventListener r3) {
        r3.onPeripheralsConnectStatusChange(r0, r1, r2);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, ID3MusicInfo r1, OnRcspEventListener r2) {
        r2.onID3MusicInfo(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, int r1, int r2, OnRcspEventListener r3) {
        r3.onHighAndBassChange(r0, r1, r2);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, EqPresetInfo r1, OnRcspEventListener r2) {
        r2.onEqPresetChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, int r1, byte[] r2, OnRcspEventListener r3) {
        r3.onExpandFunction(r0, r1, r2);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, ReverberationParam r1, OnRcspEventListener r2) {
        r2.onReverberation(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, DynamicLimiterParam r1, OnRcspEventListener r2) {
        r2.onDynamicLimiter(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, LightControlInfo r1, OnRcspEventListener r2) {
        r2.onLightControlInfo(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, long r1, byte[] r3, OnRcspEventListener r4) {
        r4.onSoundCardStatusChange(r0, r1, r3);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, VoiceMode r1, OnRcspEventListener r2) {
        r2.onCurrentVoiceMode(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, HealthData r1, OnRcspEventListener r2) {
        r2.onHealthDataChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, HealthSettingInfo r1, OnRcspEventListener r2) {
        r2.onHealthSettingChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, SportsInfo r1, OnRcspEventListener r2) {
        r2.onSportInfoChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, Map r1, OnRcspEventListener r2) {
        r2.onPlatformInterfaceInfoChange(r0, r1);
    }
}
