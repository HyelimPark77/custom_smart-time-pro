package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMatchPlayer extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 28;
    public static final int NAME_LENGTH = 25;
    private int hasYellowCard;
    private int isCaptain;

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

    public BleMatchPlayer() {
        String r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleMatchPlayer copy$default(BleMatchPlayer r0, String r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mName;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mNum;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.hasYellowCard;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.isCaptain;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    @aa1
    public final String component1() {
        return this.mName;
    }

    public final int component2() {
        return this.mNum;
    }

    public final int component3() {
        return this.hasYellowCard;
    }

    public final int component4() {
        return this.isCaptain;
    }

    @aa1
    public final BleMatchPlayer copy(@aa1 String r2, int r3, int r4, int r5) {
        Intrinsics.X0O(r2, "mName");
        return new BleMatchPlayer(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeStringWithFix$default(this, this.mName, 25, null, 4, null);
        writeInt8(this.mNum);
        writeInt8(this.hasYellowCard);
        writeInt8(this.isCaptain);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchPlayer) == true) goto L8;
        return false;
    L8:
        BleMatchPlayer r6 = (BleMatchPlayer) r5;
        if (Intrinsics.XOO0ii0(this.mName, r6.mName) == true) goto L12;
        return false;
    L12:
        if (this.mNum == r6.mNum) goto L15;
        return false;
    L15:
        if (this.hasYellowCard == r6.hasYellowCard) goto L18;
        return false;
    L18:
        if (this.isCaptain == r6.isCaptain) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getHasYellowCard() {
        return this.hasYellowCard;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 28;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    public final int getMNum() {
        return this.mNum;
    }

    public int hashCode() {
        return (((((this.mName.hashCode() * 31) + Integer.hashCode(this.mNum)) * 31) + Integer.hashCode(this.hasYellowCard)) * 31) + Integer.hashCode(this.isCaptain);
    }

    public final int isCaptain() {
        return this.isCaptain;
    }

    public final void setCaptain(int r1) {
        this.isCaptain = r1;
    }

    public final void setHasYellowCard(int r1) {
        this.hasYellowCard = r1;
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
        return "BleMatchPlayer(mName=" + this.mName + ", mNum=" + this.mNum + ", hasYellowCard=" + this.hasYellowCard + ", isCaptain=" + this.isCaptain + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchPlayer(@aa1 String r2, int r3, int r4, int r5) {
        Intrinsics.X0O(r2, "mName");
        this.mName = r2;
        this.mNum = r3;
        this.hasYellowCard = r4;
        this.isCaptain = r5;
    }

    public /* synthetic */ BleMatchPlayer(String r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
