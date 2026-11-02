package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionConfiguration implements IDataOp {
    private int curFunction;
    private int functionMask;
    private boolean hideNetRadio;
    private boolean supportOfflineShow;
    private boolean supportUsb = true;
    private boolean supportSd0 = true;
    private boolean supportSd1 = true;

    public int getCurFunction() {
        return this.curFunction;
    }

    public int getFunctionMask() {
        return this.functionMask;
    }

    public boolean isHideNetRadio() {
        return this.hideNetRadio;
    }

    public boolean isSupportOfflineShow() {
        return this.supportOfflineShow;
    }

    public boolean isSupportSd0() {
        return this.supportSd0;
    }

    public boolean isSupportSd1() {
        return this.supportSd1;
    }

    public boolean isSupportUsb() {
        return this.supportUsb;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] bArr) {
        if (bArr == null || bArr.length < 5) {
            return 0;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        setFunctionMask(byteBufferWrap.getInt()).setCurFunction(CHexConver.byteToInt(byteBufferWrap.get()));
        if (byteBufferWrap.hasRemaining()) {
            byte b = byteBufferWrap.get();
            setSupportOfflineShow(CHexConver.checkBitValue(b, 0)).setSupportUsb(CHexConver.checkBitValue(b, 1)).setSupportSd0(CHexConver.checkBitValue(b, 2)).setSupportSd1(CHexConver.checkBitValue(b, 3)).setHideNetRadio(CHexConver.checkBitValue(b, 4));
        }
        return byteBufferWrap.position();
    }

    public FunctionConfiguration setCurFunction(int i) {
        this.curFunction = i;
        return this;
    }

    public FunctionConfiguration setFunctionMask(int i) {
        this.functionMask = i;
        return this;
    }

    public FunctionConfiguration setHideNetRadio(boolean z) {
        this.hideNetRadio = z;
        return this;
    }

    public FunctionConfiguration setSupportOfflineShow(boolean z) {
        this.supportOfflineShow = z;
        return this;
    }

    public FunctionConfiguration setSupportSd0(boolean z) {
        this.supportSd0 = z;
        return this;
    }

    public FunctionConfiguration setSupportSd1(boolean z) {
        this.supportSd1 = z;
        return this;
    }

    public FunctionConfiguration setSupportUsb(boolean z) {
        this.supportUsb = z;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(CHexConver.intToBigBytes(this.functionMask));
            byteArrayOutputStream.write(this.curFunction);
            byteArrayOutputStream.write(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue((byte) 0, 0, this.supportOfflineShow), 1, this.supportUsb), 2, this.supportSd0), 3, this.supportSd1), 4, this.hideNetRadio));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public String toString() {
        return "FunctionConfiguration{functionMask=" + this.functionMask + ", curFunction=" + this.curFunction + ", supportOfflineShow=" + this.supportOfflineShow + ", supportUsb=" + this.supportUsb + ", supportSd0=" + this.supportSd0 + ", supportSd1=" + this.supportSd1 + ", hideNetRadio=" + this.hideNetRadio + i0XO1.f7442IO;
    }
}
