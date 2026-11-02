package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class ExpandFunc implements IDataOp {
    private boolean banEq;
    private boolean isGameMode;
    private boolean isSupportMD5;
    private boolean isSupportSearchDevice;
    private boolean supportAdaptiveANC;
    private boolean supportAnc;
    private boolean supportDevConfigure;
    private boolean supportDoubleConnection;
    private boolean supportExternalFlashTransfer;
    private boolean supportHearingAssist;
    private boolean supportReadErrorMSg;
    private boolean supportSceneDenoising;
    private boolean supportSmartNoPick;
    private boolean supportSoundCard;
    private boolean supportVocalBooster;
    private boolean supportWindNoiseDetection;

    public ExpandFunc() {
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

    public boolean isSupportDoubleConnection() {
        return this.supportDoubleConnection;
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

    public boolean isSupportSceneDenoising() {
        return this.supportSceneDenoising;
    }

    public boolean isSupportSearchDevice() {
        return this.isSupportSearchDevice;
    }

    public boolean isSupportSmartNoPick() {
        return this.supportSmartNoPick;
    }

    public boolean isSupportSoundCard() {
        return this.supportSoundCard;
    }

    public boolean isSupportVocalBooster() {
        return this.supportVocalBooster;
    }

    public boolean isSupportWindNoiseDetection() {
        return this.supportWindNoiseDetection;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] r10) {
        if (r10 != null) goto L5;
    L12:
        return 0;
    L5:
        if (r10.length < 1) goto L12;
        ByteBuffer r11 = ByteBuffer.wrap(r10);
        byte r1 = r11.get();
        setSupportMD5(CHexConver.checkBitValue(r1, 0));
        setGameMode(CHexConver.checkBitValue(r1, 1));
        setSupportSearchDevice(CHexConver.checkBitValue(r1, 2));
        setSupportSoundCard(CHexConver.checkBitValue(r1, 3));
        setBanEq(CHexConver.checkBitValue(r1, 4));
        setSupportExternalFlashTransfer(CHexConver.checkBitValue(r1, 5));
        setSupportAnc(CHexConver.checkBitValue(r1, 6));
        setSupportReadErrorMSg(CHexConver.checkBitValue(r1, 7));
        if (r11.remaining() <= 0) goto L11;
        byte r2 = r11.get();
        setSupportHearingAssist(CHexConver.checkBitValue(r2, 0));
        setSupportAdaptiveANC(CHexConver.checkBitValue(r2, 1));
        setSupportDevConfigure(CHexConver.checkBitValue(r2, 2));
        setSupportSmartNoPick(CHexConver.checkBitValue(r2, 3));
        setSupportSceneDenoising(CHexConver.checkBitValue(r2, 4));
        setSupportWindNoiseDetection(CHexConver.checkBitValue(r2, 5));
        setSupportVocalBooster(CHexConver.checkBitValue(r2, 6));
        setSupportDoubleConnection(CHexConver.checkBitValue(r2, 7));
    L11:
        return r11.position();
    }

    public ExpandFunc setBanEq(boolean r1) {
        this.banEq = r1;
        return this;
    }

    public ExpandFunc setGameMode(boolean r1) {
        this.isGameMode = r1;
        return this;
    }

    public ExpandFunc setSupportAdaptiveANC(boolean r1) {
        this.supportAdaptiveANC = r1;
        return this;
    }

    public ExpandFunc setSupportAnc(boolean r1) {
        this.supportAnc = r1;
        return this;
    }

    public ExpandFunc setSupportDevConfigure(boolean r1) {
        this.supportDevConfigure = r1;
        return this;
    }

    public ExpandFunc setSupportDoubleConnection(boolean r1) {
        this.supportDoubleConnection = r1;
        return this;
    }

    public ExpandFunc setSupportExternalFlashTransfer(boolean r1) {
        this.supportExternalFlashTransfer = r1;
        return this;
    }

    public ExpandFunc setSupportHearingAssist(boolean r1) {
        this.supportHearingAssist = r1;
        return this;
    }

    public ExpandFunc setSupportMD5(boolean r1) {
        this.isSupportMD5 = r1;
        return this;
    }

    public ExpandFunc setSupportReadErrorMSg(boolean r1) {
        this.supportReadErrorMSg = r1;
        return this;
    }

    public ExpandFunc setSupportSceneDenoising(boolean r1) {
        this.supportSceneDenoising = r1;
        return this;
    }

    public ExpandFunc setSupportSearchDevice(boolean r1) {
        this.isSupportSearchDevice = r1;
        return this;
    }

    public ExpandFunc setSupportSmartNoPick(boolean r1) {
        this.supportSmartNoPick = r1;
        return this;
    }

    public ExpandFunc setSupportSoundCard(boolean r1) {
        this.supportSoundCard = r1;
        return this;
    }

    public ExpandFunc setSupportVocalBooster(boolean r1) {
        this.supportVocalBooster = r1;
        return this;
    }

    public ExpandFunc setSupportWindNoiseDetection(boolean r1) {
        this.supportWindNoiseDetection = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue((byte) 0, 0, this.isSupportMD5), 1, this.isGameMode), 2, this.isSupportSearchDevice), 3, this.supportSoundCard), 4, this.banEq), 5, this.supportExternalFlashTransfer), 6, this.supportAnc), 7, this.supportReadErrorMSg));
        r0.write(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue((byte) 0, 0, this.supportHearingAssist), 1, this.supportAdaptiveANC), 2, this.supportDevConfigure), 3, this.supportSmartNoPick), 4, this.supportSceneDenoising), 5, this.supportWindNoiseDetection), 6, this.supportVocalBooster), 7, this.supportDoubleConnection));
        return r0.toByteArray();
    }

    public String toString() {
        return "ExpandFunc{isSupportMD5=" + this.isSupportMD5 + ", isGameMode=" + this.isGameMode + ", isSupportSearchDevice=" + this.isSupportSearchDevice + ", supportSoundCard=" + this.supportSoundCard + ", banEq=" + this.banEq + ", supportExternalFlashTransfer=" + this.supportExternalFlashTransfer + ", supportAnc=" + this.supportAnc + ", supportReadErrorMSg=" + this.supportReadErrorMSg + ", supportHearingAssist=" + this.supportHearingAssist + ", supportAdaptiveANC=" + this.supportAdaptiveANC + ", supportDevConfigure=" + this.supportDevConfigure + i0XO1.IO;
    }
}
