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
        this(40000);
    }

    public boolean canRetry() {
        int r0 = this.retryCount + 1;
        this.retryCount = r0;
        if (r0 > this.retryLimit) goto L5;
        return true;
    L5:
        return false;
    }

    @NonNull
    public List<BleCharacteristic> getBleCharacteristicList() {
        return this.bleCharacteristicList;
    }

    @NonNull
    public List<BleCharacteristic> getBleWriteCharacteristicList() {
        ArrayList r0 = new ArrayList();
        r0.addAll(getBleCharacteristicList(4));
        r0.addAll(getBleCharacteristicList(8));
        return r0;
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
        if (this.bleCharacteristicList.size() >= 2) goto L5;
        return false;
    L5:
        if (getBleWriteCharacteristicList().isEmpty() == true) goto L10;
        return true;
    L10:
        return false;
    }

    public void resetRetryCount() {
        this.retryCount = 0;
    }

    public BleConnectParam setNeedChangeBleMtu(boolean r1) {
        this.isNeedChangeBleMtu = r1;
        return this;
    }

    public BleConnectParam setPreferredPhy(int r1) {
        this.preferredPhy = r1;
        return this;
    }

    public BleConnectParam setReconnect(boolean r1) {
        this.reconnect = r1;
        return this;
    }

    public BleConnectParam setRequestMtu(int r1) {
        this.requestMtu = r1;
        return this;
    }

    public BleConnectParam setRetryDelay(long r1) {
        this.retryDelay = r1;
        return this;
    }

    public BleConnectParam setRetryLimit(int r1) {
        this.retryLimit = r1;
        return this;
    }

    public BleConnectParam setTransport(int r1) {
        this.transport = r1;
        return this;
    }

    public String toString() {
        return "BleConnectParam{timeout=" + this.timeout + ", reconnect=" + this.reconnect + ", isNeedChangeBleMtu=" + this.isNeedChangeBleMtu + ", requestMtu=" + this.requestMtu + ", bleCharacteristicList=" + this.bleCharacteristicList + ", preferredPhy=" + this.preferredPhy + ", transport=" + this.transport + ", retryLimit=" + this.retryLimit + ", retryDelay=" + this.retryDelay + ", retryCount=" + this.retryCount + i0XO1.IO;
    }

    public BleConnectParam(long r5) {
        this.timeout = r5;
        this.reconnect = true;
        ArrayList r6 = new ArrayList();
        this.bleCharacteristicList = r6;
        UUID r1 = BluetoothConstant.UUID_SERVICE;
        r6.add(new BleCharacteristic(r1, BluetoothConstant.UUID_WRITE, 4));
        r6.add(new BleCharacteristic(r1, BluetoothConstant.UUID_NOTIFICATION, 16));
        this.isNeedChangeBleMtu = true;
        this.requestMtu = 509;
        this.preferredPhy = 1;
        this.transport = 2;
        this.retryLimit = 1;
        this.retryDelay = 2000;
    }

    @NonNull
    public List<BleCharacteristic> getBleCharacteristicList(int r7) {
        ArrayList r0 = new ArrayList();
        ArrayList r1 = new ArrayList(this.bleCharacteristicList);
        int r2 = r1.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L7;
        Object r4 = r1.get(r3);
        r3 = r3 + 1;
        BleCharacteristic r5 = (BleCharacteristic) r4;
        if (r5.hasProperty(r7) == false) goto L3;
        r0.add(r5);
        goto L3
    L7:
        return r0;
    }
}
