package com.jieli.jl_bt_ota.model.data;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class ReceivedDataInfo extends DataInfo {
    private final byte[] data;
    private final BluetoothDevice device;
    private int deviceSendMtu;

    public ReceivedDataInfo(BluetoothDevice bluetoothDevice, byte[] bArr) {
        super(1);
        this.deviceSendMtu = 530;
        this.device = bluetoothDevice;
        this.data = bArr;
    }

    public byte[] getData() {
        return this.data;
    }

    public BluetoothDevice getDevice() {
        return this.device;
    }

    public int getDeviceSendMtu() {
        return this.deviceSendMtu;
    }

    public void setDeviceSendMtu(int i) {
        this.deviceSendMtu = i;
    }

    @Override // com.jieli.jl_bt_ota.model.data.DataInfo
    public String toString() {
        return "ReceivedDataInfo{device=" + this.device + ", data=" + CHexConver.byte2HexStr(this.data) + ", deviceSendMtu=" + this.deviceSendMtu + i0XO1.f7442IO;
    }
}
