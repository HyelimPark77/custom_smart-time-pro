package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGameControl extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 16;
    public static final int STATE_CLOSE_GSENSOR = 6;
    public static final int STATE_END = 4;
    public static final int STATE_GOING = 1;
    public static final int STATE_OPEN_GSENSOR = 5;
    public static final int STATE_PAUSE = 3;
    public static final int STATE_RESUME = 2;
    public static final int STATE_START = 0;
    private int mState;

    /* JADX INFO: renamed from: mX */
    private int f55332mX;

    /* JADX INFO: renamed from: mY */
    private int f55333mY;

    /* JADX INFO: renamed from: mZ */
    private int f55334mZ;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleGameControl() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ BleGameControl copy$default(BleGameControl bleGameControl, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bleGameControl.mState;
        }
        if ((i5 & 2) != 0) {
            i2 = bleGameControl.f55332mX;
        }
        if ((i5 & 4) != 0) {
            i3 = bleGameControl.f55333mY;
        }
        if ((i5 & 8) != 0) {
            i4 = bleGameControl.f55334mZ;
        }
        return bleGameControl.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.mState;
    }

    public final int component2() {
        return this.f55332mX;
    }

    public final int component3() {
        return this.f55333mY;
    }

    public final int component4() {
        return this.f55334mZ;
    }

    @aa1
    public final BleGameControl copy(int i, int i2, int i3, int i4) {
        return new BleGameControl(i, i2, i3, i4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mState = readInt8();
        readInt8();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.f55332mX = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.f55333mY = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.f55334mZ = readInt16(LITTLE_ENDIAN);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mState);
        writeInt8(0);
        int i = this.f55332mX;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
        int i2 = this.f55333mY;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i2, LITTLE_ENDIAN);
        int i3 = this.f55334mZ;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i3, LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleGameControl)) {
            return false;
        }
        BleGameControl bleGameControl = (BleGameControl) obj;
        return this.mState == bleGameControl.mState && this.f55332mX == bleGameControl.f55332mX && this.f55333mY == bleGameControl.f55333mY && this.f55334mZ == bleGameControl.f55334mZ;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 16;
    }

    public final int getMState() {
        return this.mState;
    }

    public final int getMX() {
        return this.f55332mX;
    }

    public final int getMY() {
        return this.f55333mY;
    }

    public final int getMZ() {
        return this.f55334mZ;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mState) * 31) + Integer.hashCode(this.f55332mX)) * 31) + Integer.hashCode(this.f55333mY)) * 31) + Integer.hashCode(this.f55334mZ);
    }

    public final void setMState(int i) {
        this.mState = i;
    }

    public final void setMX(int i) {
        this.f55332mX = i;
    }

    public final void setMY(int i) {
        this.f55333mY = i;
    }

    public final void setMZ(int i) {
        this.f55334mZ = i;
    }

    @aa1
    public String toString() {
        return "BleGameControl(mState=" + this.mState + ", mX=" + this.f55332mX + ", mY=" + this.f55333mY + ", mZ=" + this.f55334mZ + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGameControl(int i, int i2, int i3, int i4) {
        this.mState = i;
        this.f55332mX = i2;
        this.f55333mY = i3;
        this.f55334mZ = i4;
    }

    public /* synthetic */ BleGameControl(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
