package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleRecordControl extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    public static final int STATE_START = 1;
    public static final int STATE_STOP = 0;
    public static final int TYPE_AUDIO = 0;
    public static final int TYPE_VIDEO = 1;
    private int mState;
    private int mType;

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

    public BleRecordControl() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleRecordControl copy$default(BleRecordControl r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mState;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mType;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mState;
    }

    public final int component2() {
        return this.mType;
    }

    @aa1
    public final BleRecordControl copy(int r2, int r3) {
        return new BleRecordControl(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mState = readInt8();
        this.mType = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mState);
        writeInt8(this.mType);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleRecordControl) == true) goto L8;
        return false;
    L8:
        BleRecordControl r6 = (BleRecordControl) r5;
        if (this.mState == r6.mState) goto L12;
        return false;
    L12:
        if (this.mType == r6.mType) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public final int getMState() {
        return this.mState;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mState) * 31) + Integer.hashCode(this.mType);
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleRecordControl(mState=" + this.mState + ", mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRecordControl(int r1, int r2) {
        this.mState = r1;
        this.mType = r2;
    }

    public /* synthetic */ BleRecordControl(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
