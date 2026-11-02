package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class OTAState implements IDataOp {
    public static final int EXPAND_MODE_NONE = 0;
    public static final int EXPAND_MODE_REUSE_SPACE_OTA_ONLY_CODE = 3;
    public static final int EXPAND_MODE_REUSE_SPACE_OTA_ONLY_RESOURCE = 2;
    public static final int EXPAND_MODE_UPDATE_RESOURCE = 1;
    private int expandMode;
    private int mandatoryUpgradeFlag;
    private int requestOtaFlag;

    public int getExpandMode() {
        return this.expandMode;
    }

    public int getMandatoryUpgradeFlag() {
        return this.mandatoryUpgradeFlag;
    }

    public int getRequestOtaFlag() {
        return this.requestOtaFlag;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            return 0;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.mandatoryUpgradeFlag = CHexConver.byteToInt(byteBufferWrap.get());
        if (byteBufferWrap.hasRemaining()) {
            this.requestOtaFlag = CHexConver.byteToInt(byteBufferWrap.get());
        }
        if (byteBufferWrap.hasRemaining()) {
            this.expandMode = CHexConver.byteToInt(byteBufferWrap.get());
        }
        return byteBufferWrap.position();
    }

    public OTAState setExpandMode(int i) {
        this.expandMode = i;
        return this;
    }

    public OTAState setMandatoryUpgradeFlag(int i) {
        this.mandatoryUpgradeFlag = i;
        return this;
    }

    public OTAState setRequestOtaFlag(int i) {
        this.requestOtaFlag = i;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.mandatoryUpgradeFlag);
        byteArrayOutputStream.write(this.requestOtaFlag);
        byteArrayOutputStream.write(this.expandMode);
        return byteArrayOutputStream.toByteArray();
    }

    public String toString() {
        return "OTAState{mandatoryUpgradeFlag=" + this.mandatoryUpgradeFlag + ", requestOtaFlag=" + this.requestOtaFlag + ", expandMode=" + this.expandMode + i0XO1.f7442IO;
    }
}
