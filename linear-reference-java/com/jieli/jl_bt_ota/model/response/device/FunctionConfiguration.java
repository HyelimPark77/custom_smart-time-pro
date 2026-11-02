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
    private boolean supportSd0;
    private boolean supportSd1;
    private boolean supportUsb;

    public FunctionConfiguration() {
        this.supportUsb = true;
        this.supportSd0 = true;
        this.supportSd1 = true;
    }

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
    public int parse(byte[] r4) {
        if (r4 != null) goto L5;
    L12:
        return 0;
    L5:
        if (r4.length < 5) goto L12;
        ByteBuffer r5 = ByteBuffer.wrap(r4);
        setFunctionMask(r5.getInt()).setCurFunction(CHexConver.byteToInt(r5.get()));
        if (r5.hasRemaining() == false) goto L11;
        byte r1 = r5.get();
        setSupportOfflineShow(CHexConver.checkBitValue(r1, 0)).setSupportUsb(CHexConver.checkBitValue(r1, 1)).setSupportSd0(CHexConver.checkBitValue(r1, 2)).setSupportSd1(CHexConver.checkBitValue(r1, 3)).setHideNetRadio(CHexConver.checkBitValue(r1, 4));
    L11:
        return r5.position();
    }

    public FunctionConfiguration setCurFunction(int r1) {
        this.curFunction = r1;
        return this;
    }

    public FunctionConfiguration setFunctionMask(int r1) {
        this.functionMask = r1;
        return this;
    }

    public FunctionConfiguration setHideNetRadio(boolean r1) {
        this.hideNetRadio = r1;
        return this;
    }

    public FunctionConfiguration setSupportOfflineShow(boolean r1) {
        this.supportOfflineShow = r1;
        return this;
    }

    public FunctionConfiguration setSupportSd0(boolean r1) {
        this.supportSd0 = r1;
        return this;
    }

    public FunctionConfiguration setSupportSd1(boolean r1) {
        this.supportSd1 = r1;
        return this;
    }

    public FunctionConfiguration setSupportUsb(boolean r1) {
        this.supportUsb = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(CHexConver.intToBigBytes(this.functionMask));     // Catch: IOException -> L5
        r0.write(this.curFunction);     // Catch: IOException -> L5
        r0.write(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue((byte) 0, 0, this.supportOfflineShow), 1, this.supportUsb), 2, this.supportSd0), 3, this.supportSd1), 4, this.hideNetRadio));     // Catch: IOException -> L5
    L8:
        return r0.toByteArray();
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L8
    }

    public String toString() {
        return "FunctionConfiguration{functionMask=" + this.functionMask + ", curFunction=" + this.curFunction + ", supportOfflineShow=" + this.supportOfflineShow + ", supportUsb=" + this.supportUsb + ", supportSd0=" + this.supportSd0 + ", supportSd1=" + this.supportSd1 + ", hideNetRadio=" + this.hideNetRadio + i0XO1.IO;
    }
}
