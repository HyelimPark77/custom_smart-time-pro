package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BleIPCOTAState extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    public static final int STATE_OTA_DONE = 3;
    public static final int STATE_OTA_FAILED = 4;
    public static final int STATE_OTA_PROGRESS = 2;
    public static final int STATE_OTA_START = 1;
    private int mCode;
    private int mProgress;
    private int mState;

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

    public BleIPCOTAState() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleIPCOTAState copy$default(BleIPCOTAState r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mState;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mProgress;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mCode;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mState;
    }

    public final int component2() {
        return this.mProgress;
    }

    public final int component3() {
        return this.mCode;
    }

    @aa1
    public final BleIPCOTAState copy(int r2, int r3, int r4) {
        return new BleIPCOTAState(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mState = readUInt8();
        this.mProgress = readUInt8();
        this.mCode = readUInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleIPCOTAState) == true) goto L8;
        return false;
    L8:
        BleIPCOTAState r6 = (BleIPCOTAState) r5;
        if (this.mState == r6.mState) goto L12;
        return false;
    L12:
        if (this.mProgress == r6.mProgress) goto L15;
        return false;
    L15:
        if (this.mCode == r6.mCode) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMCode() {
        return this.mCode;
    }

    public final int getMProgress() {
        return this.mProgress;
    }

    public final int getMState() {
        return this.mState;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mState) * 31) + Integer.hashCode(this.mProgress)) * 31) + Integer.hashCode(this.mCode);
    }

    public final void setMCode(int r1) {
        this.mCode = r1;
    }

    public final void setMProgress(int r1) {
        this.mProgress = r1;
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleIPCOTAState(mState=");
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mState)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.append(r2);
        r0.append(", mProgress=");
        r0.append(this.mProgress);
        r0.append(", mCode=");
        String r3 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mCode)}, 1));
        Intrinsics.O10IXXX0X(r3, "format(...)");
        r0.append(r3);
        r0.append(HexStringBuilder.COMMENT_END_CHAR);
        return r0.toString();
    }

    public BleIPCOTAState(int r1, int r2, int r3) {
        this.mState = r1;
        this.mProgress = r2;
        this.mCode = r3;
    }

    public /* synthetic */ BleIPCOTAState(int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
