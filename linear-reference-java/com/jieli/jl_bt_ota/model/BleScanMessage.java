package com.jieli.jl_bt_ota.model;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class BleScanMessage implements Serializable {
    private int battery;
    private int deviceType;
    private int deviceVersion;
    private String identify;
    private boolean isEnableConnect;
    private boolean isOTA;
    private String oldBleAddress;
    private int pid;
    private byte[] rawData;
    private int rssi;
    private int uid;
    private int version;
    private int vid;

    public BleScanMessage() {
        this.isEnableConnect = true;
    }

    public int getBattery() {
        return this.battery;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public int getDeviceVersion() {
        return this.deviceVersion;
    }

    public String getIdentify() {
        return this.identify;
    }

    public String getOldBleAddress() {
        return this.oldBleAddress;
    }

    public int getPid() {
        return this.pid;
    }

    public byte[] getRawData() {
        return this.rawData;
    }

    public int getRssi() {
        return this.rssi;
    }

    public int getUid() {
        return this.uid;
    }

    public int getVersion() {
        return this.version;
    }

    public int getVid() {
        return this.vid;
    }

    public boolean isEnableConnect() {
        return this.isEnableConnect;
    }

    public boolean isOTA() {
        return this.isOTA;
    }

    public BleScanMessage setBattery(int r1) {
        this.battery = r1;
        return this;
    }

    public BleScanMessage setDeviceType(int r1) {
        this.deviceType = r1;
        return this;
    }

    public BleScanMessage setDeviceVersion(int r1) {
        this.deviceVersion = r1;
        return this;
    }

    public BleScanMessage setEnableConnect(boolean r1) {
        this.isEnableConnect = r1;
        return this;
    }

    public BleScanMessage setIdentify(String r1) {
        this.identify = r1;
        return this;
    }

    public BleScanMessage setOTA(boolean r1) {
        this.isOTA = r1;
        return this;
    }

    public BleScanMessage setOldBleAddress(String r1) {
        this.oldBleAddress = r1;
        return this;
    }

    public BleScanMessage setPid(int r1) {
        this.pid = r1;
        return this;
    }

    public BleScanMessage setRawData(byte[] r1) {
        this.rawData = r1;
        return this;
    }

    public BleScanMessage setRssi(int r1) {
        this.rssi = r1;
        return this;
    }

    public BleScanMessage setUid(int r1) {
        this.uid = r1;
        return this;
    }

    public BleScanMessage setVersion(int r1) {
        this.version = r1;
        return this;
    }

    public BleScanMessage setVid(int r1) {
        this.vid = r1;
        return this;
    }

    public String toString() {
        return "BleScanMessage{rawData=" + CHexConver.byte2HexStr(this.rawData) + ", rssi=" + this.rssi + ", isEnableConnect=" + this.isEnableConnect + ", vid=" + this.vid + ", uid=" + this.uid + ", pid=" + this.pid + ", identify='" + this.identify + "', version=" + this.version + ", oldBleAddress='" + this.oldBleAddress + "', isOTA=" + this.isOTA + ", deviceType=" + this.deviceType + ", deviceVersion=" + this.deviceVersion + ", battery=" + this.battery + i0XO1.IO;
    }
}
