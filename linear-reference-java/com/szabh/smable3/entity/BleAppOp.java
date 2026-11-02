package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAppOp extends BleWritable {
    public static final int COMMAND_HIDE = 1;
    public static final int COMMAND_INSTALL = 3;
    public static final int COMMAND_SHOW = 2;
    public static final int COMMAND_UNINSTALL = 0;

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 26;
    public static final int STATUS_FAIL = 2;
    public static final int STATUS_INSTALLING = 0;
    public static final int STATUS_SUCCESS = 1;
    private int mCommand;

    @aa1
    private String mPackage;
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

    public BleAppOp() {
        int r1 = 0;
        String r2 = null;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleAppOp copy$default(BleAppOp r0, int r1, String r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mCommand;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mPackage;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mStatus;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mCommand;
    }

    @aa1
    public final String component2() {
        return this.mPackage;
    }

    public final int component3() {
        return this.mStatus;
    }

    @aa1
    public final BleAppOp copy(int r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r3, "mPackage");
        return new BleAppOp(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCommand = readInt8();
        this.mPackage = BleReadable.readString$default(this, 24, null, 2, null);
        this.mStatus = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mCommand);
        BleWritable.writeStringWithFix$default(this, this.mPackage, 24, null, 4, null);
        writeInt8(this.mStatus);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAppOp) == true) goto L8;
        return false;
    L8:
        BleAppOp r6 = (BleAppOp) r5;
        if (this.mCommand == r6.mCommand) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mPackage, r6.mPackage) == true) goto L15;
        return false;
    L15:
        if (this.mStatus == r6.mStatus) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMCommand() {
        return this.mCommand;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 26;
    }

    @aa1
    public final String getMPackage() {
        return this.mPackage;
    }

    public final int getMStatus() {
        return this.mStatus;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mCommand) * 31) + this.mPackage.hashCode()) * 31) + Integer.hashCode(this.mStatus);
    }

    public final void setMCommand(int r1) {
        this.mCommand = r1;
    }

    public final void setMPackage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPackage = r2;
    }

    public final void setMStatus(int r1) {
        this.mStatus = r1;
    }

    @aa1
    public String toString() {
        return "BleAppOp(mCommand=" + this.mCommand + ", mPackage='" + this.mPackage + "', mStatus=" + this.mStatus + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAppOp(int r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r3, "mPackage");
        this.mCommand = r2;
        this.mPackage = r3;
        this.mStatus = r4;
    }

    public /* synthetic */ BleAppOp(int r2, String r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
