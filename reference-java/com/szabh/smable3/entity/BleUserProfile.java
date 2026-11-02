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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "主要是针对没定义保密性别的设备，早期的传音项目才用到，客户自己开发app")
        public static /* synthetic */ void getSECRECY$annotations() {
        }

        private Companion() {
        }
    }

    public BleUserProfile() {
        this(0, 0, 0, 0.0f, 0.0f, 0, 63, null);
    }

    public static /* synthetic */ BleUserProfile copy$default(BleUserProfile bleUserProfile, int i, int i2, int i3, float f, float f2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bleUserProfile.mUnit;
        }
        if ((i5 & 2) != 0) {
            i2 = bleUserProfile.mGender;
        }
        if ((i5 & 4) != 0) {
            i3 = bleUserProfile.mAge;
        }
        if ((i5 & 8) != 0) {
            f = bleUserProfile.mHeight;
        }
        if ((i5 & 16) != 0) {
            f2 = bleUserProfile.mWeight;
        }
        if ((i5 & 32) != 0) {
            i4 = bleUserProfile.mUserId;
        }
        float f3 = f2;
        int i6 = i4;
        return bleUserProfile.copy(i, i2, i3, f, f3, i6);
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
    public final BleUserProfile copy(int i, int i2, int i3, float f, float f2, int i4) {
        return new BleUserProfile(i, i2, i3, f, f2, i4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mUnit = readUInt8();
        this.mGender = readUInt8();
        this.mAge = readUInt8();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mHeight = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mWeight = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mUserId = (int) readUInt32(LITTLE_ENDIAN);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mUnit);
        writeInt8(this.mGender);
        writeInt8(this.mAge);
        float f = this.mHeight;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f, LITTLE_ENDIAN);
        float f2 = this.mWeight;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f2, LITTLE_ENDIAN);
        int i = this.mUserId;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i, LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleUserProfile)) {
            return false;
        }
        BleUserProfile bleUserProfile = (BleUserProfile) obj;
        return this.mUnit == bleUserProfile.mUnit && this.mGender == bleUserProfile.mGender && this.mAge == bleUserProfile.mAge && Float.compare(this.mHeight, bleUserProfile.mHeight) == 0 && Float.compare(this.mWeight, bleUserProfile.mWeight) == 0 && this.mUserId == bleUserProfile.mUserId;
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

    public final void setMAge(int i) {
        this.mAge = i;
    }

    public final void setMGender(int i) {
        this.mGender = i;
    }

    public final void setMHeight(float f) {
        this.mHeight = f;
    }

    public final void setMUnit(int i) {
        this.mUnit = i;
    }

    public final void setMUserId(int i) {
        this.mUserId = i;
    }

    public final void setMWeight(float f) {
        this.mWeight = f;
    }

    @aa1
    public String toString() {
        return "BleUserProfile(mUnit=" + this.mUnit + ", mGender=" + this.mGender + ", mAge=" + this.mAge + ", mHeight=" + this.mHeight + ", mWeight=" + this.mWeight + ", mUserId=" + this.mUserId + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleUserProfile(int i, int i2, int i3, float f, float f2, int i4) {
        this.mUnit = i;
        this.mGender = i2;
        this.mAge = i3;
        this.mHeight = f;
        this.mWeight = f2;
        this.mUserId = i4;
    }

    public /* synthetic */ BleUserProfile(int i, int i2, int i3, float f, float f2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 18 : i3, (i5 & 8) != 0 ? 170.0f : f, (i5 & 16) != 0 ? 70.0f : f2, (i5 & 32) != 0 ? 0 : i4);
    }
}
