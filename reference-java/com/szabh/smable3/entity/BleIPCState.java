package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BleIPCState extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    public static final int OPEN_MODE_AP = 0;
    public static final int OPEN_MODE_P2P = 1;
    public static final int OPEN_MODE_STA = 2;
    public static final int OPEN_PURPOSES_ALIPAY = 5;
    public static final int OPEN_PURPOSES_EXPORT = 1;
    public static final int OPEN_PURPOSES_OTA = 2;
    public static final int OPEN_PURPOSES_PREVIEW_LAND = 3;
    public static final int OPEN_PURPOSES_PREVIEW_PORT = 4;
    public static final int STATE_IPC_CLOSE = 0;
    public static final int STATE_IPC_EXPORT_DONE = 4;
    public static final int STATE_IPC_EXPORT_HEARTBEATS = 16;
    public static final int STATE_IPC_OPEN = 1;
    public static final int STATE_IPC_OTA_HEARTBEATS = 17;
    private int mOpenMode;
    private int mOpenPurposes;
    private int mState;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleIPCState() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ BleIPCState copy$default(BleIPCState bleIPCState, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleIPCState.mState;
        }
        if ((i4 & 2) != 0) {
            i2 = bleIPCState.mOpenMode;
        }
        if ((i4 & 4) != 0) {
            i3 = bleIPCState.mOpenPurposes;
        }
        return bleIPCState.copy(i, i2, i3);
    }

    public final int component1() {
        return this.mState;
    }

    public final int component2() {
        return this.mOpenMode;
    }

    public final int component3() {
        return this.mOpenPurposes;
    }

    @aa1
    public final BleIPCState copy(int i, int i2, int i3) {
        return new BleIPCState(i, i2, i3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mState = readInt8();
        this.mOpenMode = readInt8();
        this.mOpenPurposes = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mState);
        writeInt8(this.mOpenMode);
        writeInt8(this.mOpenPurposes);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleIPCState)) {
            return false;
        }
        BleIPCState bleIPCState = (BleIPCState) obj;
        return this.mState == bleIPCState.mState && this.mOpenMode == bleIPCState.mOpenMode && this.mOpenPurposes == bleIPCState.mOpenPurposes;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public final int getMOpenMode() {
        return this.mOpenMode;
    }

    public final int getMOpenPurposes() {
        return this.mOpenPurposes;
    }

    public final int getMState() {
        return this.mState;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mState) * 31) + Integer.hashCode(this.mOpenMode)) * 31) + Integer.hashCode(this.mOpenPurposes);
    }

    public final void setMOpenMode(int i) {
        this.mOpenMode = i;
    }

    public final void setMOpenPurposes(int i) {
        this.mOpenPurposes = i;
    }

    public final void setMState(int i) {
        this.mState = i;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleIPCState(mState=");
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mState)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        sb.append(str);
        sb.append(", mOpenMode=");
        sb.append(this.mOpenMode);
        sb.append(", mOpenPurposes=");
        sb.append(this.mOpenPurposes);
        sb.append(HexStringBuilder.COMMENT_END_CHAR);
        return sb.toString();
    }

    public BleIPCState(int i, int i2, int i3) {
        this.mState = i;
        this.mOpenMode = i2;
        this.mOpenPurposes = i3;
    }

    public /* synthetic */ BleIPCState(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
