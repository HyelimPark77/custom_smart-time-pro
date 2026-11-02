package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCPUserInfo extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int FEMALE = 0;
    public static final int ITEM_LENGTH = 51;
    public static final int MALE = 1;
    private int isCP;
    private int mAge;
    private int mBloodOxygen;
    private int mBloodOxygenSwitch;
    private int mCalorie;
    private int mDateTogether;
    private int mDistance;
    private int mDistanceSwitch;
    private int mGender;
    private int mHeartRate;
    private int mHeartRateSwitch;
    private int mPressure;
    private int mPressureSwitch;
    private int mStep;
    private int mStepGoal;
    private int mStepSwitch;
    private int mTemperature;
    private int mTemperatureSwitch;

    @aa1
    private String mUserName;

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

    public BleCPUserInfo() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        String r19 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, 524287, null);
    }

    public static /* synthetic */ BleCPUserInfo copy$default(BleCPUserInfo r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, String r36, int r37, Object r38) {
        if ((r37 & 1) == 0) goto L5;
        int r2 = r17.isCP;
    L7:
        if ((r37 & 2) == 0) goto L9;
        int r3 = r17.mGender;
    L11:
        if ((r37 & 4) == 0) goto L13;
        int r4 = r17.mAge;
    L15:
        if ((r37 & 8) == 0) goto L17;
        int r5 = r17.mStepSwitch;
    L19:
        if ((r37 & 16) == 0) goto L21;
        int r6 = r17.mHeartRateSwitch;
    L23:
        if ((r37 & 32) == 0) goto L25;
        int r7 = r17.mTemperatureSwitch;
    L27:
        if ((r37 & 64) == 0) goto L29;
        int r8 = r17.mBloodOxygenSwitch;
    L31:
        if ((r37 & 128) == 0) goto L33;
        int r9 = r17.mPressureSwitch;
    L35:
        if ((r37 & 256) == 0) goto L37;
        int r10 = r17.mDistanceSwitch;
    L39:
        if ((r37 & 512) == 0) goto L41;
        int r11 = r17.mHeartRate;
    L43:
        if ((r37 & 1024) == 0) goto L45;
        int r12 = r17.mBloodOxygen;
    L47:
        if ((r37 & 2048) == 0) goto L49;
        int r13 = r17.mPressure;
    L51:
        if ((r37 & 4096) == 0) goto L53;
        int r14 = r17.mTemperature;
    L55:
        if ((r37 & 8192) == 0) goto L57;
        int r15 = r17.mStep;
    L58:
        int r110 = r2;
        if ((r37 & 16384) == 0) goto L61;
        int r16 = r17.mStepGoal;
    L63:
        if ((r37 & 32768) == 0) goto L65;
        int r1 = r17.mCalorie;
    L66:
        int r111 = r1;
        if ((r37 & 65536) == 0) goto L69;
        int r39 = r17.mDistance;
    L70:
        int r210 = r39;
        if ((r37 & 131072) == 0) goto L73;
        int r40 = r17.mDateTogether;
    L75:
        if ((r37 & 262144) == 0) goto L78;
        int r211 = r40;
        int r310 = r211;
        String r311 = r17.mUserName;
    L80:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r310, r311);
    L78:
        r311 = r36;
        r310 = r40;
        goto L80
    L73:
        r40 = r35;
        goto L75
    L69:
        r39 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final int component1() {
        return this.isCP;
    }

    public final int component10() {
        return this.mHeartRate;
    }

    public final int component11() {
        return this.mBloodOxygen;
    }

    public final int component12() {
        return this.mPressure;
    }

    public final int component13() {
        return this.mTemperature;
    }

    public final int component14() {
        return this.mStep;
    }

    public final int component15() {
        return this.mStepGoal;
    }

    public final int component16() {
        return this.mCalorie;
    }

    public final int component17() {
        return this.mDistance;
    }

    public final int component18() {
        return this.mDateTogether;
    }

    @aa1
    public final String component19() {
        return this.mUserName;
    }

    public final int component2() {
        return this.mGender;
    }

    public final int component3() {
        return this.mAge;
    }

    public final int component4() {
        return this.mStepSwitch;
    }

    public final int component5() {
        return this.mHeartRateSwitch;
    }

    public final int component6() {
        return this.mTemperatureSwitch;
    }

    public final int component7() {
        return this.mBloodOxygenSwitch;
    }

    public final int component8() {
        return this.mPressureSwitch;
    }

    public final int component9() {
        return this.mDistanceSwitch;
    }

    @aa1
    public final BleCPUserInfo copy(int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, @aa1 String r40) {
        Intrinsics.X0O(r40, "mUserName");
        return new BleCPUserInfo(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.isCP = readUInt8();
        this.mGender = readUInt8();
        this.mAge = readUInt8();
        this.mStepSwitch = readIntN(1);
        this.mHeartRateSwitch = readIntN(1);
        this.mTemperatureSwitch = readIntN(1);
        this.mBloodOxygenSwitch = readIntN(1);
        this.mPressureSwitch = readIntN(1);
        this.mDistanceSwitch = readIntN(1);
        readIntN(2);
        this.mHeartRate = readUInt8();
        this.mBloodOxygen = readUInt8();
        this.mPressure = readUInt8();
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.mTemperature = readInt16(r1);
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.mStep = readInt32(r1);
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.mStepGoal = readInt32(r1);
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.mCalorie = readInt32(r1);
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.mDistance = readInt32(r1);
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.mDateTogether = readInt32(r1);
        this.mUserName = BleReadable.readString$default(this, 32, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.isCP);
        writeInt8(this.mGender);
        writeInt8(this.mAge);
        writeIntN(this.mStepSwitch, 1);
        writeIntN(this.mHeartRateSwitch, 1);
        writeIntN(this.mTemperatureSwitch, 1);
        writeIntN(this.mBloodOxygenSwitch, 1);
        writeIntN(this.mPressureSwitch, 1);
        writeIntN(this.mDistanceSwitch, 1);
        writeIntN(0, 2);
        writeInt8(this.mHeartRate);
        writeInt8(this.mBloodOxygen);
        writeInt8(this.mPressure);
        int r0 = this.mTemperature;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        int r2 = this.mStep;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r2, r1);
        int r3 = this.mStepGoal;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r3, r1);
        int r4 = this.mCalorie;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r4, r1);
        int r5 = this.mDistance;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r5, r1);
        int r6 = this.mDateTogether;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r6, r1);
        BleWritable.writeStringWithMax$default(this, this.mUserName, 32, null, 4, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleCPUserInfo) == true) goto L8;
        return false;
    L8:
        BleCPUserInfo r6 = (BleCPUserInfo) r5;
        if (this.isCP == r6.isCP) goto L12;
        return false;
    L12:
        if (this.mGender == r6.mGender) goto L15;
        return false;
    L15:
        if (this.mAge == r6.mAge) goto L18;
        return false;
    L18:
        if (this.mStepSwitch == r6.mStepSwitch) goto L21;
        return false;
    L21:
        if (this.mHeartRateSwitch == r6.mHeartRateSwitch) goto L24;
        return false;
    L24:
        if (this.mTemperatureSwitch == r6.mTemperatureSwitch) goto L27;
        return false;
    L27:
        if (this.mBloodOxygenSwitch == r6.mBloodOxygenSwitch) goto L30;
        return false;
    L30:
        if (this.mPressureSwitch == r6.mPressureSwitch) goto L33;
        return false;
    L33:
        if (this.mDistanceSwitch == r6.mDistanceSwitch) goto L36;
        return false;
    L36:
        if (this.mHeartRate == r6.mHeartRate) goto L39;
        return false;
    L39:
        if (this.mBloodOxygen == r6.mBloodOxygen) goto L42;
        return false;
    L42:
        if (this.mPressure == r6.mPressure) goto L45;
        return false;
    L45:
        if (this.mTemperature == r6.mTemperature) goto L48;
        return false;
    L48:
        if (this.mStep == r6.mStep) goto L51;
        return false;
    L51:
        if (this.mStepGoal == r6.mStepGoal) goto L54;
        return false;
    L54:
        if (this.mCalorie == r6.mCalorie) goto L57;
        return false;
    L57:
        if (this.mDistance == r6.mDistance) goto L60;
        return false;
    L60:
        if (this.mDateTogether == r6.mDateTogether) goto L63;
        return false;
    L63:
        if (Intrinsics.XOO0ii0(this.mUserName, r6.mUserName) == true) goto L65;
        return false;
    L65:
        return true;
    }

    public final int getMAge() {
        return this.mAge;
    }

    public final int getMBloodOxygen() {
        return this.mBloodOxygen;
    }

    public final int getMBloodOxygenSwitch() {
        return this.mBloodOxygenSwitch;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMDateTogether() {
        return this.mDateTogether;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMDistanceSwitch() {
        return this.mDistanceSwitch;
    }

    public final int getMGender() {
        return this.mGender;
    }

    public final int getMHeartRate() {
        return this.mHeartRate;
    }

    public final int getMHeartRateSwitch() {
        return this.mHeartRateSwitch;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 51;
    }

    public final int getMPressure() {
        return this.mPressure;
    }

    public final int getMPressureSwitch() {
        return this.mPressureSwitch;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public final int getMStepGoal() {
        return this.mStepGoal;
    }

    public final int getMStepSwitch() {
        return this.mStepSwitch;
    }

    public final int getMTemperature() {
        return this.mTemperature;
    }

    public final int getMTemperatureSwitch() {
        return this.mTemperatureSwitch;
    }

    @aa1
    public final String getMUserName() {
        return this.mUserName;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((Integer.hashCode(this.isCP) * 31) + Integer.hashCode(this.mGender)) * 31) + Integer.hashCode(this.mAge)) * 31) + Integer.hashCode(this.mStepSwitch)) * 31) + Integer.hashCode(this.mHeartRateSwitch)) * 31) + Integer.hashCode(this.mTemperatureSwitch)) * 31) + Integer.hashCode(this.mBloodOxygenSwitch)) * 31) + Integer.hashCode(this.mPressureSwitch)) * 31) + Integer.hashCode(this.mDistanceSwitch)) * 31) + Integer.hashCode(this.mHeartRate)) * 31) + Integer.hashCode(this.mBloodOxygen)) * 31) + Integer.hashCode(this.mPressure)) * 31) + Integer.hashCode(this.mTemperature)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mStepGoal)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mDateTogether)) * 31) + this.mUserName.hashCode();
    }

    public final int isCP() {
        return this.isCP;
    }

    public final void setCP(int r1) {
        this.isCP = r1;
    }

    public final void setMAge(int r1) {
        this.mAge = r1;
    }

    public final void setMBloodOxygen(int r1) {
        this.mBloodOxygen = r1;
    }

    public final void setMBloodOxygenSwitch(int r1) {
        this.mBloodOxygenSwitch = r1;
    }

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMDateTogether(int r1) {
        this.mDateTogether = r1;
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMDistanceSwitch(int r1) {
        this.mDistanceSwitch = r1;
    }

    public final void setMGender(int r1) {
        this.mGender = r1;
    }

    public final void setMHeartRate(int r1) {
        this.mHeartRate = r1;
    }

    public final void setMHeartRateSwitch(int r1) {
        this.mHeartRateSwitch = r1;
    }

    public final void setMPressure(int r1) {
        this.mPressure = r1;
    }

    public final void setMPressureSwitch(int r1) {
        this.mPressureSwitch = r1;
    }

    public final void setMStep(int r1) {
        this.mStep = r1;
    }

    public final void setMStepGoal(int r1) {
        this.mStepGoal = r1;
    }

    public final void setMStepSwitch(int r1) {
        this.mStepSwitch = r1;
    }

    public final void setMTemperature(int r1) {
        this.mTemperature = r1;
    }

    public final void setMTemperatureSwitch(int r1) {
        this.mTemperatureSwitch = r1;
    }

    public final void setMUserName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mUserName = r2;
    }

    @aa1
    public String toString() {
        return "BleCPUserInfo(isCP=" + this.isCP + ", mGender=" + this.mGender + ", mAge=" + this.mAge + ", mStepSwitch=" + this.mStepSwitch + ", mHeartRateSwitch=" + this.mHeartRateSwitch + ", mTemperatureSwitch=" + this.mTemperatureSwitch + ", mBloodOxygenSwitch=" + this.mBloodOxygenSwitch + ", mPressureSwitch=" + this.mPressureSwitch + ", mDistanceSwitch=" + this.mDistanceSwitch + ", mHeartRate=" + this.mHeartRate + ", mBloodOxygen=" + this.mBloodOxygen + ", mPressure=" + this.mPressure + ", mTemperature=" + this.mTemperature + ", mStep=" + this.mStep + ", mStepGoal=" + this.mStepGoal + ", mCalorie=" + this.mCalorie + ", mDistance=" + this.mDistance + ", mDateTogether=" + this.mDateTogether + ", mUserName=" + this.mUserName + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPUserInfo(int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, @aa1 String r21) {
        Intrinsics.X0O(r21, "mUserName");
        this.isCP = r3;
        this.mGender = r4;
        this.mAge = r5;
        this.mStepSwitch = r6;
        this.mHeartRateSwitch = r7;
        this.mTemperatureSwitch = r8;
        this.mBloodOxygenSwitch = r9;
        this.mPressureSwitch = r10;
        this.mDistanceSwitch = r11;
        this.mHeartRate = r12;
        this.mBloodOxygen = r13;
        this.mPressure = r14;
        this.mTemperature = r15;
        this.mStep = r16;
        this.mStepGoal = r17;
        this.mCalorie = r18;
        this.mDistance = r19;
        this.mDateTogether = r20;
        this.mUserName = r21;
    }

    public /* synthetic */ BleCPUserInfo(int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, String r39, int r40, DefaultConstructorMarker r41) {
        if ((r40 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r40 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r40 & 4) == 0) goto L13;
        int r4 = 0;
    L15:
        if ((r40 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r40 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r40 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r40 & 64) == 0) goto L29;
        int r8 = 0;
    L31:
        if ((r40 & 128) == 0) goto L33;
        int r9 = 0;
    L35:
        if ((r40 & 256) == 0) goto L37;
        int r10 = 0;
    L39:
        if ((r40 & 512) == 0) goto L41;
        int r11 = 0;
    L43:
        if ((r40 & 1024) == 0) goto L45;
        int r12 = 0;
    L47:
        if ((r40 & 2048) == 0) goto L49;
        int r13 = 0;
    L51:
        if ((r40 & 4096) == 0) goto L53;
        int r14 = 0;
    L55:
        if ((r40 & 8192) == 0) goto L57;
        int r15 = 0;
    L59:
        if ((r40 & 16384) == 0) goto L61;
        int r2 = 0;
    L63:
        if ((r40 & 32768) == 0) goto L65;
        int r16 = 0;
    L67:
        if ((r40 & 65536) == 0) goto L69;
        int r17 = 0;
    L71:
        if ((r40 & 131072) == 0) goto L73;
        int r18 = 0;
    L75:
        if ((r40 & 262144) == 0) goto L78;
        String r42 = "";
    L79:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r42);
        return;
    L78:
        r42 = r39;
        goto L79
    L73:
        r18 = r38;
        goto L75
    L69:
        r17 = r37;
        goto L71
    L65:
        r16 = r36;
        goto L67
    L61:
        r2 = r35;
        goto L63
    L57:
        r15 = r34;
        goto L59
    L53:
        r14 = r33;
        goto L55
    L49:
        r13 = r32;
        goto L51
    L45:
        r12 = r31;
        goto L47
    L41:
        r11 = r30;
        goto L43
    L37:
        r10 = r29;
        goto L39
    L33:
        r9 = r28;
        goto L35
    L29:
        r8 = r27;
        goto L31
    L25:
        r7 = r26;
        goto L27
    L21:
        r6 = r25;
        goto L23
    L17:
        r5 = r24;
        goto L19
    L13:
        r4 = r23;
        goto L15
    L9:
        r3 = r22;
        goto L11
    L5:
        r1 = r21;
        goto L7
    }
}
