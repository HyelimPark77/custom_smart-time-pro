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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 10;
    private int mAuthResult;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleOfflineAsrSettings() {
        this(0, 1, null);
    }

    public static /* synthetic */ BleOfflineAsrSettings copy$default(BleOfflineAsrSettings bleOfflineAsrSettings, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleOfflineAsrSettings.mAuthResult;
        }
        return bleOfflineAsrSettings.copy(i);
    }

    public final int component1() {
        return this.mAuthResult;
    }

    @aa1
    public final BleOfflineAsrSettings copy(int i) {
        return new BleOfflineAsrSettings(i);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleOfflineAsrSettings) && this.mAuthResult == ((BleOfflineAsrSettings) obj).mAuthResult;
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

    public final void setMAuthResult(int i) {
        this.mAuthResult = i;
    }

    @aa1
    public String toString() {
        return "BleOfflineAsrSettings(mAuthResult=" + this.mAuthResult + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleOfflineAsrSettings(int i) {
        this.mAuthResult = i;
    }

    public /* synthetic */ BleOfflineAsrSettings(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
