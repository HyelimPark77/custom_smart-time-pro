package com.jieli.jl_rcsp.tool;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.model.device.DeviceConfiguration;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.device.DeviceStatus;
import com.jieli.jl_rcsp.model.device.VoiceData;
import com.jieli.jl_rcsp.model.response.ADVInfoResponse;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;
import com.jieli.jl_rcsp.model.response.GetLowLatencySettingsResponse;
import com.jieli.jl_rcsp.model.response.TargetInfoResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceStatusManager {
    public static volatile DeviceStatusManager b;
    public final Map<String, DeviceStatus> a;

    public DeviceStatusManager() {
        this.a = Collections.synchronizedMap(new HashMap());
    }

    public static DeviceStatusManager getInstance() {
        if (b != null) goto L16;
        monitor-enter(DeviceStatusManager.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (b != null) goto L11;
        b = new DeviceStatusManager();     // Catch: Throwable -> L9
    L11:
        monitor-exit(DeviceStatusManager.class);     // Catch: Throwable -> L9
    L16:
        return b;
    }

    public final ADVInfoResponse a(ADVInfoResponse r3, ADVInfoResponse r4) {
        if (r3 == null) goto L69;
        if (r4 == null) goto L69;
        if (r4.getVid() < 0) goto L10;
        if (r4.getVid() == r3.getVid()) goto L10;
        r3.setVid(r4.getVid());
    L10:
        if (r4.getUid() < 0) goto L15;
        if (r4.getUid() == r3.getUid()) goto L15;
        r3.setUid(r4.getUid());
    L15:
        if (r4.getPid() < 0) goto L20;
        if (r4.getPid() == r3.getPid()) goto L20;
        r3.setPid(r4.getPid());
    L20:
        if (r4.getDeviceName() == null) goto L25;
        if (r4.getDeviceName().equals(r3.getDeviceName()) == true) goto L25;
        r3.setDeviceName(r4.getDeviceName());
    L25:
        if (r4.getLeftDeviceQuantity() < 0) goto L30;
        if (r4.getLeftDeviceQuantity() == r3.getLeftDeviceQuantity()) goto L30;
        r3.setLeftDeviceQuantity(r4.getLeftDeviceQuantity());
    L30:
        if (r4.getRightDeviceQuantity() < 0) goto L35;
        if (r4.getRightDeviceQuantity() == r3.getRightDeviceQuantity()) goto L35;
        r3.setRightDeviceQuantity(r4.getRightDeviceQuantity());
    L35:
        if (r4.getChargingBinQuantity() < 0) goto L40;
        if (r4.getChargingBinQuantity() == r3.getChargingBinQuantity()) goto L40;
        r3.setChargingBinQuantity(r4.getChargingBinQuantity());
    L40:
        if (r4.isLeftCharging() == r3.isLeftCharging()) goto L43;
        r3.setLeftCharging(r4.isLeftCharging());
    L43:
        if (r4.isRightCharging() == r3.isRightCharging()) goto L46;
        r3.setRightCharging(r4.isRightCharging());
    L46:
        if (r4.isDeviceCharging() == r3.isDeviceCharging()) goto L49;
        r3.setDeviceCharging(r4.isDeviceCharging());
    L49:
        if (r4.getWorkModel() < 0) goto L54;
        if (r4.getWorkModel() == r3.getWorkModel()) goto L54;
        r3.setWorkModel(r4.getWorkModel());
    L54:
        if (r4.getMicChannel() < 0) goto L59;
        if (r4.getMicChannel() == r3.getMicChannel()) goto L59;
        r3.setMicChannel(r4.getMicChannel());
    L59:
        if (r4.getKeySettingsList() == null) goto L64;
        if (r4.getKeySettingsList().isEmpty() == true) goto L64;
        r3.setKeySettingsList(r4.getKeySettingsList());
    L64:
        if (r4.getLedSettingsList() != null) goto L66;
    L68:
        return r3;
    L66:
        if (r4.getLedSettingsList().isEmpty() == true) goto L68;
        r3.setLedSettingsList(r4.getLedSettingsList());
    L69:
        if (r3 == null) goto L71;
        return r3;
    L71:
        if (r4 == null) goto L73;
        return r4;
    L73:
        return null;
    }

    public ADVInfoResponse getAdvInfo(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return null;
    L7:
        return r2.getADVInfo();
    }

    public String getDevMD5(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return null;
    L7:
        return r2.getDevMD5();
    }

    public DeviceConfiguration getDeviceConfigure(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return null;
    L7:
        return r2.getDeviceConfigure();
    }

    public int getDeviceConnectStatus(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return 0;
    L7:
        return r2.getStatus();
    }

    public DeviceInfo getDeviceInfo(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return null;
    L7:
        return r2.getDeviceInfo();
    }

    public DeviceStatus getDeviceStatus(BluetoothDevice r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return getDeviceStatus(r1.getAddress());
    }

    public VoiceData getDeviceVoiceConfig(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return null;
    L7:
        return r2.getVoiceData();
    }

    public int getDeviceWorkMode(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return 3;
    L7:
        return r2.getWorkMode();
    }

    public ExternalFlashMsgResponse getExtFlashMsg(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return null;
    L7:
        return r2.getExtFlashMSg();
    }

    public GetLowLatencySettingsResponse getLatencySettings(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return null;
    L7:
        return r2.getLatencySettings();
    }

    public int getMaxCommunicationMtu(BluetoothDevice r2) {
        DeviceStatus r3 = getDeviceStatus(r2);
        if (r3 != null) goto L5;
        return 530;
    L5:
        if (r3.getMaxCommunicationMtu() > 0) goto L7;
        return 530;
    L7:
        return r3.getMaxCommunicationMtu();
    }

    public int getMaxReceiveMtu(BluetoothDevice r2) {
        DeviceStatus r3 = getDeviceStatus(r2);
        if (r3 != null) goto L5;
        return 530;
    L5:
        if (r3.getMaxReceiveMtu() > 0) goto L7;
        return 530;
    L7:
        return r3.getMaxReceiveMtu();
    }

    public boolean isAuthBtDevice(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return false;
    L7:
        return r2.isAuthDevice();
    }

    public boolean isDataTransfer(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return false;
    L7:
        return r2.isDataTransfer();
    }

    public boolean isDoubleBackupUpgrade(BluetoothDevice r2) {
        DeviceStatus r3 = getDeviceStatus(r2);
        if (r3 != null) goto L5;
        return false;
    L5:
        DeviceInfo r4 = r3.getDeviceInfo();
        if (r4 != null) goto L9;
        return false;
    L9:
        return r4.isSupportDoubleBackup();
    }

    public boolean isEnableLatencyMode(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return false;
    L7:
        return r2.isEnableLatencyMode();
    }

    public boolean isEnterLowPowerMode(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return false;
    L7:
        return r2.isEnterLowPowerMode();
    }

    public boolean isFileTransfer(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return false;
    L7:
        return r2.isFileTransfer();
    }

    public boolean isMandatoryUpgrade(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return false;
    L7:
        return r2.isMandatoryUpgrade();
    }

    public boolean isTwsConnected(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L7;
        return false;
    L7:
        return r2.isTwsConnected();
    }

    public void release() {
        this.a.clear();
        b = null;
    }

    public DeviceStatus removeDeviceStatus(BluetoothDevice r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return removeDeviceStatus(r1.getAddress());
    }

    public void updateDataTransfer(BluetoothDevice r3, boolean r4) {
        DeviceStatus r0 = getDeviceStatus(r3);
        if (r0 != null) goto L6;
        return;
    L6:
        if (r0.isDataTransfer() == r4) goto L9;
        r0.setDataTransfer(r4);
        updateDeviceStatus(r3, r0);
        return;
    }

    public void updateDeviceAdvInfo(BluetoothDevice r3, ADVInfoResponse r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        DeviceStatus r0 = getDeviceStatus(r3);
        if (r0 != null) goto L7;
        r0 = new DeviceStatus();
        r0.setADVInfo(r4);
    L8:
        updateDeviceStatus(r3, r0);
        return;
    L7:
        r0.setADVInfo(a(r0.getADVInfo(), r4));
        goto L8
    }

    public void updateDeviceConfigure(BluetoothDevice r2, DeviceConfiguration r3) {
        DeviceStatus r0 = getDeviceStatus(r2);
        if (r0 != null) goto L5;
        return;
    L5:
        r0.setDeviceConfigure(r3);
        updateDeviceStatus(r2, r0);
    }

    public void updateDeviceConnectStatus(BluetoothDevice r2, int r3) {
        DeviceStatus r0 = getDeviceStatus(r2);
        if (r0 != null) goto L5;
        r0 = new DeviceStatus();
    L5:
        r0.setStatus(r3);
        updateDeviceStatus(r2, r0);
    }

    public void updateDeviceInfo(BluetoothDevice r5, DeviceInfo r6) {
        DeviceStatus r0 = getDeviceStatus(r5);
        if (r0 != null) goto L5;
        r0 = new DeviceStatus();
    L5:
        int r1 = 1;
        if (r6 != null) goto L8;
    L10:
        boolean r2 = false;
    L11:
        DeviceInfo r3 = r0.getDeviceInfo();
        if (r3 == null) goto L14;
        r0.setDeviceInfo(DeviceInfo.mergeTargetInfos(r3, r6));
    L15:
        if (r2 == false) goto L17;
        r1 = 2;
    L17:
        r0.setWorkMode(r1);
        updateDeviceStatus(r5, r0);
        return;
    L14:
        r0.setDeviceInfo(r6);
        goto L15
    L8:
        if (r6.isMandatoryUpgrade() == false) goto L10;
        r2 = true;
        goto L11
    }

    public void updateDeviceIsAuth(BluetoothDevice r2, boolean r3) {
        DeviceStatus r0 = getDeviceStatus(r2);
        if (r0 != null) goto L5;
        r0 = new DeviceStatus();
    L5:
        r0.setAuthDevice(r3);
        updateDeviceStatus(r2, r0);
    }

    public void updateDeviceIsEnableLatencyMode(BluetoothDevice r2, boolean r3) {
        DeviceStatus r0 = getDeviceStatus(r2);
        if (r0 != null) goto L5;
        return;
    L5:
        r0.setEnableLatencyMode(r3);
        updateDeviceStatus(r2, r0);
    }

    public void updateDeviceIsEnterLowPowerMode(BluetoothDevice r1, boolean r2) {
        if (r2 == false) goto L4;
        int r3 = 3;
    L5:
        updateWorkMode(r1, r3);
        return;
    L4:
        r3 = 1;
        goto L5
    }

    public void updateDeviceLowLatencySettings(BluetoothDevice r2, GetLowLatencySettingsResponse r3) {
        DeviceStatus r0 = getDeviceStatus(r2);
        if (r0 != null) goto L5;
        return;
    L5:
        r0.setLatencySettings(r3);
        updateDeviceStatus(r2, r0);
    }

    public void updateDeviceMD5(BluetoothDevice r2, String r3) {
        DeviceStatus r0 = getDeviceStatus(r2);
        if (r0 != null) goto L5;
        return;
    L5:
        r0.setDevMD5(r3);
        updateDeviceStatus(r2, r0);
    }

    public void updateDeviceMaxCommunicationMtu(BluetoothDevice r2, int r3) {
        DeviceStatus r0 = getDeviceStatus(r2);
        if (r0 != null) goto L5;
        r0 = new DeviceStatus();
    L5:
        r0.setMaxCommunicationMtu(r3);
        updateDeviceStatus(r2, r0);
    }

    public void updateDeviceMaxReceiveMtu(BluetoothDevice r2, int r3) {
        DeviceStatus r0 = getDeviceStatus(r2);
        if (r0 != null) goto L5;
        r0 = new DeviceStatus();
    L5:
        r0.setMaxReceiveMtu(r3);
        updateDeviceStatus(r2, r0);
    }

    public void updateDeviceStatus(BluetoothDevice r1, DeviceStatus r2) {
        if (r1 == null) goto L5;
        updateDeviceStatus(r1.getAddress(), r2);
        return;
    }

    public void updateDeviceTargetInfo(BluetoothDevice r1, TargetInfoResponse r2) {
        updateDeviceInfo(r1, DeviceInfo.convertFromTargetInfo(r2));
    }

    public void updateDeviceVoiceConfig(BluetoothDevice r3, VoiceData r4) {
        DeviceStatus r0 = getDeviceStatus(r3);
        if (r0 == null) goto L12;
        if (r4 != null) goto L7;
    L10:
        r0.setVoiceData(r4);
        updateDeviceStatus(r3, r0);
        return;
    L7:
        if (r4.equals(r0.getVoiceData()) == false) goto L10;
        return;
    }

    public void updateExtFlashMsg(BluetoothDevice r2, ExternalFlashMsgResponse r3) {
        DeviceStatus r0 = getDeviceStatus(r2);
        if (r0 != null) goto L5;
        r0 = new DeviceStatus();
    L5:
        r0.setExtFlashMSg(r3);
        updateDeviceStatus(r2, r0);
    }

    public void updateFileTransfer(BluetoothDevice r3, boolean r4) {
        DeviceStatus r0 = getDeviceStatus(r3);
        if (r0 != null) goto L6;
        return;
    L6:
        if (r0.isFileTransfer() == r4) goto L9;
        r0.setFileTransfer(r4);
        updateDeviceStatus(r3, r0);
        return;
    }

    public void updateWorkMode(BluetoothDevice r3, int r4) {
        DeviceStatus r0 = getDeviceStatus(r3);
        if (r0 != null) goto L6;
        return;
    L6:
        if (r0.getWorkMode() == r4) goto L9;
        r0.setWorkMode(r4);
        updateDeviceStatus(r3, r0);
        return;
    }

    public DeviceStatus getDeviceStatus(String r2) {
        if (BluetoothAdapter.checkBluetoothAddress(r2) == true) goto L5;
        return null;
    L5:
        return this.a.get(r2);
    }

    public DeviceStatus removeDeviceStatus(String r2) {
        if (BluetoothAdapter.checkBluetoothAddress(r2) == true) goto L5;
        return null;
    L5:
        return this.a.remove(r2);
    }

    public void updateDeviceStatus(String r2, DeviceStatus r3) {
        if (BluetoothAdapter.checkBluetoothAddress(r2) == false) goto L7;
        if (r3 == null) goto L8;
        this.a.put(r2, r3);
        return;
    L8:
        return;
    }
}
