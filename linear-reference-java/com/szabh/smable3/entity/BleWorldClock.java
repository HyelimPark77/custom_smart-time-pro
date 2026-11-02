package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWorldClock extends BleIdObject {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 68;
    private static final int NAME_MAX_LENGTH = 62;
    private int isLocal;

    @aa1
    private String mCityName;
    private int mTimeZoneOffset;
    private int reversed;

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

    public BleWorldClock() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleWorldClock copy$default(BleWorldClock r0, int r1, int r2, int r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.isLocal;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mTimeZoneOffset;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.reversed;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mCityName;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.isLocal;
    }

    public final int component2() {
        return this.mTimeZoneOffset;
    }

    public final int component3() {
        return this.reversed;
    }

    @aa1
    public final String component4() {
        return this.mCityName;
    }

    @aa1
    public final BleWorldClock copy(int r2, int r3, int r4, @aa1 String r5) {
        Intrinsics.X0O(r5, "mCityName");
        return new BleWorldClock(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.isLocal = readIntN(1);
        setMId(readIntN(7));
        this.mTimeZoneOffset = readInt8();
        this.reversed = BleReadable.readInt16$default(this, null, 1, null);
        this.mCityName = readString(62, Charsets.O00);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeIntN(this.isLocal, 1);
        writeIntN(getMId(), 7);
        writeInt8(this.mTimeZoneOffset);
        BleWritable.writeInt16$default(this, this.reversed, null, 2, null);
        writeStringWithFix(this.mCityName, 62, Charsets.O00);
        BleWritable.writeInt16$default(this, 0, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWorldClock) == true) goto L8;
        return false;
    L8:
        BleWorldClock r6 = (BleWorldClock) r5;
        if (this.isLocal == r6.isLocal) goto L12;
        return false;
    L12:
        if (this.mTimeZoneOffset == r6.mTimeZoneOffset) goto L15;
        return false;
    L15:
        if (this.reversed == r6.reversed) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mCityName, r6.mCityName) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final String getMCityName() {
        return this.mCityName;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 68;
    }

    public final int getMTimeZoneOffset() {
        return this.mTimeZoneOffset;
    }

    public final int getReversed() {
        return this.reversed;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.isLocal) * 31) + Integer.hashCode(this.mTimeZoneOffset)) * 31) + Integer.hashCode(this.reversed)) * 31) + this.mCityName.hashCode();
    }

    public final int isLocal() {
        return this.isLocal;
    }

    public final void setLocal(int r1) {
        this.isLocal = r1;
    }

    public final void setMCityName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCityName = r2;
    }

    public final void setMTimeZoneOffset(int r1) {
        this.mTimeZoneOffset = r1;
    }

    public final void setReversed(int r1) {
        this.reversed = r1;
    }

    @aa1
    public String toString() {
        return "BleWorldClock(mId=" + getMId() + ", isLocal=" + this.isLocal + ", mTimeZoneOffset=" + this.mTimeZoneOffset + ", mCityName='" + this.mCityName + "')";
    }

    public BleWorldClock(int r2, int r3, int r4, @aa1 String r5) {
        Intrinsics.X0O(r5, "mCityName");
        this.isLocal = r2;
        this.mTimeZoneOffset = r3;
        this.reversed = r4;
        this.mCityName = r5;
    }

    public /* synthetic */ BleWorldClock(int r2, int r3, int r4, String r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
