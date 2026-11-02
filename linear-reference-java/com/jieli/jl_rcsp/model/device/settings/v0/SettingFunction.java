package com.jieli.jl_rcsp.model.device.settings.v0;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.device.settings.SettingData;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class SettingFunction extends SettingData {
    public static final Parcelable.Creator<SettingFunction> CREATOR = null;
    public static final int FUNC_4G_NETWORK_FUNCTION = 5;
    public static final int FUNC_BOUND_DEVICE_STATE = 3;
    public static final int FUNC_BRIGHTNESS = 1;
    public static final int FUNC_DIAL_EXPAND_INFO = 7;
    public static final int FUNC_FLASHLIGHT = 2;
    public static final int FUNC_USING_RESOURCE = 4;
    public static final int OP_NOTIFY = 2;
    public static final int OP_READ = 0;
    public static final int OP_SET = 1;
    private int funcVersion;
    private int function;
    private int op;
    private byte[] payload;

    static {
        CREATOR = new AnonymousClass1();
    }

    public SettingFunction(byte[] r1) {
        super(r1);
    }

    private static byte[] convertData(int r1, int r2, int r3, byte[] r4) {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(CHexConver.int2byte2(r1));     // Catch: IOException -> L8
        r0.write(r2);     // Catch: IOException -> L8
        r0.write(r3);     // Catch: IOException -> L8
        if (r4 == null) goto L7;
        r0.write(r4);     // Catch: IOException -> L8
    L7:
        return r0.toByteArray();
    L8:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.SettingData, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getFuncVersion() {
        return this.funcVersion;
    }

    public int getFunction() {
        return this.function;
    }

    public int getOp() {
        return this.op;
    }

    public byte[] getPayload() {
        return this.payload;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.SettingData, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r6) {
        this.payload = new byte[0];
        int r7 = super.parse(r6);
        if (r7 == 0) goto L11;
        byte[] r1 = getData();
        if (r1.length < 4) goto L11;
        this.function = CHexConver.bytesToInt(r1, 0, 2);
        this.funcVersion = CHexConver.byteToInt(r1[2]);
        this.op = CHexConver.byteToInt(r1[3]);
        if (4 >= r1.length) goto L11;
        int r2 = r1.length - 4;
        byte[] r4 = new byte[r2];
        this.payload = r4;
        System.arraycopy(r1, 4, r4, 0, r2);
    L11:
        return r7;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.SettingData
    public String toString() {
        return "SettingFunction{function=" + this.function + ", funcVersion=" + this.funcVersion + ", op=" + this.op + ", payload=" + CHexConver.byte2HexStr(this.payload) + i0XO1.IO;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.SettingData, android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.function);
        r1.writeInt(this.funcVersion);
        r1.writeInt(this.op);
        r1.writeByteArray(this.payload);
    }

    public SettingFunction(int r3, int r4, int r5, byte[] r6) {
        super(0, convertData(r3, r4, r5, r6));
        this.function = r3;
        this.funcVersion = r4;
        this.op = r5;
        this.payload = r6;
    }

    public SettingFunction(Parcel r2) {
        super(r2);
        this.function = r2.readInt();
        this.funcVersion = r2.readInt();
        this.op = r2.readInt();
        this.payload = r2.createByteArray();
    }
}
