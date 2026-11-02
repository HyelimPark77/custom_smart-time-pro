package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSettingWatchPassword extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 5;
    private static final int PWD_LENGTH = 4;
    private int mEnabled;

    @aa1
    private String mPassword;

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

    /* JADX WARN: Multi-variable type inference failed */
    public BleSettingWatchPassword() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleSettingWatchPassword copy$default(BleSettingWatchPassword r0, int r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mPassword;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mEnabled;
    }

    @aa1
    public final String component2() {
        return this.mPassword;
    }

    @aa1
    public final BleSettingWatchPassword copy(int r2, @aa1 String r3) {
        Intrinsics.X0O(r3, "mPassword");
        return new BleSettingWatchPassword(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mEnabled = readUInt8();
        this.mPassword = BleReadable.readString$default(this, 4, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        BleWritable.writeStringWithFix$default(this, this.mPassword, 4, null, 4, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSettingWatchPassword) == true) goto L8;
        return false;
    L8:
        BleSettingWatchPassword r6 = (BleSettingWatchPassword) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mPassword, r6.mPassword) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 5;
    }

    @aa1
    public final String getMPassword() {
        return this.mPassword;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mEnabled) * 31) + this.mPassword.hashCode();
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    public final void setMPassword(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPassword = r2;
    }

    @aa1
    public String toString() {
        return "BleSettingWatchPassword(mEnabled=" + this.mEnabled + ", mPassword='" + this.mPassword + "')";
    }

    public BleSettingWatchPassword(int r2, @aa1 String r3) {
        Intrinsics.X0O(r3, "mPassword");
        this.mEnabled = r2;
        this.mPassword = r3;
    }

    public /* synthetic */ BleSettingWatchPassword(int r1, String r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
