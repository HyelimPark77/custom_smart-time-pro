package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSedentarinessSettings extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 6;
    private int mEnabled;
    private int mEndHour;
    private int mEndMinute;
    private int mInterval;
    private int mRepeat;
    private int mStartHour;
    private int mStartMinute;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleSedentarinessSettings() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ BleSedentarinessSettings copy$default(BleSedentarinessSettings bleSedentarinessSettings, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = bleSedentarinessSettings.mEnabled;
        }
        if ((i8 & 2) != 0) {
            i2 = bleSedentarinessSettings.mRepeat;
        }
        if ((i8 & 4) != 0) {
            i3 = bleSedentarinessSettings.mStartHour;
        }
        if ((i8 & 8) != 0) {
            i4 = bleSedentarinessSettings.mStartMinute;
        }
        if ((i8 & 16) != 0) {
            i5 = bleSedentarinessSettings.mEndHour;
        }
        if ((i8 & 32) != 0) {
            i6 = bleSedentarinessSettings.mEndMinute;
        }
        if ((i8 & 64) != 0) {
            i7 = bleSedentarinessSettings.mInterval;
        }
        int i9 = i6;
        int i10 = i7;
        int i11 = i5;
        int i12 = i3;
        return bleSedentarinessSettings.copy(i, i2, i12, i4, i11, i9, i10);
    }

    public final int component1() {
        return this.mEnabled;
    }

    public final int component2() {
        return this.mRepeat;
    }

    public final int component3() {
        return this.mStartHour;
    }

    public final int component4() {
        return this.mStartMinute;
    }

    public final int component5() {
        return this.mEndHour;
    }

    public final int component6() {
        return this.mEndMinute;
    }

    public final int component7() {
        return this.mInterval;
    }

    @aa1
    public final BleSedentarinessSettings copy(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new BleSedentarinessSettings(i, i2, i3, i4, i5, i6, i7);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mEnabled = readIntN(1);
        this.mRepeat = readIntN(7);
        this.mStartHour = readUInt8();
        this.mStartMinute = readUInt8();
        this.mEndHour = readUInt8();
        this.mEndMinute = readUInt8();
        this.mInterval = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeIntN(this.mEnabled, 1);
        writeIntN(this.mRepeat, 7);
        writeInt8(this.mStartHour);
        writeInt8(this.mStartMinute);
        writeInt8(this.mEndHour);
        writeInt8(this.mEndMinute);
        writeInt8(this.mInterval);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSedentarinessSettings)) {
            return false;
        }
        BleSedentarinessSettings bleSedentarinessSettings = (BleSedentarinessSettings) obj;
        return this.mEnabled == bleSedentarinessSettings.mEnabled && this.mRepeat == bleSedentarinessSettings.mRepeat && this.mStartHour == bleSedentarinessSettings.mStartHour && this.mStartMinute == bleSedentarinessSettings.mStartMinute && this.mEndHour == bleSedentarinessSettings.mEndHour && this.mEndMinute == bleSedentarinessSettings.mEndMinute && this.mInterval == bleSedentarinessSettings.mInterval;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    public final int getMEndHour() {
        return this.mEndHour;
    }

    public final int getMEndMinute() {
        return this.mEndMinute;
    }

    public final int getMInterval() {
        return this.mInterval;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 6;
    }

    public final int getMRepeat() {
        return this.mRepeat;
    }

    public final int getMStartHour() {
        return this.mStartHour;
    }

    public final int getMStartMinute() {
        return this.mStartMinute;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mEnabled) * 31) + Integer.hashCode(this.mRepeat)) * 31) + Integer.hashCode(this.mStartHour)) * 31) + Integer.hashCode(this.mStartMinute)) * 31) + Integer.hashCode(this.mEndHour)) * 31) + Integer.hashCode(this.mEndMinute)) * 31) + Integer.hashCode(this.mInterval);
    }

    public final void setMEnabled(int i) {
        this.mEnabled = i;
    }

    public final void setMEndHour(int i) {
        this.mEndHour = i;
    }

    public final void setMEndMinute(int i) {
        this.mEndMinute = i;
    }

    public final void setMInterval(int i) {
        this.mInterval = i;
    }

    public final void setMRepeat(int i) {
        this.mRepeat = i;
    }

    public final void setMStartHour(int i) {
        this.mStartHour = i;
    }

    public final void setMStartMinute(int i) {
        this.mStartMinute = i;
    }

    @aa1
    public String toString() {
        return "BleSedentarinessSettings(mEnabled=" + this.mEnabled + ", mRepeat=" + this.mRepeat + ", mStartHour=" + this.mStartHour + ", mStartMinute=" + this.mStartMinute + ", mEndHour=" + this.mEndHour + ", mEndMinute=" + this.mEndMinute + ", mInterval=" + this.mInterval + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSedentarinessSettings(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mEnabled = i;
        this.mRepeat = i2;
        this.mStartHour = i3;
        this.mStartMinute = i4;
        this.mEndHour = i5;
        this.mEndMinute = i6;
        this.mInterval = i7;
    }

    public /* synthetic */ BleSedentarinessSettings(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }
}
