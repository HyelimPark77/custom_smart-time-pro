package com.jieli.jl_rcsp.model.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class VoiceMode implements Parcelable {
    public static final Parcelable.Creator<VoiceMode> CREATOR = null;
    public static final int VOICE_MODE_CLOSE = 0;
    public static final int VOICE_MODE_DENOISE = 1;
    public static final int VOICE_MODE_TRANSPARENT = 2;
    private int leftCurVal;
    private int leftMax;
    private int mode;
    private int rightCurVal;
    private int rightMax;

    static {
        CREATOR = new AnonymousClass1();
    }

    public VoiceMode() {
        this.mode = -1;
    }

    public static boolean isValidMode(int r2) {
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L10;
        if (r2 == 2) goto L10;
        return false;
    L10:
        return true;
    }

    public static VoiceMode parse(byte[] r6) {
        if (r6 != null) goto L4;
        return null;
    L4:
        if (r6.length != 9) goto L10;
        int r0 = CHexConver.byteToInt(r6[0]);
        int r1 = CHexConver.bytesToInt(r6, 1, 2);
        int r3 = CHexConver.bytesToInt(r6, 3, 2);
        int r4 = CHexConver.bytesToInt(r6, 5, 2);
        int r7 = CHexConver.bytesToInt(r6, 7, 2);
        return new VoiceMode().setMode(r0).setLeftMax(r1).setLeftCurVal(r4).setRightMax(r3).setRightCurVal(r7);
    L10:
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getBytes() {
        byte[] r0 = new byte[9];
        r0[0] = CHexConver.intToByte(this.mode);
        byte[] r1 = CHexConver.int2byte2(this.leftMax);
        System.arraycopy(r1, 0, r0, 1, r1.length);
        int r2 = r1.length + 1;
        byte[] r3 = CHexConver.int2byte2(this.rightMax);
        System.arraycopy(r3, 0, r0, r2, r3.length);
        int r4 = r2 + r3.length;
        byte[] r5 = CHexConver.int2byte2(this.leftCurVal);
        System.arraycopy(r5, 0, r0, r4, r5.length);
        int r6 = r4 + r5.length;
        byte[] r7 = CHexConver.int2byte2(this.rightCurVal);
        System.arraycopy(r7, 0, r0, r6, r7.length);
        return r0;
    }

    public int getLeftCurVal() {
        return this.leftCurVal;
    }

    public int getLeftMax() {
        return this.leftMax;
    }

    public int getMode() {
        return this.mode;
    }

    public int getRightCurVal() {
        return this.rightCurVal;
    }

    public int getRightMax() {
        return this.rightMax;
    }

    public VoiceMode setLeftCurVal(int r1) {
        this.leftCurVal = r1;
        return this;
    }

    public VoiceMode setLeftMax(int r1) {
        this.leftMax = r1;
        return this;
    }

    public VoiceMode setMode(int r1) {
        this.mode = r1;
        return this;
    }

    public VoiceMode setRightCurVal(int r1) {
        this.rightCurVal = r1;
        return this;
    }

    public VoiceMode setRightMax(int r1) {
        this.rightMax = r1;
        return this;
    }

    public String toString() {
        return "VoiceMode{mode=" + this.mode + ", leftMax=" + this.leftMax + ", rightMax=" + this.rightMax + ", leftCurVal=" + this.leftCurVal + ", rightCurVal=" + this.rightCurVal + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.mode);
        r1.writeInt(this.leftMax);
        r1.writeInt(this.rightMax);
        r1.writeInt(this.leftCurVal);
        r1.writeInt(this.rightCurVal);
    }

    public VoiceMode(Parcel r2) {
        this.mode = -1;
        this.mode = r2.readInt();
        this.leftMax = r2.readInt();
        this.rightMax = r2.readInt();
        this.leftCurVal = r2.readInt();
        this.rightCurVal = r2.readInt();
    }
}
