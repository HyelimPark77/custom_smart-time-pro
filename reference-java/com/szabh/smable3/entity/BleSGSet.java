package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSGSet extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 32;
    private int mHighImageReco;
    private int mLogEnable;
    private int mNoise;
    private int mSwitchPhoneAssistant;
    private int mWearDetection;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleSGSet() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ BleSGSet copy$default(BleSGSet bleSGSet, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = bleSGSet.mHighImageReco;
        }
        if ((i6 & 2) != 0) {
            i2 = bleSGSet.mLogEnable;
        }
        if ((i6 & 4) != 0) {
            i3 = bleSGSet.mSwitchPhoneAssistant;
        }
        if ((i6 & 8) != 0) {
            i4 = bleSGSet.mWearDetection;
        }
        if ((i6 & 16) != 0) {
            i5 = bleSGSet.mNoise;
        }
        int i7 = i5;
        int i8 = i3;
        return bleSGSet.copy(i, i2, i8, i4, i7);
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
    public final BleSGSet copy(int i, int i2, int i3, int i4, int i5) {
        return new BleSGSet(i, i2, i3, i4, i5);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSGSet)) {
            return false;
        }
        BleSGSet bleSGSet = (BleSGSet) obj;
        return this.mHighImageReco == bleSGSet.mHighImageReco && this.mLogEnable == bleSGSet.mLogEnable && this.mSwitchPhoneAssistant == bleSGSet.mSwitchPhoneAssistant && this.mWearDetection == bleSGSet.mWearDetection && this.mNoise == bleSGSet.mNoise;
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

    public final void setMHighImageReco(int i) {
        this.mHighImageReco = i;
    }

    public final void setMLogEnable(int i) {
        this.mLogEnable = i;
    }

    public final void setMNoise(int i) {
        this.mNoise = i;
    }

    public final void setMSwitchPhoneAssistant(int i) {
        this.mSwitchPhoneAssistant = i;
    }

    public final void setMWearDetection(int i) {
        this.mWearDetection = i;
    }

    @aa1
    public String toString() {
        return "BleSGSet(mHighImageReco=" + this.mHighImageReco + ", mLogEnable=" + this.mLogEnable + ", mSwitchPhoneAssistant=" + this.mSwitchPhoneAssistant + ", mWearDetection=" + this.mWearDetection + ", mNoise=" + this.mNoise + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSGSet(int i, int i2, int i3, int i4, int i5) {
        this.mHighImageReco = i;
        this.mLogEnable = i2;
        this.mSwitchPhoneAssistant = i3;
        this.mWearDetection = i4;
        this.mNoise = i5;
    }

    public /* synthetic */ BleSGSet(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
