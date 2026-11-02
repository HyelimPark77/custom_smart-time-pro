package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleOfflineAsrSettings extends BleWritable {
    public static final int AUTH_RESULT_DEVICE_UNAUTHORIZED = 2;
    public static final int AUTH_RESULT_OFFLINE_FAIL = 3;
    public static final int AUTH_RESULT_SERVER_FAIL = 1;
    public static final int AUTH_RESULT_SUCCESS = 0;
    public static final int AUTH_RESULT_TIME_ABNORMAL = 255;

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 10;
    private int mAuthResult;

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

    public BleOfflineAsrSettings() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public static /* synthetic */ BleOfflineAsrSettings copy$default(BleOfflineAsrSettings r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mAuthResult;
    L6:
        return r0.copy(r1);
    }

    public final int component1() {
        return this.mAuthResult;
    }

    @aa1
    public final BleOfflineAsrSettings copy(int r2) {
        return new BleOfflineAsrSettings(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mAuthResult = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mAuthResult);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleOfflineAsrSettings) == true) goto L9;
        return false;
    L9:
        if (this.mAuthResult == ((BleOfflineAsrSettings) r4).mAuthResult) goto L11;
        return false;
    L11:
        return true;
    }

    public final int getMAuthResult() {
        return this.mAuthResult;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 10;
    }

    public int hashCode() {
        return Integer.hashCode(this.mAuthResult);
    }

    public final void setMAuthResult(int r1) {
        this.mAuthResult = r1;
    }

    @aa1
    public String toString() {
        return "BleOfflineAsrSettings(mAuthResult=" + this.mAuthResult + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleOfflineAsrSettings(int r1) {
        this.mAuthResult = r1;
    }

    public /* synthetic */ BleOfflineAsrSettings(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
