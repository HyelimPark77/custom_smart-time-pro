package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSGSet extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 32;
    private int mHighImageReco;
    private int mLogEnable;
    private int mNoise;
    private int mSwitchPhoneAssistant;
    private int mWearDetection;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleSGSet() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ BleSGSet copy$default(BleSGSet r0, int r1, int r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mHighImageReco;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mLogEnable;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mSwitchPhoneAssistant;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mWearDetection;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mNoise;
    L17:
        int r8 = r4;
        int r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.mHighImageReco;
    }

    public final int component2() {
        return this.mLogEnable;
    }

    public final int component3() {
        return this.mSwitchPhoneAssistant;
    }

    public final int component4() {
        return this.mWearDetection;
    }

    public final int component5() {
        return this.mNoise;
    }

    @aa1
    public final BleSGSet copy(int r7, int r8, int r9, int r10, int r11) {
        return new BleSGSet(r7, r8, r9, r10, r11);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mHighImageReco = readUInt8();
        this.mLogEnable = readUInt8();
        this.mSwitchPhoneAssistant = readUInt8();
        this.mWearDetection = readUInt8();
        this.mNoise = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mHighImageReco);
        writeInt8(this.mLogEnable);
        writeInt8(this.mSwitchPhoneAssistant);
        writeInt8(this.mWearDetection);
        writeInt8(this.mNoise);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSGSet) == true) goto L8;
        return false;
    L8:
        BleSGSet r6 = (BleSGSet) r5;
        if (this.mHighImageReco == r6.mHighImageReco) goto L12;
        return false;
    L12:
        if (this.mLogEnable == r6.mLogEnable) goto L15;
        return false;
    L15:
        if (this.mSwitchPhoneAssistant == r6.mSwitchPhoneAssistant) goto L18;
        return false;
    L18:
        if (this.mWearDetection == r6.mWearDetection) goto L21;
        return false;
    L21:
        if (this.mNoise == r6.mNoise) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getMHighImageReco() {
        return this.mHighImageReco;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 32;
    }

    public final int getMLogEnable() {
        return this.mLogEnable;
    }

    public final int getMNoise() {
        return this.mNoise;
    }

    public final int getMSwitchPhoneAssistant() {
        return this.mSwitchPhoneAssistant;
    }

    public final int getMWearDetection() {
        return this.mWearDetection;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mHighImageReco) * 31) + Integer.hashCode(this.mLogEnable)) * 31) + Integer.hashCode(this.mSwitchPhoneAssistant)) * 31) + Integer.hashCode(this.mWearDetection)) * 31) + Integer.hashCode(this.mNoise);
    }

    public final void setMHighImageReco(int r1) {
        this.mHighImageReco = r1;
    }

    public final void setMLogEnable(int r1) {
        this.mLogEnable = r1;
    }

    public final void setMNoise(int r1) {
        this.mNoise = r1;
    }

    public final void setMSwitchPhoneAssistant(int r1) {
        this.mSwitchPhoneAssistant = r1;
    }

    public final void setMWearDetection(int r1) {
        this.mWearDetection = r1;
    }

    @aa1
    public String toString() {
        return "BleSGSet(mHighImageReco=" + this.mHighImageReco + ", mLogEnable=" + this.mLogEnable + ", mSwitchPhoneAssistant=" + this.mSwitchPhoneAssistant + ", mWearDetection=" + this.mWearDetection + ", mNoise=" + this.mNoise + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSGSet(int r1, int r2, int r3, int r4, int r5) {
        this.mHighImageReco = r1;
        this.mLogEnable = r2;
        this.mSwitchPhoneAssistant = r3;
        this.mWearDetection = r4;
        this.mNoise = r5;
    }

    public /* synthetic */ BleSGSet(int r2, int r3, int r4, int r5, int r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r7 & 16) == 0) goto L18;
        int r9 = 0;
    L17:
        int r10 = r5;
        int r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
