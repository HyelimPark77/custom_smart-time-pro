package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGameTimeReminder extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 4;
    private int mEnabled;
    private int mMinute;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleGameTimeReminder() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleGameTimeReminder copy$default(BleGameTimeReminder bleGameTimeReminder, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleGameTimeReminder.mEnabled;
        }
        if ((i3 & 2) != 0) {
            i2 = bleGameTimeReminder.mMinute;
        }
        return bleGameTimeReminder.copy(i, i2);
    }

    public final int component1() {
        return this.mEnabled;
    }

    public final int component2() {
        return this.mMinute;
    }

    @aa1
    public final BleGameTimeReminder copy(int i, int i2) {
        return new BleGameTimeReminder(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        writeInt8(this.mMinute);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleGameTimeReminder)) {
            return false;
        }
        BleGameTimeReminder bleGameTimeReminder = (BleGameTimeReminder) obj;
        return this.mEnabled == bleGameTimeReminder.mEnabled && this.mMinute == bleGameTimeReminder.mMinute;
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

    public final void setMEnabled(int i) {
        this.mEnabled = i;
    }

    public final void setMMinute(int i) {
        this.mMinute = i;
    }

    @aa1
    public String toString() {
        return "BleGameTimeReminder(mEnabled=" + this.mEnabled + ", mMinute=" + this.mMinute + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGameTimeReminder(int i, int i2) {
        this.mEnabled = i;
        this.mMinute = i2;
    }

    public /* synthetic */ BleGameTimeReminder(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
