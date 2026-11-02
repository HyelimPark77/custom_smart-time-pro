package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleDeviceOp extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 4;
    public static final int TYPE_CLEAR_DATA = 4;
    public static final int TYPE_REBOOT = 1;
    public static final int TYPE_RESTORE_FACTORY = 3;
    public static final int TYPE_RESTORE_FACTORY_ALL = 2;
    public static final int TYPE_SHUTDOWN = 0;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleDeviceOp() {
        this(0, 1, null);
    }

    public static /* synthetic */ BleDeviceOp copy$default(BleDeviceOp bleDeviceOp, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleDeviceOp.mType;
        }
        return bleDeviceOp.copy(i);
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final BleDeviceOp copy(int i) {
        return new BleDeviceOp(i);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        BleWritable.writeInt24$default(this, 0, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleDeviceOp) && this.mType == ((BleDeviceOp) obj).mType;
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

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleDeviceOp(mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleDeviceOp(int i) {
        this.mType = i;
    }

    public /* synthetic */ BleDeviceOp(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
