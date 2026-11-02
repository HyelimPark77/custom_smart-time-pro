package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleQiblaSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleQiblaSettings.kt\ncom/szabh/smable3/entity/BleQiblaSettings\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,122:1\n232#2,3:123\n222#2,15:126\n*S KotlinDebug\n*F\n+ 1 BleQiblaSettings.kt\ncom/szabh/smable3/entity/BleQiblaSettings\n*L\n101#1:123,3\n101#1:126,15\n*E\n"})
public final class BleQiblaSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 452;
    public static final int METHOD_DUBAI = 4;
    public static final int METHOD_EGYPTIAN = 1;
    public static final int METHOD_KARACHI = 2;
    public static final int METHOD_KUWAIT = 7;
    public static final int METHOD_MOON_SIGHTING_COMMITTEE = 5;
    public static final int METHOD_MUSLIM_WORLD_LEAGUE = 0;
    public static final int METHOD_NORTH_AMERICA = 6;
    public static final int METHOD_OTHER = 11;
    public static final int METHOD_QATAR = 8;
    public static final int METHOD_SIHAT_KEMENAG = 12;
    public static final int METHOD_SINGAPORE = 9;
    public static final int METHOD_TURKEY = 10;
    public static final int METHOD_UMM_AL_QURA = 3;
    private int mEnabled;
    private int mHijriDay;
    private int mHijriMonth;
    private int mHijriYear;
    private int mMethod;

    @aa1
    private List<BlePrayerTimes> mPrayerTimes;
    private int mReminderMinute;
    private int mStartTime;

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

    public BleQiblaSettings() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        List r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleQiblaSettings copy$default(BleQiblaSettings r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, List r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.mMethod;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.mReminderMinute;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.mHijriYear;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.mHijriMonth;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.mHijriDay;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.mStartTime;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.mPrayerTimes;
    L26:
        int r11 = r7;
        List r12 = r8;
        int r13 = r5;
        int r14 = r6;
        int r15 = r3;
        int r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
    }

    public final int component1() {
        return this.mEnabled;
    }

    public final int component2() {
        return this.mMethod;
    }

    public final int component3() {
        return this.mReminderMinute;
    }

    public final int component4() {
        return this.mHijriYear;
    }

    public final int component5() {
        return this.mHijriMonth;
    }

    public final int component6() {
        return this.mHijriDay;
    }

    public final int component7() {
        return this.mStartTime;
    }

    @aa1
    public final List<BlePrayerTimes> component8() {
        return this.mPrayerTimes;
    }

    @aa1
    public final BleQiblaSettings copy(int r11, int r12, int r13, int r14, int r15, int r16, int r17, @aa1 List<BlePrayerTimes> r18) {
        Intrinsics.X0O(r18, "mPrayerTimes");
        return new BleQiblaSettings(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mEnabled = readInt8();
        this.mMethod = readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mReminderMinute = readInt16(r0);
        byte r2 = readInt8();
        int r3 = 0;
        if (r2 != 0) goto L5;
        int r4 = 0;
    L6:
        this.mHijriYear = r4;
        this.mHijriMonth = readInt8();
        this.mHijriDay = readInt8();
        readBytes(7);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mStartTime = readInt32(r0);
        ArrayList r1 = new ArrayList();
    L8:
        if (r3 >= 31) goto L10;
        BleReadable r5 = (BleReadable) BlePrayerTimes.class.newInstance();
        r5.setMBytes(readBytes(14));
        r5.decode();
        Intrinsics.XXI(r5);
        r1.add(r5);
        r3 = r3 + 1;
        goto L8
    L10:
        this.mPrayerTimes = r1;
        return;
    L5:
        r4 = r2 + 1400;
        goto L6
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        writeInt8(this.mMethod);
        int r0 = this.mReminderMinute;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        int r2 = this.mHijriYear;
        if (r2 != 0) goto L5;
        int r3 = 0;
    L6:
        writeInt8(r3);
        writeInt8(this.mHijriMonth);
        writeInt8(this.mHijriDay);
        BleWritable.writeBytes$default(this, new byte[7], null, 2, null);
        int r4 = this.mStartTime;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r4, r1);
        writeList(this.mPrayerTimes);
        return;
    L5:
        r3 = r2 - 1400;
        goto L6
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleQiblaSettings) == true) goto L8;
        return false;
    L8:
        BleQiblaSettings r6 = (BleQiblaSettings) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (this.mMethod == r6.mMethod) goto L15;
        return false;
    L15:
        if (this.mReminderMinute == r6.mReminderMinute) goto L18;
        return false;
    L18:
        if (this.mHijriYear == r6.mHijriYear) goto L21;
        return false;
    L21:
        if (this.mHijriMonth == r6.mHijriMonth) goto L24;
        return false;
    L24:
        if (this.mHijriDay == r6.mHijriDay) goto L27;
        return false;
    L27:
        if (this.mStartTime == r6.mStartTime) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mPrayerTimes, r6.mPrayerTimes) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    public final int getMHijriDay() {
        return this.mHijriDay;
    }

    public final int getMHijriMonth() {
        return this.mHijriMonth;
    }

    public final int getMHijriYear() {
        return this.mHijriYear;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return ITEM_LENGTH;
    }

    public final int getMMethod() {
        return this.mMethod;
    }

    @aa1
    public final List<BlePrayerTimes> getMPrayerTimes() {
        return this.mPrayerTimes;
    }

    public final int getMReminderMinute() {
        return this.mReminderMinute;
    }

    public final int getMStartTime() {
        return this.mStartTime;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.mEnabled) * 31) + Integer.hashCode(this.mMethod)) * 31) + Integer.hashCode(this.mReminderMinute)) * 31) + Integer.hashCode(this.mHijriYear)) * 31) + Integer.hashCode(this.mHijriMonth)) * 31) + Integer.hashCode(this.mHijriDay)) * 31) + Integer.hashCode(this.mStartTime)) * 31) + this.mPrayerTimes.hashCode();
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    public final void setMHijriDay(int r1) {
        this.mHijriDay = r1;
    }

    public final void setMHijriMonth(int r1) {
        this.mHijriMonth = r1;
    }

    public final void setMHijriYear(int r1) {
        this.mHijriYear = r1;
    }

    public final void setMMethod(int r1) {
        this.mMethod = r1;
    }

    public final void setMPrayerTimes(@aa1 List<BlePrayerTimes> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPrayerTimes = r2;
    }

    public final void setMReminderMinute(int r1) {
        this.mReminderMinute = r1;
    }

    public final void setMStartTime(int r1) {
        this.mStartTime = r1;
    }

    @aa1
    public String toString() {
        return "BleQiblaSettings(mEnabled=" + this.mEnabled + ", mMethod=" + this.mMethod + ", mReminderMinute=" + this.mReminderMinute + ", mHijriYear=" + this.mHijriYear + ", mHijriMonth=" + this.mHijriMonth + ", mHijriDay=" + this.mHijriDay + ", mStartTime=" + this.mStartTime + ", mPrayerTimes=" + this.mPrayerTimes + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleQiblaSettings(int r2, int r3, int r4, int r5, int r6, int r7, int r8, @aa1 List<BlePrayerTimes> r9) {
        Intrinsics.X0O(r9, "mPrayerTimes");
        this.mEnabled = r2;
        this.mMethod = r3;
        this.mReminderMinute = r4;
        this.mHijriYear = r5;
        this.mHijriMonth = r6;
        this.mHijriDay = r7;
        this.mStartTime = r8;
        this.mPrayerTimes = r9;
    }

    public /* synthetic */ BleQiblaSettings(int r2, int r3, int r4, int r5, int r6, int r7, int r8, List r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r10 & 128) == 0) goto L26;
        r9 = new ArrayList();
    L26:
        List r12 = r9;
        int r13 = r8;
        int r14 = r7;
        int r15 = r6;
        int r16 = r5;
        int r17 = r4;
        this(r2, r3, r17, r16, r15, r14, r13, r12);
    }
}
