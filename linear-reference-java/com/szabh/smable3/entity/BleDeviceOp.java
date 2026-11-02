package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleDeviceOp extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 4;
    public static final int TYPE_CLEAR_DATA = 4;
    public static final int TYPE_REBOOT = 1;
    public static final int TYPE_RESTORE_FACTORY = 3;
    public static final int TYPE_RESTORE_FACTORY_ALL = 2;
    public static final int TYPE_SHUTDOWN = 0;
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

    public BleDeviceOp() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public static /* synthetic */ BleDeviceOp copy$default(BleDeviceOp r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        return r0.copy(r1);
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final BleDeviceOp copy(int r2) {
        return new BleDeviceOp(r2);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        BleWritable.writeInt24$default(this, 0, null, 2, null);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleDeviceOp) == true) goto L9;
        return false;
    L9:
        if (this.mType == ((BleDeviceOp) r4).mType) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 4;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return Integer.hashCode(this.mType);
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleDeviceOp(mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleDeviceOp(int r1) {
        this.mType = r1;
    }

    public /* synthetic */ BleDeviceOp(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
