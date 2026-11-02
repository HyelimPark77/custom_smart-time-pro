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
    public int parse(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            return 0;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte b = byteBufferWrap.get();
        setSupportMD5(CHexConver.checkBitValue(b, 0));
        setGameMode(CHexConver.checkBitValue(b, 1));
        setSupportSearchDevice(CHexConver.checkBitValue(b, 2));
        setSupportSoundCard(CHexConver.checkBitValue(b, 3));
        setBanEq(CHexConver.checkBitValue(b, 4));
        setSupportExternalFlashTransfer(CHexConver.checkBitValue(b, 5));
        setSupportAnc(CHexConver.checkBitValue(b, 6));
        setSupportReadErrorMSg(CHexConver.checkBitValue(b, 7));
        if (byteBufferWrap.remaining() > 0) {
            byte b2 = byteBufferWrap.get();
            setSupportHearingAssist(CHexConver.checkBitValue(b2, 0));
            setSupportAdaptiveANC(CHexConver.checkBitValue(b2, 1));
            setSupportDevConfigure(CHexConver.checkBitValue(b2, 2));
            setSupportSmartNoPick(CHexConver.checkBitValue(b2, 3));
            setSupportSceneDenoising(CHexConver.checkBitValue(b2, 4));
            setSupportWindNoiseDetection(CHexConver.checkBitValue(b2, 5));
            setSupportVocalBooster(CHexConver.checkBitValue(b2, 6));
            setSupportDoubleConnection(CHexConver.checkBitValue(b2, 7));
        }
        return byteBufferWrap.position();
    }

    public ExpandFunc setBanEq(boolean z) {
        this.banEq = z;
        return this;
    }

    public ExpandFunc setGameMode(boolean z) {
        this.isGameMode = z;
        return this;
    }

    public ExpandFunc setSupportAdaptiveANC(boolean z) {
        this.supportAdaptiveANC = z;
        return this;
    }

    public ExpandFunc setSupportAnc(boolean z) {
        this.supportAnc = z;
        return this;
    }

    public ExpandFunc setSupportDevConfigure(boolean z) {
        this.supportDevConfigure = z;
        return this;
    }

    public ExpandFunc setSupportDoubleConnection(boolean z) {
        this.supportDoubleConnection = z;
        return this;
    }

    public ExpandFunc setSupportExternalFlashTransfer(boolean z) {
        this.supportExternalFlashTransfer = z;
        return this;
    }

    public ExpandFunc setSupportHearingAssist(boolean z) {
        this.supportHearingAssist = z;
        return this;
    }

    public ExpandFunc setSupportMD5(boolean z) {
        this.isSupportMD5 = z;
        return this;
    }

    public ExpandFunc setSupportReadErrorMSg(boolean z) {
        this.supportReadErrorMSg = z;
        return this;
    }

    public ExpandFunc setSupportSceneDenoising(boolean z) {
        this.supportSceneDenoising = z;
        return this;
    }

    public ExpandFunc setSupportSearchDevice(boolean z) {
        this.isSupportSearchDevice = z;
        return this;
    }

    public ExpandFunc setSupportSmartNoPick(boolean z) {
        this.supportSmartNoPick = z;
        return this;
    }

    public ExpandFunc setSupportSoundCard(boolean z) {
        this.supportSoundCard = z;
        return this;
    }

    public ExpandFunc setSupportVocalBooster(boolean z) {
        this.supportVocalBooster = z;
        return this;
    }

    public ExpandFunc setSupportWindNoiseDetection(boolean z) {
        this.supportWindNoiseDetection = z;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue((byte) 0, 0, this.isSupportMD5), 1, this.isGameMode), 2, this.isSupportSearchDevice), 3, this.supportSoundCard), 4, this.banEq), 5, this.supportExternalFlashTransfer), 6, this.supportAnc), 7, this.supportReadErrorMSg));
        byteArrayOutputStream.write(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue((byte) 0, 0, this.supportHearingAssist), 1, this.supportAdaptiveANC), 2, this.supportDevConfigure), 3, this.supportSmartNoPick), 4, this.supportSceneDenoising), 5, this.supportWindNoiseDetection), 6, this.supportVocalBooster), 7, this.supportDoubleConnection));
        return byteArrayOutputStream.toByteArray();
    }

    public String toString() {
        return "ExpandFunc{isSupportMD5=" + this.isSupportMD5 + ", isGameMode=" + this.isGameMode + ", isSupportSearchDevice=" + this.isSupportSearchDevice + ", supportSoundCard=" + this.supportSoundCard + ", banEq=" + this.banEq + ", supportExternalFlashTransfer=" + this.supportExternalFlashTransfer + ", supportAnc=" + this.supportAnc + ", supportReadErrorMSg=" + this.supportReadErrorMSg + ", supportHearingAssist=" + this.supportHearingAssist + ", supportAdaptiveANC=" + this.supportAdaptiveANC + ", supportDevConfigure=" + this.supportDevConfigure + i0XO1.f7442IO;
    }
}
