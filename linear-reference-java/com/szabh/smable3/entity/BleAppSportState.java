package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAppSportState extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 2;
    public static final int MODE_CLIMBING = 13;
    public static final int MODE_CYCLING = 10;
    public static final int MODE_INDOOR = 8;
    public static final int MODE_OUTDOOR = 9;
    public static final int STATE_END = 4;
    public static final int STATE_PAUSE = 3;
    public static final int STATE_RESUME = 2;
    public static final int STATE_START = 1;
    private int mMode;
    private int mState;

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

    public BleAppSportState() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleAppSportState copy$default(BleAppSportState r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mMode;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mState;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mMode;
    }

    public final int component2() {
        return this.mState;
    }

    @aa1
    public final BleAppSportState copy(int r2, int r3) {
        return new BleAppSportState(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mMode = readInt8();
        this.mState = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMode);
        writeInt8(this.mState);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAppSportState) == true) goto L8;
        return false;
    L8:
        BleAppSportState r6 = (BleAppSportState) r5;
        if (this.mMode == r6.mMode) goto L12;
        return false;
    L12:
        if (this.mState == r6.mState) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 2;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMState() {
        return this.mState;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mMode) * 31) + Integer.hashCode(this.mState);
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    @aa1
    public String toString() {
        return "BleAppSportState(mMode=" + this.mMode + ", mState=" + this.mState + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAppSportState(int r1, int r2) {
        this.mMode = r1;
        this.mState = r2;
    }

    public /* synthetic */ BleAppSportState(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
