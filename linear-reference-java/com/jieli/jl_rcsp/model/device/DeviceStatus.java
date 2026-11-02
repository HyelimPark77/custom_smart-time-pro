package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.response.ADVInfoResponse;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;
import com.jieli.jl_rcsp.model.response.GetLowLatencySettingsResponse;
import com.jieli.jl_rcsp.model.response.TargetInfoResponse;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceStatus {
    public static final int MODE_LOW_POWER = 3;
    public static final int MODE_MANDATORY_UPGRADE = 2;
    public static final int MODE_NORMAL = 1;
    public static final int MODE_UNKNOWN = 0;
    private DeviceConfiguration deviceConfigure;
    private boolean isAuthDevice;
    private boolean isDataTransfer;
    private boolean isEnableLatencyMode;
    private boolean isFileTransfer;
    private boolean isTwsConnected;
    private ADVInfoResponse mADVInfo;
    private String mDevMD5;
    private DeviceInfo mDeviceInfo;
    private ExternalFlashMsgResponse mExtFlashMSg;
    private GetLowLatencySettingsResponse mLatencySettings;
    private VoiceData mVoiceData;
    private int maxCommunicationMtu;
    private int maxReceiveMtu;
    private int status;
    private int workMode;

    public DeviceStatus() {
        this.maxCommunicationMtu = 530;
        this.maxReceiveMtu = 530;
        this.workMode = 0;
    }

    public ADVInfoResponse getADVInfo() {
        return this.mADVInfo;
    }

    public String getDevMD5() {
        return this.mDevMD5;
    }

    public DeviceConfiguration getDeviceConfigure() {
        return this.deviceConfigure;
    }

    public DeviceInfo getDeviceInfo() {
        return this.mDeviceInfo;
    }

    public ExternalFlashMsgResponse getExtFlashMSg() {
        return this.mExtFlashMSg;
    }

    public GetLowLatencySettingsResponse getLatencySettings() {
        return this.mLatencySettings;
    }

    public int getMaxCommunicationMtu() {
        return this.maxCommunicationMtu;
    }

    public int getMaxReceiveMtu() {
        return this.maxReceiveMtu;
    }

    public int getStatus() {
        return this.status;
    }

    public VoiceData getVoiceData() {
        return this.mVoiceData;
    }

    public int getWorkMode() {
        return this.workMode;
    }

    public boolean isAuthDevice() {
        return this.isAuthDevice;
    }

    public boolean isDataTransfer() {
        return this.isDataTransfer;
    }

    public boolean isEnableLatencyMode() {
        return this.isEnableLatencyMode;
    }

    public boolean isEnterLowPowerMode() {
        if (this.workMode != 3) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isFileTransfer() {
        return this.isFileTransfer;
    }

    public boolean isMandatoryUpgrade() {
        if (this.workMode != 2) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isTwsConnected() {
        return this.isTwsConnected;
    }

    public DeviceStatus setADVInfo(ADVInfoResponse r2) {
        this.mADVInfo = r2;
        if (r2 != null) goto L5;
    L9:
        boolean r3 = false;
    L10:
        setTwsConnected(r3);
        return this;
    L5:
        if (r2.getLeftDeviceQuantity() <= 0) goto L9;
        if (r2.getRightDeviceQuantity() <= 0) goto L9;
        r3 = true;
        goto L10
    }

    public DeviceStatus setAuthDevice(boolean r1) {
        this.isAuthDevice = r1;
        return this;
    }

    public DeviceStatus setDataTransfer(boolean r1) {
        this.isDataTransfer = r1;
        return this;
    }

    public DeviceStatus setDevMD5(String r1) {
        this.mDevMD5 = r1;
        return this;
    }

    public DeviceStatus setDeviceConfigure(DeviceConfiguration r1) {
        this.deviceConfigure = r1;
        return this;
    }

    public DeviceStatus setDeviceInfo(TargetInfoResponse r2) {
        if ((r2 instanceof DeviceInfo) == false) goto L6;
        this.mDeviceInfo = (DeviceInfo) r2;
        return this;
    L6:
        this.mDeviceInfo = DeviceInfo.convertFromTargetInfo(r2);
        return this;
    }

    public DeviceStatus setEnableLatencyMode(boolean r1) {
        this.isEnableLatencyMode = r1;
        return this;
    }

    public DeviceStatus setExtFlashMSg(ExternalFlashMsgResponse r1) {
        this.mExtFlashMSg = r1;
        return this;
    }

    public DeviceStatus setFileTransfer(boolean r1) {
        this.isFileTransfer = r1;
        return this;
    }

    public DeviceStatus setLatencySettings(GetLowLatencySettingsResponse r1) {
        this.mLatencySettings = r1;
        return this;
    }

    public DeviceStatus setMaxCommunicationMtu(int r1) {
        this.maxCommunicationMtu = r1;
        return this;
    }

    public DeviceStatus setMaxReceiveMtu(int r1) {
        this.maxReceiveMtu = r1;
        return this;
    }

    public DeviceStatus setStatus(int r1) {
        this.status = r1;
        return this;
    }

    public DeviceStatus setTwsConnected(boolean r1) {
        this.isTwsConnected = r1;
        return this;
    }

    public DeviceStatus setVoiceData(VoiceData r1) {
        this.mVoiceData = r1;
        return this;
    }

    public DeviceStatus setWorkMode(int r1) {
        this.workMode = r1;
        return this;
    }

    public String toString() {
        return "DeviceStatus{status=" + this.status + ", isAuthDevice=" + this.isAuthDevice + ", isEnableLatencyMode=" + this.isEnableLatencyMode + ", isFileTransfer=" + this.isFileTransfer + ", isDataTransfer=" + this.isDataTransfer + ", workState=" + this.workMode + ", mDeviceInfo=" + this.mDeviceInfo + ", mADVInfo=" + this.mADVInfo + ", mDevMD5='" + this.mDevMD5 + "', mLatencySettings=" + this.mLatencySettings + ", maxCommunicationMtu=" + this.maxCommunicationMtu + ", maxReceiveMtu=" + this.maxReceiveMtu + ", mVoiceData=" + this.mVoiceData + ", isTwsConnected=" + this.isTwsConnected + ", mExtFlashMSg=" + this.mExtFlashMSg + ", deviceConfigure=" + this.deviceConfigure + i0XO1.IO;
    }
}
