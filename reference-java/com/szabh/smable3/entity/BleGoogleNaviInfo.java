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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleGoogleNaviInfo() {
        this(0, 0L, 0, 0, 0, 0, 0, 0, null, 511, null);
    }

    public static /* synthetic */ BleGoogleNaviInfo copy$default(BleGoogleNaviInfo bleGoogleNaviInfo, int i, long j, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = bleGoogleNaviInfo.mState;
        }
        if ((i8 & 2) != 0) {
            j = bleGoogleNaviInfo.mTime;
        }
        if ((i8 & 4) != 0) {
            i2 = bleGoogleNaviInfo.mTurnType;
        }
        if ((i8 & 8) != 0) {
            i3 = bleGoogleNaviInfo.mRemainDistance;
        }
        if ((i8 & 16) != 0) {
            i4 = bleGoogleNaviInfo.mRemainTime;
        }
        if ((i8 & 32) != 0) {
            i5 = bleGoogleNaviInfo.mDistance;
        }
        if ((i8 & 64) != 0) {
            i6 = bleGoogleNaviInfo.mSpeed;
        }
        if ((i8 & 128) != 0) {
            i7 = bleGoogleNaviInfo.mMode;
        }
        if ((i8 & 256) != 0) {
            str = bleGoogleNaviInfo.mRoadName;
        }
        int i9 = i7;
        String str2 = str;
        int i10 = i6;
        int i11 = i4;
        int i12 = i2;
        return bleGoogleNaviInfo.copy(i, j, i12, i3, i11, i5, i10, i9, str2);
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
    public final BleGoogleNaviInfo copy(int i, long j, int i2, int i3, int i4, int i5, int i6, int i7, @aa1 String mRoadName) {
        Intrinsics.X0O(mRoadName, "mRoadName");
        return new BleGoogleNaviInfo(i, j, i2, i3, i4, i5, i6, i7, mRoadName);
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
        byte[] bytes = this.mRoadName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        BleWritable.writeInt16$default(this, Math.min(bytes.length, 232), null, 2, null);
        BleWritable.writeStringWithLimit$default(this, this.mRoadName, 232, null, true, 4, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleGoogleNaviInfo)) {
            return false;
        }
        BleGoogleNaviInfo bleGoogleNaviInfo = (BleGoogleNaviInfo) obj;
        return this.mState == bleGoogleNaviInfo.mState && this.mTime == bleGoogleNaviInfo.mTime && this.mTurnType == bleGoogleNaviInfo.mTurnType && this.mRemainDistance == bleGoogleNaviInfo.mRemainDistance && this.mRemainTime == bleGoogleNaviInfo.mRemainTime && this.mDistance == bleGoogleNaviInfo.mDistance && this.mSpeed == bleGoogleNaviInfo.mSpeed && this.mMode == bleGoogleNaviInfo.mMode && Intrinsics.XOO0ii0(this.mRoadName, bleGoogleNaviInfo.mRoadName);
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] bytes = this.mRoadName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        return Math.min(bytes.length, 232) + 24;
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

    public final void setMDistance(int i) {
        this.mDistance = i;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMRemainDistance(int i) {
        this.mRemainDistance = i;
    }

    public final void setMRemainTime(int i) {
        this.mRemainTime = i;
    }

    public final void setMRoadName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mRoadName = str;
    }

    public final void setMSpeed(int i) {
        this.mSpeed = i;
    }

    public final void setMState(int i) {
        this.mState = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMTurnType(int i) {
        this.mTurnType = i;
    }

    @aa1
    public String toString() {
        return "BleGoogleNaviInfo(mState=" + this.mState + ", mTime=" + this.mTime + ", mTurnType=" + this.mTurnType + ", mRemainDistance=" + this.mRemainDistance + ", mRemainTime=" + this.mRemainTime + ", mDistance=" + this.mDistance + ", mSpeed=" + this.mSpeed + ", mMode=" + this.mMode + ", mRoadName='" + this.mRoadName + "')";
    }

    public BleGoogleNaviInfo(int i, long j, int i2, int i3, int i4, int i5, int i6, int i7, @aa1 String mRoadName) {
        Intrinsics.X0O(mRoadName, "mRoadName");
        this.mState = i;
        this.mTime = j;
        this.mTurnType = i2;
        this.mRemainDistance = i3;
        this.mRemainTime = i4;
        this.mDistance = i5;
        this.mSpeed = i6;
        this.mMode = i7;
        this.mRoadName = mRoadName;
    }

    public /* synthetic */ BleGoogleNaviInfo(int i, long j, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0L : j, (i8 & 4) != 0 ? 0 : i2, (i8 & 8) != 0 ? 0 : i3, (i8 & 16) != 0 ? 0 : i4, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? 0 : i6, (i8 & 128) != 0 ? 0 : i7, (i8 & 256) != 0 ? "" : str);
    }
}
