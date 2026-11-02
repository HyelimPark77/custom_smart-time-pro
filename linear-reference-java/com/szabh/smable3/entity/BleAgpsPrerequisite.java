package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAgpsPrerequisite extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 32;
    private int mAltitude;
    private float mLatitude;
    private float mLongitude;

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

    public BleAgpsPrerequisite() {
        float r1 = 0.0f;
        float r2 = 0.0f;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleAgpsPrerequisite copy$default(BleAgpsPrerequisite r0, float r1, float r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mLongitude;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mLatitude;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mAltitude;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final float component1() {
        return this.mLongitude;
    }

    public final float component2() {
        return this.mLatitude;
    }

    public final int component3() {
        return this.mAltitude;
    }

    @aa1
    public final BleAgpsPrerequisite copy(float r2, float r3, int r4) {
        return new BleAgpsPrerequisite(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        float r0 = this.mLongitude;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r0, r1);
        float r2 = this.mLatitude;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r2, r1);
        int r3 = this.mAltitude;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r3, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAgpsPrerequisite) == true) goto L8;
        return false;
    L8:
        BleAgpsPrerequisite r6 = (BleAgpsPrerequisite) r5;
        if (Float.compare(this.mLongitude, r6.mLongitude) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.mLatitude, r6.mLatitude) == 0) goto L15;
        return false;
    L15:
        if (this.mAltitude == r6.mAltitude) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final float getMLatitude() {
        return this.mLatitude;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 32;
    }

    public final float getMLongitude() {
        return this.mLongitude;
    }

    public int hashCode() {
        return (((Float.hashCode(this.mLongitude) * 31) + Float.hashCode(this.mLatitude)) * 31) + Integer.hashCode(this.mAltitude);
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    public final void setMLatitude(float r1) {
        this.mLatitude = r1;
    }

    public final void setMLongitude(float r1) {
        this.mLongitude = r1;
    }

    @aa1
    public String toString() {
        return "BleAgpsPrerequisite(mLongitude=" + this.mLongitude + ", mLatitude=" + this.mLatitude + ", mAltitude=" + this.mAltitude + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAgpsPrerequisite(float r1, float r2, int r3) {
        this.mLongitude = r1;
        this.mLatitude = r2;
        this.mAltitude = r3;
    }

    public /* synthetic */ BleAgpsPrerequisite(float r2, float r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0.0f;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
