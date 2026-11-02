package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadAlipayBindInfoData {
    private int result;
    private long time;

    @aa1
    private String bleName = "";

    @aa1
    private String firmwareFlag = "";

    @aa1
    private String macAddress = "";

    @aa1
    private String firmwareVersion = "";

    @aa1
    private String appVersion = "";

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

    public final void setAppVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.bleName = str;
    }

    public final void setFirmwareFlag(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.firmwareFlag = str;
    }

    public final void setFirmwareVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.firmwareVersion = str;
    }

    public final void setMacAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.macAddress = str;
    }

    public final void setResult(int i) {
        this.result = i;
    }

    public final void setTime(long j) {
        this.time = j;
    }
}
