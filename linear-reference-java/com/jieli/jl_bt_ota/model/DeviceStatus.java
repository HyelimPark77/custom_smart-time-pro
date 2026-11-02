package com.jieli.jl_bt_ota.model;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.response.TargetInfoResponse;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceStatus {
    private boolean isAuthDevice;
    private boolean isEnterLowPowerMode;
    private boolean isMandatoryUpgrade;
    private String mDevMD5;
    private TargetInfoResponse mTargetInfo;
    private int status;

    public DeviceStatus() {
    }

    public String getDevMD5() {
        return this.mDevMD5;
    }

    public int getStatus() {
        return this.status;
    }

    public TargetInfoResponse getTargetInfo() {
        return this.mTargetInfo;
    }

    public boolean isAuthDevice() {
        return this.isAuthDevice;
    }

    public boolean isEnterLowPowerMode() {
        return this.isEnterLowPowerMode;
    }

    public boolean isMandatoryUpgrade() {
        return this.isMandatoryUpgrade;
    }

    public DeviceStatus setAuthDevice(boolean r1) {
        this.isAuthDevice = r1;
        return this;
    }

    public DeviceStatus setDevMD5(String r1) {
        this.mDevMD5 = r1;
        return this;
    }

    public DeviceStatus setEnterLowPowerMode(boolean r1) {
        this.isEnterLowPowerMode = r1;
        return this;
    }

    public DeviceStatus setMandatoryUpgrade(boolean r1) {
        this.isMandatoryUpgrade = r1;
        return this;
    }

    public DeviceStatus setStatus(int r1) {
        this.status = r1;
        return this;
    }

    public DeviceStatus setTargetInfo(TargetInfoResponse r1) {
        this.mTargetInfo = r1;
        return this;
    }

    public String toString() {
        return "DeviceStatus{status=" + this.status + ", isAuthDevice=" + this.isAuthDevice + ", isEnterLowPowerMode=" + this.isEnterLowPowerMode + ", isMandatoryUpgrade=" + this.isMandatoryUpgrade + ", mTargetInfo=" + this.mTargetInfo + ", mDevMD5='" + this.mDevMD5 + '\'' + i0XO1.IO;
    }
}
