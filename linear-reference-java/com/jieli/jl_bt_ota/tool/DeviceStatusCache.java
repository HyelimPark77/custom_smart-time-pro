package com.jieli.jl_bt_ota.tool;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.jieli.jl_bt_ota.model.DeviceStatus;
import com.jieli.jl_bt_ota.model.response.TargetInfoResponse;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public final class DeviceStatusCache {
    private final HashMap<String, DeviceStatus> a;

    public DeviceStatusCache() {
        this.a = new HashMap();
    }

    public void clear() {
        this.a.clear();
    }

    public String getDevMD5(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L5;
        return null;
    L5:
        return r2.getDevMD5();
    }

    public int getDeviceConnectStatus(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L5;
        return 0;
    L5:
        return r2.getStatus();
    }

    public TargetInfoResponse getDeviceInfo(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L5;
        return null;
    L5:
        return r2.getTargetInfo();
    }

    public DeviceStatus getDeviceStatus(BluetoothDevice r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return getDeviceStatus(r1.getAddress());
    }

    public int getMaxCommunicationMtu(BluetoothDevice r2) {
        TargetInfoResponse r3 = getDeviceInfo(r2);
        if (r3 != null) goto L5;
        return 530;
    L5:
        if (r3.getSendMtu() > 0) goto L7;
        return 530;
    L7:
        return r3.getSendMtu();
    }

    public int getMaxReceiveMtu(BluetoothDevice r2) {
        TargetInfoResponse r3 = getDeviceInfo(r2);
        if (r3 != null) goto L5;
        return 530;
    L5:
        if (r3.getReceiveMtu() > 0) goto L7;
        return 530;
    L7:
        return r3.getReceiveMtu();
    }

    public boolean isAuthBtDevice(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L5;
        return false;
    L5:
        return r2.isAuthDevice();
    }

    public boolean isDoubleBackupUpgrade(BluetoothDevice r1) {
        TargetInfoResponse r2 = getDeviceInfo(r1);
        if (r2 != null) goto L5;
        return false;
    L5:
        if (r2.isSupportDoubleBackup() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isEnterLowPowerMode(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L5;
        return false;
    L5:
        return r2.isEnterLowPowerMode();
    }

    public boolean isMandatoryUpgrade(BluetoothDevice r1) {
        DeviceStatus r2 = getDeviceStatus(r1);
        if (r2 != null) goto L5;
        return false;
    L5:
        return r2.isMandatoryUpgrade();
    }

    public DeviceStatus removeDeviceStatus(BluetoothDevice r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return removeDeviceStatus(r1.getAddress());
    }

    public void updateDeviceConnectStatus(BluetoothDevice r2, int r3) {
        DeviceStatus r0 = getDeviceStatus(r2);
        if (r0 != null) goto L5;
        r0 = new DeviceStatus();
    L5:
        r0.setStatus(r3);
        updateDeviceStatus(r2, r0);
    }

    public void updateDeviceIsAuth(BluetoothDevice r2, boolean r3) {
        DeviceStatus r0 = getDeviceStatus(r2);
        if (r0 != null) goto L5;
        r0 = new DeviceStatus();
    L5:
        r0.setAuthDevice(r3);
        updateDeviceStatus(r2, r0);
    }

    public void updateDeviceIsEnterLowPowerMode(BluetoothDevice r2, boolean r3) {
        DeviceStatus r0 = getDeviceStatus(r2);
        if (r0 != null) goto L5;
        r0 = new DeviceStatus();
    L5:
        r0.setEnterLowPowerMode(r3);
        updateDeviceStatus(r2, r0);
    }

    public void updateDeviceMD5(BluetoothDevice r2, String r3) {
        DeviceStatus r0 = getDeviceStatus(r2);
        if (r0 != null) goto L5;
        r0 = new DeviceStatus();
    L5:
        r0.setDevMD5(r3);
        updateDeviceStatus(r2, r0);
    }

    public void updateDeviceMaxCommunicationMtu(BluetoothDevice r3, int r4) {
        if (r4 <= 0) goto L9;
        TargetInfoResponse r0 = getDeviceInfo(r3);
        if (r0 != null) goto L7;
        return;
    L7:
        r0.protocolMtu.setSendMtu(r4);
        updateDeviceTargetInfo(r3, r0);
        return;
    }

    public void updateDeviceMaxReceiveMtu(BluetoothDevice r3, int r4) {
        if (r4 <= 0) goto L9;
        TargetInfoResponse r0 = getDeviceInfo(r3);
        if (r0 != null) goto L7;
        return;
    L7:
        r0.protocolMtu.setReceiveMtu(r4);
        updateDeviceTargetInfo(r3, r0);
        return;
    }

    public void updateDeviceStatus(BluetoothDevice r1, DeviceStatus r2) {
        if (r1 == null) goto L5;
        updateDeviceStatus(r1.getAddress(), r2);
        return;
    }

    public void updateDeviceTargetInfo(BluetoothDevice r3, TargetInfoResponse r4) {
        DeviceStatus r0 = getDeviceStatus(r3);
        if (r4 != null) goto L5;
    L7:
        boolean r1 = false;
    L8:
        if (r0 != null) goto L10;
        r0 = new DeviceStatus();
    L10:
        r0.setTargetInfo(r4);
        r0.setMandatoryUpgrade(r1);
        updateDeviceStatus(r3, r0);
        return;
    L5:
        if (r4.isMandatoryUpgrade() == false) goto L7;
        r1 = true;
        goto L8
    }

    public DeviceStatus getDeviceStatus(String r2) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
        return null;
    L5:
        return this.a.get(r2);
    }

    public DeviceStatus removeDeviceStatus(String r2) {
        if (CHexConver.checkBluetoothAddress(r2) == true) goto L5;
        return null;
    L5:
        return this.a.remove(r2);
    }

    public void updateDeviceStatus(String r2, DeviceStatus r3) {
        if (CHexConver.checkBluetoothAddress(r2) == false) goto L7;
        if (r3 == null) goto L8;
        this.a.put(r2, r3);
        return;
    L8:
        return;
    }
}
