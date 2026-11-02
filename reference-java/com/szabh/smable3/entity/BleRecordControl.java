package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleRecordControl extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    public static final int STATE_START = 1;
    public static final int STATE_STOP = 0;
    public static final int TYPE_AUDIO = 0;
    public static final int TYPE_VIDEO = 1;
    private int mState;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleRecordControl() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleRecordControl copy$default(BleRecordControl bleRecordControl, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleRecordControl.mState;
        }
        if ((i3 & 2) != 0) {
            i2 = bleRecordControl.mType;
        }
        return bleRecordControl.copy(i, i2);
    }

    public final int component1() {
        return this.mState;
    }

    public final int component2() {
        return this.mType;
    }

    @aa1
    public final BleRecordControl copy(int i, int i2) {
        return new BleRecordControl(i, i2);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleRecordControl)) {
            return false;
        }
        BleRecordControl bleRecordControl = (BleRecordControl) obj;
        return this.mState == bleRecordControl.mState && this.mType == bleRecordControl.mType;
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

    public final void setMState(int i) {
        this.mState = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleRecordControl(mState=" + this.mState + ", mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRecordControl(int i, int i2) {
        this.mState = i;
        this.mType = i2;
    }

    public /* synthetic */ BleRecordControl(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
