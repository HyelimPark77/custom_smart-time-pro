package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAudioControl extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    public static final int STATUS_START = 0;
    public static final int STATUS_STOP = 1;
    private int mMode;
    private int mStatus;

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

    public BleAudioControl() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleAudioControl copy$default(BleAudioControl r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mMode;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mStatus;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mMode;
    }

    public final int component2() {
        return this.mStatus;
    }

    @aa1
    public final BleAudioControl copy(int r2, int r3) {
        return new BleAudioControl(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMode);
        writeInt8(this.mStatus);
        BleWritable.writeBytes$default(this, new byte[6], null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAudioControl) == true) goto L8;
        return false;
    L8:
        BleAudioControl r6 = (BleAudioControl) r5;
        if (this.mMode == r6.mMode) goto L12;
        return false;
    L12:
        if (this.mStatus == r6.mStatus) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMStatus() {
        return this.mStatus;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mMode) * 31) + Integer.hashCode(this.mStatus);
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMStatus(int r1) {
        this.mStatus = r1;
    }

    @aa1
    public String toString() {
        return "BleAudioControl(mMode=" + this.mMode + ", mStatus=" + this.mStatus + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAudioControl(int r1, int r2) {
        this.mMode = r1;
        this.mStatus = r2;
    }

    public /* synthetic */ BleAudioControl(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
