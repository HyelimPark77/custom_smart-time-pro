package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGoogleNaviInfo extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int NAME_MAX_LENGTH = 232;
    public static final int NAVI_END = 4;
    public static final int NAVI_GOING = 1;
    public static final int NAVI_PAUSE = 2;
    public static final int NAVI_RESUME = 3;
    public static final int NAVI_START = 0;
    private int mDistance;
    private int mMode;
    private int mRemainDistance;
    private int mRemainTime;

    @aa1
    private String mRoadName;
    private int mSpeed;
    private int mState;
    private long mTime;
    private int mTurnType;

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

    public BleGoogleNaviInfo() {
        int r1 = 0;
        long r2 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        String r10 = null;
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, 511, null);
    }

    public static /* synthetic */ BleGoogleNaviInfo copy$default(BleGoogleNaviInfo r0, int r1, long r2, int r4, int r5, int r6, int r7, int r8, int r9, String r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.mState;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = r0.mTurnType;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = r0.mRemainDistance;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = r0.mRemainTime;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = r0.mDistance;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = r0.mSpeed;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = r0.mMode;
    L27:
        if ((r11 & 256) == 0) goto L29;
        r10 = r0.mRoadName;
    L29:
        int r13 = r9;
        String r14 = r10;
        int r15 = r7;
        int r16 = r8;
        int r17 = r6;
        int r18 = r4;
        long r19 = r2;
        int r3 = r1;
        return r0.copy(r3, r19, r18, r5, r17, r15, r16, r13, r14);
    }

    public final int component1() {
        return this.mState;
    }

    public final long component2() {
        return this.mTime;
    }

    public final int component3() {
        return this.mTurnType;
    }

    public final int component4() {
        return this.mRemainDistance;
    }

    public final int component5() {
        return this.mRemainTime;
    }

    public final int component6() {
        return this.mDistance;
    }

    public final int component7() {
        return this.mSpeed;
    }

    public final int component8() {
        return this.mMode;
    }

    @aa1
    public final String component9() {
        return this.mRoadName;
    }

    @aa1
    public final BleGoogleNaviInfo copy(int r13, long r14, int r16, int r17, int r18, int r19, int r20, int r21, @aa1 String r22) {
        Intrinsics.X0O(r22, "mRoadName");
        return new BleGoogleNaviInfo(r13, r14, r16, r17, r18, r19, r20, r21, r22);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mState = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mState);
        writeObject(BleTime.Companion.ofLocal(this.mTime));
        writeInt8(this.mTurnType);
        BleWritable.writeInt32$default(this, this.mRemainDistance, null, 2, null);
        BleWritable.writeInt32$default(this, this.mRemainTime, null, 2, null);
        BleWritable.writeInt32$default(this, this.mDistance, null, 2, null);
        writeInt8(this.mSpeed);
        writeInt8(this.mMode);
        byte[] r0 = this.mRoadName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        BleWritable.writeInt16$default(this, Math.min(r0.length, 232), null, 2, null);
        BleWritable.writeStringWithLimit$default(this, this.mRoadName, 232, null, true, 4, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleGoogleNaviInfo) == true) goto L8;
        return false;
    L8:
        BleGoogleNaviInfo r9 = (BleGoogleNaviInfo) r8;
        if (this.mState == r9.mState) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (this.mTurnType == r9.mTurnType) goto L18;
        return false;
    L18:
        if (this.mRemainDistance == r9.mRemainDistance) goto L21;
        return false;
    L21:
        if (this.mRemainTime == r9.mRemainTime) goto L24;
        return false;
    L24:
        if (this.mDistance == r9.mDistance) goto L27;
        return false;
    L27:
        if (this.mSpeed == r9.mSpeed) goto L30;
        return false;
    L30:
        if (this.mMode == r9.mMode) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mRoadName, r9.mRoadName) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] r0 = this.mRoadName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return Math.min(r0.length, 232) + 24;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMRemainDistance() {
        return this.mRemainDistance;
    }

    public final int getMRemainTime() {
        return this.mRemainTime;
    }

    @aa1
    public final String getMRoadName() {
        return this.mRoadName;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getMState() {
        return this.mState;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final int getMTurnType() {
        return this.mTurnType;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.mState) * 31) + Long.hashCode(this.mTime)) * 31) + Integer.hashCode(this.mTurnType)) * 31) + Integer.hashCode(this.mRemainDistance)) * 31) + Integer.hashCode(this.mRemainTime)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mMode)) * 31) + this.mRoadName.hashCode();
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMRemainDistance(int r1) {
        this.mRemainDistance = r1;
    }

    public final void setMRemainTime(int r1) {
        this.mRemainTime = r1;
    }

    public final void setMRoadName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRoadName = r2;
    }

    public final void setMSpeed(int r1) {
        this.mSpeed = r1;
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMTurnType(int r1) {
        this.mTurnType = r1;
    }

    @aa1
    public String toString() {
        return "BleGoogleNaviInfo(mState=" + this.mState + ", mTime=" + this.mTime + ", mTurnType=" + this.mTurnType + ", mRemainDistance=" + this.mRemainDistance + ", mRemainTime=" + this.mRemainTime + ", mDistance=" + this.mDistance + ", mSpeed=" + this.mSpeed + ", mMode=" + this.mMode + ", mRoadName='" + this.mRoadName + "')";
    }

    public BleGoogleNaviInfo(int r2, long r3, int r5, int r6, int r7, int r8, int r9, int r10, @aa1 String r11) {
        Intrinsics.X0O(r11, "mRoadName");
        this.mState = r2;
        this.mTime = r3;
        this.mTurnType = r5;
        this.mRemainDistance = r6;
        this.mRemainTime = r7;
        this.mDistance = r8;
        this.mSpeed = r9;
        this.mMode = r10;
        this.mRoadName = r11;
    }

    public /* synthetic */ BleGoogleNaviInfo(int r2, long r3, int r5, int r6, int r7, int r8, int r9, int r10, String r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = 0;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r10 = 0;
    L27:
        if ((r12 & 256) == 0) goto L29;
        r11 = "";
    L29:
        String r14 = r11;
        int r15 = r10;
        int r16 = r9;
        int r17 = r8;
        int r18 = r7;
        long r4 = r3;
        int r19 = r2;
        this(r19, r4, r5, r6, r18, r17, r16, r15, r14);
    }
}
