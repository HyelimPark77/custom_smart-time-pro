package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleECGRealtime extends BleReadable {
    private int mCount;
    private int mDeviceState;

    @aa1
    private List<Double> mECGData;
    private int mECGType;
    private int mHeartRate;
    private int mState;
    private int mTime;

    public BleECGRealtime() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        List r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleECGRealtime copy$default(BleECGRealtime r0, int r1, int r2, int r3, int r4, int r5, int r6, List r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mState;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mCount;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mHeartRate;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mECGType;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mDeviceState;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mECGData;
    L23:
        int r10 = r6;
        List r11 = r7;
        int r12 = r4;
        int r13 = r5;
        int r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mState;
    }

    public final int component3() {
        return this.mCount;
    }

    public final int component4() {
        return this.mHeartRate;
    }

    public final int component5() {
        return this.mECGType;
    }

    public final int component6() {
        return this.mDeviceState;
    }

    @aa1
    public final List<Double> component7() {
        return this.mECGData;
    }

    @aa1
    public final BleECGRealtime copy(int r10, int r11, int r12, int r13, int r14, int r15, @aa1 List<Double> r16) {
        Intrinsics.X0O(r16, "mECGData");
        return new BleECGRealtime(r10, r11, r12, r13, r14, r15, r16);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mCount = BleReadable.readUInt16$default(this, null, 1, null);
        this.mHeartRate = readUInt8();
        this.mECGType = readUInt8();
        this.mDeviceState = readUInt8();
        int r2 = this.mCount;
        if (r2 < 0) goto L8;
        int r3 = 0;
    L5:
        double r4 = BleReadable.readDouble$default(this, null, 1, null);
        this.mECGData.add(Double.valueOf(r4));
        if (r3 == r2) goto L10;
        r3 = r3 + 1;
        goto L5
    L10:
        return;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleECGRealtime) == true) goto L8;
        return false;
    L8:
        BleECGRealtime r6 = (BleECGRealtime) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (this.mState == r6.mState) goto L15;
        return false;
    L15:
        if (this.mCount == r6.mCount) goto L18;
        return false;
    L18:
        if (this.mHeartRate == r6.mHeartRate) goto L21;
        return false;
    L21:
        if (this.mECGType == r6.mECGType) goto L24;
        return false;
    L24:
        if (this.mDeviceState == r6.mDeviceState) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mECGData, r6.mECGData) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final int getMCount() {
        return this.mCount;
    }

    public final int getMDeviceState() {
        return this.mDeviceState;
    }

    @aa1
    public final List<Double> getMECGData() {
        return this.mECGData;
    }

    public final int getMECGType() {
        return this.mECGType;
    }

    public final int getMHeartRate() {
        return this.mHeartRate;
    }

    public final int getMState() {
        return this.mState;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mState)) * 31) + Integer.hashCode(this.mCount)) * 31) + Integer.hashCode(this.mHeartRate)) * 31) + Integer.hashCode(this.mECGType)) * 31) + Integer.hashCode(this.mDeviceState)) * 31) + this.mECGData.hashCode();
    }

    public final void setMCount(int r1) {
        this.mCount = r1;
    }

    public final void setMDeviceState(int r1) {
        this.mDeviceState = r1;
    }

    public final void setMECGData(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mECGData = r2;
    }

    public final void setMECGType(int r1) {
        this.mECGType = r1;
    }

    public final void setMHeartRate(int r1) {
        this.mHeartRate = r1;
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BleECGRealtime(mTime=" + this.mTime + ", mState=" + this.mState + ", mCount=" + this.mCount + ", mHeartRate=" + this.mHeartRate + ", mECGType=" + this.mECGType + ", mDeviceState=" + this.mDeviceState + ", mECGData=" + this.mECGData + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleECGRealtime(int r2, int r3, int r4, int r5, int r6, int r7, @aa1 List<Double> r8) {
        Intrinsics.X0O(r8, "mECGData");
        this.mTime = r2;
        this.mState = r3;
        this.mCount = r4;
        this.mHeartRate = r5;
        this.mECGType = r6;
        this.mDeviceState = r7;
        this.mECGData = r8;
    }

    public /* synthetic */ BleECGRealtime(int r2, int r3, int r4, int r5, int r6, int r7, List r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = new ArrayList();
    L23:
        List r11 = r8;
        int r12 = r7;
        int r13 = r6;
        int r14 = r5;
        int r15 = r4;
        this(r2, r3, r15, r14, r13, r12, r11);
    }
}
