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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleAppFile() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ BleAppFile copy$default(BleAppFile bleAppFile, String str, int i, byte[] bArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bleAppFile.mPackage;
        }
        if ((i2 & 2) != 0) {
            i = bleAppFile.mOpType;
        }
        if ((i2 & 4) != 0) {
            bArr = bleAppFile.mDatas;
        }
        return bleAppFile.copy(str, i, bArr);
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
    public final BleAppFile copy(@aa1 String mPackage, int i, @aa1 byte[] mDatas) {
        Intrinsics.X0O(mPackage, "mPackage");
        Intrinsics.X0O(mDatas, "mDatas");
        return new BleAppFile(mPackage, i, mDatas);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeStringWithFix$default(this, this.mPackage, 24, null, 4, null);
        writeInt8(this.mOpType);
        BleWritable.writeBytes$default(this, new byte[7], null, 2, null);
        BleWritable.writeBytes$default(this, this.mDatas, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAppFile)) {
            return false;
        }
        BleAppFile bleAppFile = (BleAppFile) obj;
        return Intrinsics.XOO0ii0(this.mPackage, bleAppFile.mPackage) && this.mOpType == bleAppFile.mOpType && Intrinsics.XOO0ii0(this.mDatas, bleAppFile.mDatas);
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

    public final void setMDatas(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mDatas = bArr;
    }

    public final void setMOpType(int i) {
        this.mOpType = i;
    }

    public final void setMPackage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPackage = str;
    }

    @aa1
    public String toString() {
        return "BleAppFile(mPackage=" + this.mPackage + ", mOpType=" + this.mOpType + ", mDatas=" + this.mDatas.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAppFile(@aa1 String mPackage, int i, @aa1 byte[] mDatas) {
        Intrinsics.X0O(mPackage, "mPackage");
        Intrinsics.X0O(mDatas, "mDatas");
        this.mPackage = mPackage;
        this.mOpType = i;
        this.mDatas = mDatas;
    }

    public /* synthetic */ BleAppFile(String str, int i, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new byte[51200] : bArr);
    }
}
