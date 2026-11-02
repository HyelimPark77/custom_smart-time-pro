package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleUserProfile extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int FEMALE = 0;
    public static final int IMPERIAL = 1;
    public static final int ITEM_LENGTH = 15;
    public static final int MALE = 1;
    public static final int METRIC = 0;
    public static final int SECRECY = 0;
    public static final int UNKNOWN = 2;
    private int mAge;
    private int mGender;
    private float mHeight;
    private int mUnit;
    private int mUserId;
    private float mWeight;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @Deprecated(message = "主要是针对没定义保密性别的设备，早期的传音项目才用到，客户自己开发app")
        public static /* synthetic */ void getSECRECY$annotations() {
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleUserProfile() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        float r4 = 0.0f;
        float r5 = 0.0f;
        int r6 = 0;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BleUserProfile copy$default(BleUserProfile r0, int r1, int r2, int r3, float r4, float r5, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mUnit;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mGender;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mAge;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mHeight;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mWeight;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mUserId;
    L20:
        float r9 = r5;
        int r10 = r6;
        int r11 = r3;
        float r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.mUnit;
    }

    public final int component2() {
        return this.mGender;
    }

    public final int component3() {
        return this.mAge;
    }

    public final float component4() {
        return this.mHeight;
    }

    public final float component5() {
        return this.mWeight;
    }

    public final int component6() {
        return this.mUserId;
    }

    @aa1
    public final BleUserProfile copy(int r8, int r9, int r10, float r11, float r12, int r13) {
        return new BleUserProfile(r8, r9, r10, r11, r12, r13);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mUnit = readUInt8();
        this.mGender = readUInt8();
        this.mAge = readUInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mHeight = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mWeight = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mUserId = (int) readUInt32(r0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mUnit);
        writeInt8(this.mGender);
        writeInt8(this.mAge);
        float r0 = this.mHeight;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r0, r1);
        float r2 = this.mWeight;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r2, r1);
        int r3 = this.mUserId;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r3, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleUserProfile) == true) goto L8;
        return false;
    L8:
        BleUserProfile r6 = (BleUserProfile) r5;
        if (this.mUnit == r6.mUnit) goto L12;
        return false;
    L12:
        if (this.mGender == r6.mGender) goto L15;
        return false;
    L15:
        if (this.mAge == r6.mAge) goto L18;
        return false;
    L18:
        if (Float.compare(this.mHeight, r6.mHeight) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.mWeight, r6.mWeight) == 0) goto L24;
        return false;
    L24:
        if (this.mUserId == r6.mUserId) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getMAge() {
        return this.mAge;
    }

    public final int getMGender() {
        return this.mGender;
    }

    public final float getMHeight() {
        return this.mHeight;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 15;
    }

    public final int getMUnit() {
        return this.mUnit;
    }

    public final int getMUserId() {
        return this.mUserId;
    }

    public final float getMWeight() {
        return this.mWeight;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mUnit) * 31) + Integer.hashCode(this.mGender)) * 31) + Integer.hashCode(this.mAge)) * 31) + Float.hashCode(this.mHeight)) * 31) + Float.hashCode(this.mWeight)) * 31) + Integer.hashCode(this.mUserId);
    }

    public final void setMAge(int r1) {
        this.mAge = r1;
    }

    public final void setMGender(int r1) {
        this.mGender = r1;
    }

    public final void setMHeight(float r1) {
        this.mHeight = r1;
    }

    public final void setMUnit(int r1) {
        this.mUnit = r1;
    }

    public final void setMUserId(int r1) {
        this.mUserId = r1;
    }

    public final void setMWeight(float r1) {
        this.mWeight = r1;
    }

    @aa1
    public String toString() {
        return "BleUserProfile(mUnit=" + this.mUnit + ", mGender=" + this.mGender + ", mAge=" + this.mAge + ", mHeight=" + this.mHeight + ", mWeight=" + this.mWeight + ", mUserId=" + this.mUserId + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleUserProfile(int r1, int r2, int r3, float r4, float r5, int r6) {
        this.mUnit = r1;
        this.mGender = r2;
        this.mAge = r3;
        this.mHeight = r4;
        this.mWeight = r5;
        this.mUserId = r6;
    }

    public /* synthetic */ BleUserProfile(int r2, int r3, int r4, float r5, float r6, int r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 18;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = 170.0f;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 70.0f;
    L18:
        if ((r8 & 32) == 0) goto L21;
        int r10 = 0;
    L20:
        float r11 = r6;
        float r12 = r5;
        int r13 = r4;
        this(r2, r3, r13, r12, r11, r10);
        return;
    L21:
        r10 = r7;
        goto L20
    }
}
