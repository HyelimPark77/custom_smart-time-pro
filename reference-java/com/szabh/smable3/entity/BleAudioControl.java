package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAudioControl extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    public static final int STATUS_START = 0;
    public static final int STATUS_STOP = 1;
    private int mMode;
    private int mStatus;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleAudioControl() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleAudioControl copy$default(BleAudioControl bleAudioControl, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleAudioControl.mMode;
        }
        if ((i3 & 2) != 0) {
            i2 = bleAudioControl.mStatus;
        }
        return bleAudioControl.copy(i, i2);
    }

    public final int component1() {
        return this.mMode;
    }

    public final int component2() {
        return this.mStatus;
    }

    @aa1
    public final BleAudioControl copy(int i, int i2) {
        return new BleAudioControl(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMode);
        writeInt8(this.mStatus);
        BleWritable.writeBytes$default(this, new byte[6], null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAudioControl)) {
            return false;
        }
        BleAudioControl bleAudioControl = (BleAudioControl) obj;
        return this.mMode == bleAudioControl.mMode && this.mStatus == bleAudioControl.mStatus;
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

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMStatus(int i) {
        this.mStatus = i;
    }

    @aa1
    public String toString() {
        return "BleAudioControl(mMode=" + this.mMode + ", mStatus=" + this.mStatus + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAudioControl(int i, int i2) {
        this.mMode = i;
        this.mStatus = i2;
    }

    public /* synthetic */ BleAudioControl(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
