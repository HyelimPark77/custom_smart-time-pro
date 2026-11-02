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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleIPCState() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleIPCState copy$default(BleIPCState r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mState;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mOpenMode;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mOpenPurposes;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final BleIPCState copy(int r2, int r3, int r4) {
        return new BleIPCState(r2, r3, r4);
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

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleIPCState) == true) goto L8;
        return false;
    L8:
        BleIPCState r6 = (BleIPCState) r5;
        if (this.mState == r6.mState) goto L12;
        return false;
    L12:
        if (this.mOpenMode == r6.mOpenMode) goto L15;
        return false;
    L15:
        if (this.mOpenPurposes == r6.mOpenPurposes) goto L17;
        return false;
    L17:
        return true;
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

    public final void setMOpenMode(int r1) {
        this.mOpenMode = r1;
    }

    public final void setMOpenPurposes(int r1) {
        this.mOpenPurposes = r1;
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleIPCState(mState=");
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mState)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.append(r2);
        r0.append(", mOpenMode=");
        r0.append(this.mOpenMode);
        r0.append(", mOpenPurposes=");
        r0.append(this.mOpenPurposes);
        r0.append(HexStringBuilder.COMMENT_END_CHAR);
        return r0.toString();
    }

    public BleIPCState(int r1, int r2, int r3) {
        this.mState = r1;
        this.mOpenMode = r2;
        this.mOpenPurposes = r3;
    }

    public /* synthetic */ BleIPCState(int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
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
