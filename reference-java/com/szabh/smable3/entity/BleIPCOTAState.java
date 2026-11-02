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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    public static final int STATE_OTA_DONE = 3;
    public static final int STATE_OTA_FAILED = 4;
    public static final int STATE_OTA_PROGRESS = 2;
    public static final int STATE_OTA_START = 1;
    private int mCode;
    private int mProgress;
    private int mState;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleIPCOTAState() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ BleIPCOTAState copy$default(BleIPCOTAState bleIPCOTAState, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleIPCOTAState.mState;
        }
        if ((i4 & 2) != 0) {
            i2 = bleIPCOTAState.mProgress;
        }
        if ((i4 & 4) != 0) {
            i3 = bleIPCOTAState.mCode;
        }
        return bleIPCOTAState.copy(i, i2, i3);
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
    public final BleIPCOTAState copy(int i, int i2, int i3) {
        return new BleIPCOTAState(i, i2, i3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mState = readUInt8();
        this.mProgress = readUInt8();
        this.mCode = readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleIPCOTAState)) {
            return false;
        }
        BleIPCOTAState bleIPCOTAState = (BleIPCOTAState) obj;
        return this.mState == bleIPCOTAState.mState && this.mProgress == bleIPCOTAState.mProgress && this.mCode == bleIPCOTAState.mCode;
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

    public final void setMCode(int i) {
        this.mCode = i;
    }

    public final void setMProgress(int i) {
        this.mProgress = i;
    }

    public final void setMState(int i) {
        this.mState = i;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleIPCOTAState(mState=");
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mState)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        sb.append(str);
        sb.append(", mProgress=");
        sb.append(this.mProgress);
        sb.append(", mCode=");
        String str2 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mCode)}, 1));
        Intrinsics.O10IXXX0X(str2, "format(...)");
        sb.append(str2);
        sb.append(HexStringBuilder.COMMENT_END_CHAR);
        return sb.toString();
    }

    public BleIPCOTAState(int i, int i2, int i3) {
        this.mState = i;
        this.mProgress = i2;
        this.mCode = i3;
    }

    public /* synthetic */ BleIPCOTAState(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
