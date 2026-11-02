package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleBWNaviInfo extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int DISTANCE_MAX_LENGTH = 32;
    public static final int NAVI_END = 4;
    public static final int NAVI_GOING = 1;
    public static final int NAVI_GUIDE_END = 5;
    public static final int NAVI_MODE_BIKE = 1;
    public static final int NAVI_MODE_WALK = 0;
    public static final int NAVI_PAUSE = 2;
    public static final int NAVI_RESUME = 3;
    public static final int NAVI_START = 0;
    public static final int ROAD_MAX_LENGTH = 164;
    public static final int TIME_MAX_LENGTH = 32;
    private int mAltitude;
    private int mMode;

    @aa1
    private String mRemainDistance;

    @aa1
    private String mRemainTime;

    @aa1
    private String mRoadGuide;
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

    public BleBWNaviInfo() {
        int r1 = 0;
        long r2 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, 511, null);
    }

    public static /* synthetic */ BleBWNaviInfo copy$default(BleBWNaviInfo r0, int r1, long r2, int r4, int r5, int r6, int r7, String r8, String r9, String r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.mState;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = r0.mMode;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = r0.mSpeed;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = r0.mAltitude;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = r0.mTurnType;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = r0.mRemainTime;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = r0.mRemainDistance;
    L27:
        if ((r11 & 256) == 0) goto L29;
        r10 = r0.mRoadGuide;
    L29:
        String r13 = r9;
        String r14 = r10;
        int r15 = r7;
        String r16 = r8;
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
        return this.mMode;
    }

    public final int component4() {
        return this.mSpeed;
    }

    public final int component5() {
        return this.mAltitude;
    }

    public final int component6() {
        return this.mTurnType;
    }

    @aa1
    public final String component7() {
        return this.mRemainTime;
    }

    @aa1
    public final String component8() {
        return this.mRemainDistance;
    }

    @aa1
    public final String component9() {
        return this.mRoadGuide;
    }

    @aa1
    public final BleBWNaviInfo copy(int r13, long r14, int r16, int r17, int r18, int r19, @aa1 String r20, @aa1 String r21, @aa1 String r22) {
        Intrinsics.X0O(r20, "mRemainTime");
        Intrinsics.X0O(r21, "mRemainDistance");
        Intrinsics.X0O(r22, "mRoadGuide");
        return new BleBWNaviInfo(r13, r14, r16, r17, r18, r19, r20, r21, r22);
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
        writeInt8(this.mMode);
        BleWritable.writeInt32$default(this, this.mSpeed, null, 2, null);
        BleWritable.writeInt32$default(this, this.mAltitude, null, 2, null);
        BleWritable.writeLong$default(this, 0, null, 2, null);
        writeInt8(this.mTurnType);
        String r1 = this.mRemainTime;
        Charset r2 = Charsets.XIi00iiXO;
        byte[] r3 = r1.getBytes(r2);
        Intrinsics.O10IXXX0X(r3, "getBytes(...)");
        writeInt8(Math.min(r3.length, 32));
        byte[] r4 = this.mRemainDistance.getBytes(r2);
        Intrinsics.O10IXXX0X(r4, "getBytes(...)");
        writeInt8(Math.min(r4.length, 32));
        byte[] r5 = this.mRoadGuide.getBytes(r2);
        Intrinsics.O10IXXX0X(r5, "getBytes(...)");
        writeInt8(Math.min(r5.length, 164));
        BleWritable.writeStringWithFix$default(this, this.mRemainTime, 32, null, 4, null);
        BleWritable.writeStringWithFix$default(this, this.mRemainDistance, 32, null, 4, null);
        BleWritable.writeStringWithLimit$default(this, this.mRoadGuide, 164, null, true, 4, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleBWNaviInfo) == true) goto L8;
        return false;
    L8:
        BleBWNaviInfo r9 = (BleBWNaviInfo) r8;
        if (this.mState == r9.mState) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (this.mMode == r9.mMode) goto L18;
        return false;
    L18:
        if (this.mSpeed == r9.mSpeed) goto L21;
        return false;
    L21:
        if (this.mAltitude == r9.mAltitude) goto L24;
        return false;
    L24:
        if (this.mTurnType == r9.mTurnType) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mRemainTime, r9.mRemainTime) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mRemainDistance, r9.mRemainDistance) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mRoadGuide, r9.mRoadGuide) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] r0 = this.mRoadGuide.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return Math.min(r0.length, 164) + 92;
    }

    public final int getMMode() {
        return this.mMode;
    }

    @aa1
    public final String getMRemainDistance() {
        return this.mRemainDistance;
    }

    @aa1
    public final String getMRemainTime() {
        return this.mRemainTime;
    }

    @aa1
    public final String getMRoadGuide() {
        return this.mRoadGuide;
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
        return (((((((((((((((Integer.hashCode(this.mState) * 31) + Long.hashCode(this.mTime)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mTurnType)) * 31) + this.mRemainTime.hashCode()) * 31) + this.mRemainDistance.hashCode()) * 31) + this.mRoadGuide.hashCode();
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMRemainDistance(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRemainDistance = r2;
    }

    public final void setMRemainTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRemainTime = r2;
    }

    public final void setMRoadGuide(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRoadGuide = r2;
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
        return "BleBWNaviInfo(mState=" + this.mState + ", mTime=" + this.mTime + ", mMode=" + this.mMode + ", mSpeed=" + this.mSpeed + ", mAltitude=" + this.mAltitude + ", mTurnType=" + this.mTurnType + ", mRemainDistance='" + this.mRemainDistance + "', mRemainTime='" + this.mRemainTime + "', mRoadGuide='" + this.mRoadGuide + "')";
    }

    public BleBWNaviInfo(int r2, long r3, int r5, int r6, int r7, int r8, @aa1 String r9, @aa1 String r10, @aa1 String r11) {
        Intrinsics.X0O(r9, "mRemainTime");
        Intrinsics.X0O(r10, "mRemainDistance");
        Intrinsics.X0O(r11, "mRoadGuide");
        this.mState = r2;
        this.mTime = r3;
        this.mMode = r5;
        this.mSpeed = r6;
        this.mAltitude = r7;
        this.mTurnType = r8;
        this.mRemainTime = r9;
        this.mRemainDistance = r10;
        this.mRoadGuide = r11;
    }

    public /* synthetic */ BleBWNaviInfo(int r2, long r3, int r5, int r6, int r7, int r8, String r9, String r10, String r11, int r12, DefaultConstructorMarker r13) {
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
        r9 = "";
    L24:
        if ((r12 & 128) == 0) goto L27;
        r10 = "";
    L27:
        if ((r12 & 256) == 0) goto L30;
        String r14 = "";
    L29:
        String r15 = r10;
        String r16 = r9;
        int r17 = r8;
        int r18 = r7;
        this(r2, r3, r5, r6, r18, r17, r16, r15, r14);
        return;
    L30:
        r14 = r11;
        goto L29
    }
}
