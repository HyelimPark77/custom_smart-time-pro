package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadAlipayBindInfoData {

    @aa1
    private String appVersion;

    @aa1
    private String bleName;

    @aa1
    private String firmwareFlag;

    @aa1
    private String firmwareVersion;

    @aa1
    private String macAddress;
    private int result;
    private long time;

    public UploadAlipayBindInfoData() {
        this.bleName = "";
        this.firmwareFlag = "";
        this.macAddress = "";
        this.firmwareVersion = "";
        this.appVersion = "";
    }

    @aa1
    public final String getAppVersion() {
        return this.appVersion;
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    @aa1
    public final String getFirmwareFlag() {
        return this.firmwareFlag;
    }

    @aa1
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @aa1
    public final String getMacAddress() {
        return this.macAddress;
    }

    public final int getResult() {
        return this.result;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setAppVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.appVersion = r2;
    }

    public final void setBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.bleName = r2;
    }

    public final void setFirmwareFlag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.firmwareFlag = r2;
    }

    public final void setFirmwareVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.firmwareVersion = r2;
    }

    public final void setMacAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.macAddress = r2;
    }

    public final void setResult(int r1) {
        this.result = r1;
    }

    public final void setTime(long r1) {
        this.time = r1;
    }
}
