package com.jieli.jl_bt_ota.model.ble;

import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.constant.BluetoothConstant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BleConnectParam {
    private final List<BleCharacteristic> bleCharacteristicList;
    private boolean isNeedChangeBleMtu;
    private int preferredPhy;
    private boolean reconnect;
    private int requestMtu;
    private int retryCount;
    private long retryDelay;
    private int retryLimit;
    private final long timeout;
    private int transport;

    public BleConnectParam() {
        this(40000L);
    }

    public boolean canRetry() {
        int i = this.retryCount + 1;
        this.retryCount = i;
        return i <= this.retryLimit;
    }

    @NonNull
    public List<BleCharacteristic> getBleCharacteristicList() {
        return this.bleCharacteristicList;
    }

    @NonNull
    public List<BleCharacteristic> getBleWriteCharacteristicList() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getBleCharacteristicList(4));
        arrayList.addAll(getBleCharacteristicList(8));
        return arrayList;
    }

    public int getPreferredPhy() {
        return this.preferredPhy;
    }

    public int getRequestMtu() {
        return this.requestMtu;
    }

    public long getRetryDelay() {
        return this.retryDelay;
    }

    public int getRetryLimit() {
        return this.retryLimit;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public int getTransport() {
        return this.transport;
    }

    public boolean isNeedChangeBleMtu() {
        return this.isNeedChangeBleMtu;
    }

    public boolean isReconnect() {
        return this.reconnect;
    }

    public boolean isValid() {
        return this.bleCharacteristicList.size() >= 2 && !getBleWriteCharacteristicList().isEmpty();
    }

    public void resetRetryCount() {
        this.retryCount = 0;
    }

    public BleConnectParam setNeedChangeBleMtu(boolean z) {
        this.isNeedChangeBleMtu = z;
        return this;
    }

    public BleConnectParam setPreferredPhy(int i) {
        this.preferredPhy = i;
        return this;
    }

    public BleConnectParam setReconnect(boolean z) {
        this.reconnect = z;
        return this;
    }

    public BleConnectParam setRequestMtu(int i) {
        this.requestMtu = i;
        return this;
    }

    public BleConnectParam setRetryDelay(long j) {
        this.retryDelay = j;
        return this;
    }

    public BleConnectParam setRetryLimit(int i) {
        this.retryLimit = i;
        return this;
    }

    public BleConnectParam setTransport(int i) {
        this.transport = i;
        return this;
    }

    public String toString() {
        return "BleConnectParam{timeout=" + this.timeout + ", reconnect=" + this.reconnect + ", isNeedChangeBleMtu=" + this.isNeedChangeBleMtu + ", requestMtu=" + this.requestMtu + ", bleCharacteristicList=" + this.bleCharacteristicList + ", preferredPhy=" + this.preferredPhy + ", transport=" + this.transport + ", retryLimit=" + this.retryLimit + ", retryDelay=" + this.retryDelay + ", retryCount=" + this.retryCount + i0XO1.f7442IO;
    }

    public BleConnectParam(long j) {
        this.timeout = j;
        this.reconnect = true;
        ArrayList arrayList = new ArrayList();
        this.bleCharacteristicList = arrayList;
        UUID uuid = BluetoothConstant.UUID_SERVICE;
        arrayList.add(new BleCharacteristic(uuid, BluetoothConstant.UUID_WRITE, 4));
        arrayList.add(new BleCharacteristic(uuid, BluetoothConstant.UUID_NOTIFICATION, 16));
        this.isNeedChangeBleMtu = true;
        this.requestMtu = 509;
        this.preferredPhy = 1;
        this.transport = 2;
        this.retryLimit = 1;
        this.retryDelay = 2000L;
    }

    @NonNull
    public List<BleCharacteristic> getBleCharacteristicList(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.bleCharacteristicList);
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            BleCharacteristic bleCharacteristic = (BleCharacteristic) obj;
            if (bleCharacteristic.hasProperty(i)) {
                arrayList.add(bleCharacteristic);
            }
        }
        return arrayList;
    }
}
