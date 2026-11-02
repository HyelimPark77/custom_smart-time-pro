package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMatchRecordPlayer extends BleReadable implements Serializable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 26;
    public static final int NAME_LENGTH = 25;

    @aa1
    private String mName;
    private int mNum;

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

    /* JADX WARN: Multi-variable type inference failed */
    public BleMatchRecordPlayer() {
        String r2 = null;
        this(r2, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleMatchRecordPlayer copy$default(BleMatchRecordPlayer r0, String r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mName;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mNum;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.mName;
    }

    public final int component2() {
        return this.mNum;
    }

    @aa1
    public final BleMatchRecordPlayer copy(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "mName");
        return new BleMatchRecordPlayer(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mName = BleReadable.readString$default(this, 25, null, 2, null);
        this.mNum = readInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchRecordPlayer) == true) goto L8;
        return false;
    L8:
        BleMatchRecordPlayer r6 = (BleMatchRecordPlayer) r5;
        if (Intrinsics.XOO0ii0(this.mName, r6.mName) == true) goto L12;
        return false;
    L12:
        if (this.mNum == r6.mNum) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    public final int getMNum() {
        return this.mNum;
    }

    public int hashCode() {
        return (this.mName.hashCode() * 31) + Integer.hashCode(this.mNum);
    }

    public final void setMName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mName = r2;
    }

    public final void setMNum(int r1) {
        this.mNum = r1;
    }

    @aa1
    public String toString() {
        return "BleMatchRecordPlayer(mName=" + this.mName + ", mNum=" + this.mNum + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchRecordPlayer(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "mName");
        this.mName = r2;
        this.mNum = r3;
    }

    public /* synthetic */ BleMatchRecordPlayer(String r1, int r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0;
    L8:
        this(r1, r2);
    }
}
