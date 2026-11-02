package com.jieli.jl_rcsp.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class ExpandFunc {
    private boolean banEq;
    private boolean isGameMode;
    private boolean isSupportMD5;
    private boolean isSupportSearchDevice;
    private byte[] rawData;
    private boolean supportAdaptiveANC;
    private boolean supportAnc;
    private boolean supportDevConfigure;
    private boolean supportExternalFlashTransfer;
    private boolean supportHearingAssist;
    private boolean supportReadErrorMSg;
    private boolean supportSoundCard;

    public ExpandFunc() {
    }

    public byte[] getRawData() {
        return this.rawData;
    }

    public boolean isBanEq() {
        return this.banEq;
    }

    public boolean isGameMode() {
        return this.isGameMode;
    }

    public boolean isSupportAdaptiveANC() {
        return this.supportAdaptiveANC;
    }

    public boolean isSupportAnc() {
        return this.supportAnc;
    }

    public boolean isSupportDevConfigure() {
        return this.supportDevConfigure;
    }

    public boolean isSupportExternalFlashTransfer() {
        return this.supportExternalFlashTransfer;
    }

    public boolean isSupportHearingAssist() {
        return this.supportHearingAssist;
    }

    public boolean isSupportMD5() {
        return this.isSupportMD5;
    }

    public boolean isSupportReadErrorMSg() {
        return this.supportReadErrorMSg;
    }

    public boolean isSupportSearchDevice() {
        return this.isSupportSearchDevice;
    }

    public boolean isSupportSoundCard() {
        return this.supportSoundCard;
    }

    public void parseData(byte[] r5) {
        if (r5 == null) goto L54;
        boolean r1 = true;
        if (r5.length < 1) goto L56;
        setRawData(r5);
        byte r2 = r5[0];
        if ((r2 & 1) != 1) goto L9;
        boolean r3 = true;
    L10:
        setSupportMD5(r3);
        if (((r2 >> 1) & 1) != 1) goto L13;
        boolean r4 = true;
    L14:
        setGameMode(r4);
        if (((r2 >> 2) & 1) != 1) goto L17;
        boolean r6 = true;
    L18:
        setSupportSearchDevice(r6);
        if (((r2 >> 3) & 1) != 1) goto L21;
        boolean r7 = true;
    L22:
        setSupportSoundCard(r7);
        if (((r2 >> 4) & 1) != 1) goto L25;
        boolean r8 = true;
    L26:
        setBanEq(r8);
        if (((r2 >> 5) & 1) != 1) goto L29;
        boolean r9 = true;
    L30:
        setSupportExternalFlashTransfer(r9);
        if (((r2 >> 6) & 1) != 1) goto L33;
        boolean r10 = true;
    L34:
        setSupportAnc(r10);
        if (((r2 >> 7) & 1) != 1) goto L37;
        boolean r11 = true;
    L38:
        setSupportReadErrorMSg(r11);
        if (r5.length < 2) goto L55;
        byte r12 = r5[1];
        if ((r12 & 1) != 1) goto L43;
        boolean r13 = true;
    L44:
        setSupportHearingAssist(r13);
        if (((r12 >> 1) & 1) != 1) goto L47;
        boolean r14 = true;
    L48:
        setSupportAdaptiveANC(r14);
        if (((r12 >> 2) & 1) == 1) goto L52;
        r1 = false;
    L52:
        setSupportDevConfigure(r1);
        return;
    L47:
        r14 = false;
        goto L48
    L43:
        r13 = false;
        goto L44
    L55:
        return;
    L37:
        r11 = false;
        goto L38
    L33:
        r10 = false;
        goto L34
    L29:
        r9 = false;
        goto L30
    L25:
        r8 = false;
        goto L26
    L21:
        r7 = false;
        goto L22
    L17:
        r6 = false;
        goto L18
    L13:
        r4 = false;
        goto L14
    L9:
        r3 = false;
        goto L10
    L56:
        return;
    }

    public void setBanEq(boolean r1) {
        this.banEq = r1;
    }

    public void setGameMode(boolean r1) {
        this.isGameMode = r1;
    }

    public void setRawData(byte[] r1) {
        this.rawData = r1;
    }

    public void setSupportAdaptiveANC(boolean r1) {
        this.supportAdaptiveANC = r1;
    }

    public void setSupportAnc(boolean r1) {
        this.supportAnc = r1;
    }

    public void setSupportDevConfigure(boolean r1) {
        this.supportDevConfigure = r1;
    }

    public void setSupportExternalFlashTransfer(boolean r1) {
        this.supportExternalFlashTransfer = r1;
    }

    public void setSupportHearingAssist(boolean r1) {
        this.supportHearingAssist = r1;
    }

    public void setSupportMD5(boolean r1) {
        this.isSupportMD5 = r1;
    }

    public void setSupportReadErrorMSg(boolean r1) {
        this.supportReadErrorMSg = r1;
    }

    public void setSupportSearchDevice(boolean r1) {
        this.isSupportSearchDevice = r1;
    }

    public void setSupportSoundCard(boolean r1) {
        this.supportSoundCard = r1;
    }

    public String toString() {
        return "ExpandFunc{rawData=" + CHexConver.byte2HexStr(this.rawData) + ", isSupportMD5=" + this.isSupportMD5 + ", isGameMode=" + this.isGameMode + ", isSupportSearchDevice=" + this.isSupportSearchDevice + ", supportSoundCard=" + this.supportSoundCard + ", banEq=" + this.banEq + ", supportExternalFlashTransfer=" + this.supportExternalFlashTransfer + ", supportAnc=" + this.supportAnc + ", supportReadErrorMSg=" + this.supportReadErrorMSg + ", supportHearingAssist=" + this.supportHearingAssist + ", supportAdaptiveANC=" + this.supportAdaptiveANC + ", supportDevConfigure=" + this.supportDevConfigure + i0XO1.IO;
    }
}
