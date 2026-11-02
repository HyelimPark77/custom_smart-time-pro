package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGameTimeReminder extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 4;
    private int mEnabled;
    private int mMinute;

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

    public BleGameTimeReminder() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleGameTimeReminder copy$default(BleGameTimeReminder r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mMinute;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mEnabled;
    }

    public final int component2() {
        return this.mMinute;
    }

    @aa1
    public final BleGameTimeReminder copy(int r2, int r3) {
        return new BleGameTimeReminder(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        writeInt8(this.mMinute);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleGameTimeReminder) == true) goto L8;
        return false;
    L8:
        BleGameTimeReminder r6 = (BleGameTimeReminder) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (this.mMinute == r6.mMinute) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 4;
    }

    public final int getMMinute() {
        return this.mMinute;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mEnabled) * 31) + Integer.hashCode(this.mMinute);
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    public final void setMMinute(int r1) {
        this.mMinute = r1;
    }

    @aa1
    public String toString() {
        return "BleGameTimeReminder(mEnabled=" + this.mEnabled + ", mMinute=" + this.mMinute + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGameTimeReminder(int r1, int r2) {
        this.mEnabled = r1;
        this.mMinute = r2;
    }

    public /* synthetic */ BleGameTimeReminder(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
