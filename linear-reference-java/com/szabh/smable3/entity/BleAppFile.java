package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAppFile extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int OP_TYPE_INSTALL = 0;
    public static final int OP_TYPE_UPDATE = 1;
    public static final int TYPE_APP = 0;
    public static final int TYPE_AUDIO_BOOK = 3;
    public static final int TYPE_BUILTIN = 2;
    public static final int TYPE_GAME = 1;
    public static final int TYPE_QURAN_AUDIO = 6;
    public static final int TYPE_QURAN_TEXT = 5;
    public static final int TYPE_SACRAL_PUNISHMENT = 7;
    public static final int TYPE_STUDY_CARDS = 4;

    @aa1
    private byte[] mDatas;
    private int mOpType;

    @aa1
    private String mPackage;

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

    public BleAppFile() {
        String r1 = null;
        int r2 = 0;
        byte[] r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleAppFile copy$default(BleAppFile r0, String r1, int r2, byte[] r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mPackage;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mOpType;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mDatas;
    L12:
        return r0.copy(r1, r2, r3);
    }

    @aa1
    public final String component1() {
        return this.mPackage;
    }

    public final int component2() {
        return this.mOpType;
    }

    @aa1
    public final byte[] component3() {
        return this.mDatas;
    }

    @aa1
    public final BleAppFile copy(@aa1 String r2, int r3, @aa1 byte[] r4) {
        Intrinsics.X0O(r2, "mPackage");
        Intrinsics.X0O(r4, "mDatas");
        return new BleAppFile(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeStringWithFix$default(this, this.mPackage, 24, null, 4, null);
        writeInt8(this.mOpType);
        BleWritable.writeBytes$default(this, new byte[7], null, 2, null);
        BleWritable.writeBytes$default(this, this.mDatas, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAppFile) == true) goto L8;
        return false;
    L8:
        BleAppFile r6 = (BleAppFile) r5;
        if (Intrinsics.XOO0ii0(this.mPackage, r6.mPackage) == true) goto L12;
        return false;
    L12:
        if (this.mOpType == r6.mOpType) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mDatas, r6.mDatas) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final byte[] getMDatas() {
        return this.mDatas;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mDatas.length + 32;
    }

    public final int getMOpType() {
        return this.mOpType;
    }

    @aa1
    public final String getMPackage() {
        return this.mPackage;
    }

    public int hashCode() {
        return (((this.mPackage.hashCode() * 31) + Integer.hashCode(this.mOpType)) * 31) + Arrays.hashCode(this.mDatas);
    }

    public final void setMDatas(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDatas = r2;
    }

    public final void setMOpType(int r1) {
        this.mOpType = r1;
    }

    public final void setMPackage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPackage = r2;
    }

    @aa1
    public String toString() {
        return "BleAppFile(mPackage=" + this.mPackage + ", mOpType=" + this.mOpType + ", mDatas=" + this.mDatas.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAppFile(@aa1 String r2, int r3, @aa1 byte[] r4) {
        Intrinsics.X0O(r2, "mPackage");
        Intrinsics.X0O(r4, "mDatas");
        this.mPackage = r2;
        this.mOpType = r3;
        this.mDatas = r4;
    }

    public /* synthetic */ BleAppFile(String r1, int r2, byte[] r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = 0;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = new byte[51200];
    L11:
        this(r1, r2, r3);
    }
}
