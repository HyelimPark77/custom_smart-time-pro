package com.sma.smartv3.biz.fitness_site.hyky;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.GetGomoreAuthKey;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class UploadSleepDataHYKY {

    @aa1
    public static final UploadSleepDataHYKY INSTANCE = null;

    @aa1
    public static final String URL = "/ac-health-data/thirdPlatform/userDevice/general/dataReport/sleepData";

    public static final class BodyData {

        @aa1
        private String cmei;

        @aa1
        private String deviceId;
        private int deviceType;

        @aa1
        private String mac;

        @aa1
        private String phone;

        @aa1
        private Object sleepData;

        @aa1
        private String sn;

        public BodyData(@aa1 String r2, int r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 Object r8) {
            Intrinsics.X0O(r2, "phone");
            Intrinsics.X0O(r4, GetGomoreAuthKey.DEVICE_ID);
            Intrinsics.X0O(r5, "cmei");
            Intrinsics.X0O(r6, "sn");
            Intrinsics.X0O(r7, "mac");
            Intrinsics.X0O(r8, "sleepData");
            this.phone = r2;
            this.deviceType = r3;
            this.deviceId = r4;
            this.cmei = r5;
            this.sn = r6;
            this.mac = r7;
            this.sleepData = r8;
        }

        public static /* synthetic */ BodyData copy$default(BodyData r0, String r1, int r2, String r3, String r4, String r5, String r6, Object r7, int r8, Object r9) {
            if ((r8 & 1) == 0) goto L6;
            r1 = r0.phone;
        L6:
            if ((r8 & 2) == 0) goto L9;
            r2 = r0.deviceType;
        L9:
            if ((r8 & 4) == 0) goto L12;
            r3 = r0.deviceId;
        L12:
            if ((r8 & 8) == 0) goto L15;
            r4 = r0.cmei;
        L15:
            if ((r8 & 16) == 0) goto L18;
            r5 = r0.sn;
        L18:
            if ((r8 & 32) == 0) goto L21;
            r6 = r0.mac;
        L21:
            if ((r8 & 64) == 0) goto L23;
            r7 = r0.sleepData;
        L23:
            String r10 = r6;
            Object r11 = r7;
            String r12 = r4;
            String r13 = r5;
            String r14 = r3;
            String r15 = r1;
            return r0.copy(r15, r2, r14, r12, r13, r10, r11);
        }

        @aa1
        public final String component1() {
            return this.phone;
        }

        public final int component2() {
            return this.deviceType;
        }

        @aa1
        public final String component3() {
            return this.deviceId;
        }

        @aa1
        public final String component4() {
            return this.cmei;
        }

        @aa1
        public final String component5() {
            return this.sn;
        }

        @aa1
        public final String component6() {
            return this.mac;
        }

        @aa1
        public final Object component7() {
            return this.sleepData;
        }

        @aa1
        public final BodyData copy(@aa1 String r10, int r11, @aa1 String r12, @aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 Object r16) {
            Intrinsics.X0O(r10, "phone");
            Intrinsics.X0O(r12, GetGomoreAuthKey.DEVICE_ID);
            Intrinsics.X0O(r13, "cmei");
            Intrinsics.X0O(r14, "sn");
            Intrinsics.X0O(r15, "mac");
            Intrinsics.X0O(r16, "sleepData");
            return new BodyData(r10, r11, r12, r13, r14, r15, r16);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof BodyData) == true) goto L8;
            return false;
        L8:
            BodyData r6 = (BodyData) r5;
            if (Intrinsics.XOO0ii0(this.phone, r6.phone) == true) goto L12;
            return false;
        L12:
            if (this.deviceType == r6.deviceType) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.deviceId, r6.deviceId) == true) goto L18;
            return false;
        L18:
            if (Intrinsics.XOO0ii0(this.cmei, r6.cmei) == true) goto L21;
            return false;
        L21:
            if (Intrinsics.XOO0ii0(this.sn, r6.sn) == true) goto L24;
            return false;
        L24:
            if (Intrinsics.XOO0ii0(this.mac, r6.mac) == true) goto L27;
            return false;
        L27:
            if (Intrinsics.XOO0ii0(this.sleepData, r6.sleepData) == true) goto L29;
            return false;
        L29:
            return true;
        }

        @aa1
        public final String getCmei() {
            return this.cmei;
        }

        @aa1
        public final String getDeviceId() {
            return this.deviceId;
        }

        public final int getDeviceType() {
            return this.deviceType;
        }

        @aa1
        public final String getMac() {
            return this.mac;
        }

        @aa1
        public final String getPhone() {
            return this.phone;
        }

        @aa1
        public final Object getSleepData() {
            return this.sleepData;
        }

        @aa1
        public final String getSn() {
            return this.sn;
        }

        public int hashCode() {
            return (((((((((((this.phone.hashCode() * 31) + Integer.hashCode(this.deviceType)) * 31) + this.deviceId.hashCode()) * 31) + this.cmei.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.mac.hashCode()) * 31) + this.sleepData.hashCode();
        }

        public final void setCmei(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.cmei = r2;
        }

        public final void setDeviceId(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.deviceId = r2;
        }

        public final void setDeviceType(int r1) {
            this.deviceType = r1;
        }

        public final void setMac(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.mac = r2;
        }

        public final void setPhone(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.phone = r2;
        }

        public final void setSleepData(@aa1 Object r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.sleepData = r2;
        }

        public final void setSn(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.sn = r2;
        }

        @aa1
        public String toString() {
            return "BodyData(phone=" + this.phone + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", cmei=" + this.cmei + ", sn=" + this.sn + ", mac=" + this.mac + ", sleepData=" + this.sleepData + I000IiI1O.iO.iO;
        }

        public /* synthetic */ BodyData(String r2, int r3, String r4, String r5, String r6, String r7, Object r8, int r9, DefaultConstructorMarker r10) {
            if ((r9 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r9 & 2) == 0) goto L9;
            r3 = HykyAPI.DeviceType;
        L9:
            if ((r9 & 4) == 0) goto L12;
            r4 = "";
        L12:
            if ((r9 & 8) == 0) goto L15;
            r5 = "";
        L15:
            if ((r9 & 16) == 0) goto L18;
            r6 = "";
        L18:
            if ((r9 & 32) == 0) goto L21;
            String r11 = "";
        L20:
            String r12 = r6;
            String r13 = r5;
            String r14 = r4;
            int r15 = r3;
            this(r2, r15, r14, r13, r12, r11, r8);
            return;
        L21:
            r11 = r7;
            goto L20
        }
    }

    public static final class SleepData {

        @tb1
        private List<? extends Object> apneaArray;

        @tb1
        private Integer awakeCount;

        @tb1
        private Integer awakeDuration;

        @tb1
        private Integer bodyMoveCount;

        @tb1
        private List<? extends Object> breathRateArr;

        @tb1
        private List<? extends Object> heartRateArr;

        @tb1
        private Integer offBedDuration;

        @tb1
        private Integer offBedFrequency;

        @tb1
        private String offBedTime;

        @tb1
        private String onBedTime;

        @tb1
        private String recordTime;

        @aa1
        private String sleepDataId;
        private int sleepDataType;

        @tb1
        private String sleepEndTime;

        @tb1
        private String sleepStartTime;

        @tb1
        private List<Integer> sleepStatusArr;

        @tb1
        private List<? extends Object> turnOverArray;

        @tb1
        private Integer turningOverCount;

        public SleepData(@aa1 String r2, int r3, @tb1 String r4, @tb1 String r5, @tb1 String r6, @tb1 String r7, @tb1 Integer r8, @tb1 Integer r9, @tb1 Integer r10, @tb1 Integer r11, @tb1 Integer r12, @tb1 Integer r13, @tb1 String r14, @tb1 List<Integer> r15, @tb1 List<? extends Object> r16, @tb1 List<? extends Object> r17, @tb1 List<? extends Object> r18, @tb1 List<? extends Object> r19) {
            Intrinsics.X0O(r2, "sleepDataId");
            this.sleepDataId = r2;
            this.sleepDataType = r3;
            this.onBedTime = r4;
            this.sleepStartTime = r5;
            this.sleepEndTime = r6;
            this.offBedTime = r7;
            this.offBedFrequency = r8;
            this.offBedDuration = r9;
            this.bodyMoveCount = r10;
            this.turningOverCount = r11;
            this.awakeCount = r12;
            this.awakeDuration = r13;
            this.recordTime = r14;
            this.sleepStatusArr = r15;
            this.heartRateArr = r16;
            this.breathRateArr = r17;
            this.apneaArray = r18;
            this.turnOverArray = r19;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SleepData copy$default(SleepData r17, String r18, int r19, String r20, String r21, String r22, String r23, Integer r24, Integer r25, Integer r26, Integer r27, Integer r28, Integer r29, String r30, List r31, List r32, List r33, List r34, List r35, int r36, Object r37) {
            if ((r36 & 1) == 0) goto L5;
            String r2 = r17.sleepDataId;
        L7:
            if ((r36 & 2) == 0) goto L9;
            int r3 = r17.sleepDataType;
        L11:
            if ((r36 & 4) == 0) goto L13;
            String r4 = r17.onBedTime;
        L15:
            if ((r36 & 8) == 0) goto L17;
            String r5 = r17.sleepStartTime;
        L19:
            if ((r36 & 16) == 0) goto L21;
            String r6 = r17.sleepEndTime;
        L23:
            if ((r36 & 32) == 0) goto L25;
            String r7 = r17.offBedTime;
        L27:
            if ((r36 & 64) == 0) goto L29;
            Integer r8 = r17.offBedFrequency;
        L31:
            if ((r36 & 128) == 0) goto L33;
            Integer r9 = r17.offBedDuration;
        L35:
            if ((r36 & 256) == 0) goto L37;
            Integer r10 = r17.bodyMoveCount;
        L39:
            if ((r36 & 512) == 0) goto L41;
            Integer r11 = r17.turningOverCount;
        L43:
            if ((r36 & 1024) == 0) goto L45;
            Integer r12 = r17.awakeCount;
        L47:
            if ((r36 & 2048) == 0) goto L49;
            Integer r13 = r17.awakeDuration;
        L51:
            if ((r36 & 4096) == 0) goto L53;
            String r14 = r17.recordTime;
        L55:
            if ((r36 & 8192) == 0) goto L57;
            List r15 = r17.sleepStatusArr;
        L58:
            String r110 = r2;
            if ((r36 & 16384) == 0) goto L61;
            List r16 = r17.heartRateArr;
        L63:
            if ((r36 & 32768) == 0) goto L65;
            List r1 = r17.breathRateArr;
        L66:
            List r111 = r1;
            if ((r36 & 65536) == 0) goto L69;
            List r38 = r17.apneaArray;
        L71:
            if ((r36 & 131072) == 0) goto L74;
            List r210 = r38;
            List r39 = r210;
            List r310 = r17.turnOverArray;
        L76:
            return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r39, r310);
        L74:
            r310 = r35;
            r39 = r38;
            goto L76
        L69:
            r38 = r34;
            goto L71
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

        @aa1
        public final String component1() {
            return this.sleepDataId;
        }

        @tb1
        public final Integer component10() {
            return this.turningOverCount;
        }

        @tb1
        public final Integer component11() {
            return this.awakeCount;
        }

        @tb1
        public final Integer component12() {
            return this.awakeDuration;
        }

        @tb1
        public final String component13() {
            return this.recordTime;
        }

        @tb1
        public final List<Integer> component14() {
            return this.sleepStatusArr;
        }

        @tb1
        public final List<Object> component15() {
            return this.heartRateArr;
        }

        @tb1
        public final List<Object> component16() {
            return this.breathRateArr;
        }

        @tb1
        public final List<Object> component17() {
            return this.apneaArray;
        }

        @tb1
        public final List<Object> component18() {
            return this.turnOverArray;
        }

        public final int component2() {
            return this.sleepDataType;
        }

        @tb1
        public final String component3() {
            return this.onBedTime;
        }

        @tb1
        public final String component4() {
            return this.sleepStartTime;
        }

        @tb1
        public final String component5() {
            return this.sleepEndTime;
        }

        @tb1
        public final String component6() {
            return this.offBedTime;
        }

        @tb1
        public final Integer component7() {
            return this.offBedFrequency;
        }

        @tb1
        public final Integer component8() {
            return this.offBedDuration;
        }

        @tb1
        public final Integer component9() {
            return this.bodyMoveCount;
        }

        @aa1
        public final SleepData copy(@aa1 String r21, int r22, @tb1 String r23, @tb1 String r24, @tb1 String r25, @tb1 String r26, @tb1 Integer r27, @tb1 Integer r28, @tb1 Integer r29, @tb1 Integer r30, @tb1 Integer r31, @tb1 Integer r32, @tb1 String r33, @tb1 List<Integer> r34, @tb1 List<? extends Object> r35, @tb1 List<? extends Object> r36, @tb1 List<? extends Object> r37, @tb1 List<? extends Object> r38) {
            Intrinsics.X0O(r21, "sleepDataId");
            return new SleepData(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof SleepData) == true) goto L8;
            return false;
        L8:
            SleepData r6 = (SleepData) r5;
            if (Intrinsics.XOO0ii0(this.sleepDataId, r6.sleepDataId) == true) goto L12;
            return false;
        L12:
            if (this.sleepDataType == r6.sleepDataType) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.onBedTime, r6.onBedTime) == true) goto L18;
            return false;
        L18:
            if (Intrinsics.XOO0ii0(this.sleepStartTime, r6.sleepStartTime) == true) goto L21;
            return false;
        L21:
            if (Intrinsics.XOO0ii0(this.sleepEndTime, r6.sleepEndTime) == true) goto L24;
            return false;
        L24:
            if (Intrinsics.XOO0ii0(this.offBedTime, r6.offBedTime) == true) goto L27;
            return false;
        L27:
            if (Intrinsics.XOO0ii0(this.offBedFrequency, r6.offBedFrequency) == true) goto L30;
            return false;
        L30:
            if (Intrinsics.XOO0ii0(this.offBedDuration, r6.offBedDuration) == true) goto L33;
            return false;
        L33:
            if (Intrinsics.XOO0ii0(this.bodyMoveCount, r6.bodyMoveCount) == true) goto L36;
            return false;
        L36:
            if (Intrinsics.XOO0ii0(this.turningOverCount, r6.turningOverCount) == true) goto L39;
            return false;
        L39:
            if (Intrinsics.XOO0ii0(this.awakeCount, r6.awakeCount) == true) goto L42;
            return false;
        L42:
            if (Intrinsics.XOO0ii0(this.awakeDuration, r6.awakeDuration) == true) goto L45;
            return false;
        L45:
            if (Intrinsics.XOO0ii0(this.recordTime, r6.recordTime) == true) goto L48;
            return false;
        L48:
            if (Intrinsics.XOO0ii0(this.sleepStatusArr, r6.sleepStatusArr) == true) goto L51;
            return false;
        L51:
            if (Intrinsics.XOO0ii0(this.heartRateArr, r6.heartRateArr) == true) goto L54;
            return false;
        L54:
            if (Intrinsics.XOO0ii0(this.breathRateArr, r6.breathRateArr) == true) goto L57;
            return false;
        L57:
            if (Intrinsics.XOO0ii0(this.apneaArray, r6.apneaArray) == true) goto L60;
            return false;
        L60:
            if (Intrinsics.XOO0ii0(this.turnOverArray, r6.turnOverArray) == true) goto L62;
            return false;
        L62:
            return true;
        }

        @tb1
        public final List<Object> getApneaArray() {
            return this.apneaArray;
        }

        @tb1
        public final Integer getAwakeCount() {
            return this.awakeCount;
        }

        @tb1
        public final Integer getAwakeDuration() {
            return this.awakeDuration;
        }

        @tb1
        public final Integer getBodyMoveCount() {
            return this.bodyMoveCount;
        }

        @tb1
        public final List<Object> getBreathRateArr() {
            return this.breathRateArr;
        }

        @tb1
        public final List<Object> getHeartRateArr() {
            return this.heartRateArr;
        }

        @tb1
        public final Integer getOffBedDuration() {
            return this.offBedDuration;
        }

        @tb1
        public final Integer getOffBedFrequency() {
            return this.offBedFrequency;
        }

        @tb1
        public final String getOffBedTime() {
            return this.offBedTime;
        }

        @tb1
        public final String getOnBedTime() {
            return this.onBedTime;
        }

        @tb1
        public final String getRecordTime() {
            return this.recordTime;
        }

        @aa1
        public final String getSleepDataId() {
            return this.sleepDataId;
        }

        public final int getSleepDataType() {
            return this.sleepDataType;
        }

        @tb1
        public final String getSleepEndTime() {
            return this.sleepEndTime;
        }

        @tb1
        public final String getSleepStartTime() {
            return this.sleepStartTime;
        }

        @tb1
        public final List<Integer> getSleepStatusArr() {
            return this.sleepStatusArr;
        }

        @tb1
        public final List<Object> getTurnOverArray() {
            return this.turnOverArray;
        }

        @tb1
        public final Integer getTurningOverCount() {
            return this.turningOverCount;
        }

        public int hashCode() {
            int r0 = ((this.sleepDataId.hashCode() * 31) + Integer.hashCode(this.sleepDataType)) * 31;
            String r1 = this.onBedTime;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r3 = 0;
        L6:
            int r4 = (r0 + r3) * 31;
            String r5 = this.sleepStartTime;
            if (r5 != null) goto L9;
            int r6 = 0;
        L10:
            int r7 = (r4 + r6) * 31;
            String r8 = this.sleepEndTime;
            if (r8 != null) goto L13;
            int r9 = 0;
        L14:
            int r10 = (r7 + r9) * 31;
            String r11 = this.offBedTime;
            if (r11 != null) goto L17;
            int r12 = 0;
        L18:
            int r13 = (r10 + r12) * 31;
            Integer r14 = this.offBedFrequency;
            if (r14 != null) goto L21;
            int r15 = 0;
        L22:
            int r16 = (r13 + r15) * 31;
            Integer r17 = this.offBedDuration;
            if (r17 != null) goto L25;
            int r18 = 0;
        L26:
            int r19 = (r16 + r18) * 31;
            Integer r20 = this.bodyMoveCount;
            if (r20 != null) goto L29;
            int r21 = 0;
        L30:
            int r22 = (r19 + r21) * 31;
            Integer r23 = this.turningOverCount;
            if (r23 != null) goto L33;
            int r24 = 0;
        L34:
            int r25 = (r22 + r24) * 31;
            Integer r26 = this.awakeCount;
            if (r26 != null) goto L37;
            int r27 = 0;
        L38:
            int r28 = (r25 + r27) * 31;
            Integer r29 = this.awakeDuration;
            if (r29 != null) goto L41;
            int r30 = 0;
        L42:
            int r31 = (r28 + r30) * 31;
            String r32 = this.recordTime;
            if (r32 != null) goto L45;
            int r33 = 0;
        L46:
            int r34 = (r31 + r33) * 31;
            List<Integer> r35 = this.sleepStatusArr;
            if (r35 != null) goto L49;
            int r36 = 0;
        L50:
            int r37 = (r34 + r36) * 31;
            List<? extends Object> r38 = this.heartRateArr;
            if (r38 != null) goto L53;
            int r39 = 0;
        L54:
            int r40 = (r37 + r39) * 31;
            List<? extends Object> r41 = this.breathRateArr;
            if (r41 != null) goto L57;
            int r42 = 0;
        L58:
            int r43 = (r40 + r42) * 31;
            List<? extends Object> r44 = this.apneaArray;
            if (r44 != null) goto L61;
            int r45 = 0;
        L62:
            int r46 = (r43 + r45) * 31;
            List<? extends Object> r47 = this.turnOverArray;
            if (r47 == null) goto L67;
            r2 = r47.hashCode();
        L67:
            return r46 + r2;
        L61:
            r45 = r44.hashCode();
            goto L62
        L57:
            r42 = r41.hashCode();
            goto L58
        L53:
            r39 = r38.hashCode();
            goto L54
        L49:
            r36 = r35.hashCode();
            goto L50
        L45:
            r33 = r32.hashCode();
            goto L46
        L41:
            r30 = r29.hashCode();
            goto L42
        L37:
            r27 = r26.hashCode();
            goto L38
        L33:
            r24 = r23.hashCode();
            goto L34
        L29:
            r21 = r20.hashCode();
            goto L30
        L25:
            r18 = r17.hashCode();
            goto L26
        L21:
            r15 = r14.hashCode();
            goto L22
        L17:
            r12 = r11.hashCode();
            goto L18
        L13:
            r9 = r8.hashCode();
            goto L14
        L9:
            r6 = r5.hashCode();
            goto L10
        L5:
            r3 = r1.hashCode();
            goto L6
        }

        public final void setApneaArray(@tb1 List<? extends Object> r1) {
            this.apneaArray = r1;
        }

        public final void setAwakeCount(@tb1 Integer r1) {
            this.awakeCount = r1;
        }

        public final void setAwakeDuration(@tb1 Integer r1) {
            this.awakeDuration = r1;
        }

        public final void setBodyMoveCount(@tb1 Integer r1) {
            this.bodyMoveCount = r1;
        }

        public final void setBreathRateArr(@tb1 List<? extends Object> r1) {
            this.breathRateArr = r1;
        }

        public final void setHeartRateArr(@tb1 List<? extends Object> r1) {
            this.heartRateArr = r1;
        }

        public final void setOffBedDuration(@tb1 Integer r1) {
            this.offBedDuration = r1;
        }

        public final void setOffBedFrequency(@tb1 Integer r1) {
            this.offBedFrequency = r1;
        }

        public final void setOffBedTime(@tb1 String r1) {
            this.offBedTime = r1;
        }

        public final void setOnBedTime(@tb1 String r1) {
            this.onBedTime = r1;
        }

        public final void setRecordTime(@tb1 String r1) {
            this.recordTime = r1;
        }

        public final void setSleepDataId(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.sleepDataId = r2;
        }

        public final void setSleepDataType(int r1) {
            this.sleepDataType = r1;
        }

        public final void setSleepEndTime(@tb1 String r1) {
            this.sleepEndTime = r1;
        }

        public final void setSleepStartTime(@tb1 String r1) {
            this.sleepStartTime = r1;
        }

        public final void setSleepStatusArr(@tb1 List<Integer> r1) {
            this.sleepStatusArr = r1;
        }

        public final void setTurnOverArray(@tb1 List<? extends Object> r1) {
            this.turnOverArray = r1;
        }

        public final void setTurningOverCount(@tb1 Integer r1) {
            this.turningOverCount = r1;
        }

        @aa1
        public String toString() {
            return "SleepData(sleepDataId=" + this.sleepDataId + ", sleepDataType=" + this.sleepDataType + ", onBedTime=" + this.onBedTime + ", sleepStartTime=" + this.sleepStartTime + ", sleepEndTime=" + this.sleepEndTime + ", offBedTime=" + this.offBedTime + ", offBedFrequency=" + this.offBedFrequency + ", offBedDuration=" + this.offBedDuration + ", bodyMoveCount=" + this.bodyMoveCount + ", turningOverCount=" + this.turningOverCount + ", awakeCount=" + this.awakeCount + ", awakeDuration=" + this.awakeDuration + ", recordTime=" + this.recordTime + ", sleepStatusArr=" + this.sleepStatusArr + ", heartRateArr=" + this.heartRateArr + ", breathRateArr=" + this.breathRateArr + ", apneaArray=" + this.apneaArray + ", turnOverArray=" + this.turnOverArray + I000IiI1O.iO.iO;
        }

        public /* synthetic */ SleepData(String r23, int r24, String r25, String r26, String r27, String r28, Integer r29, Integer r30, Integer r31, Integer r32, Integer r33, Integer r34, String r35, List r36, List r37, List r38, List r39, List r40, int r41, DefaultConstructorMarker r42) {
            if ((r41 & 4) == 0) goto L5;
            String r6 = null;
        L7:
            if ((r41 & 8) == 0) goto L9;
            String r7 = null;
        L11:
            if ((r41 & 16) == 0) goto L13;
            String r8 = null;
        L15:
            if ((r41 & 32) == 0) goto L17;
            String r9 = null;
        L19:
            if ((r41 & 64) == 0) goto L21;
            Integer r10 = null;
        L23:
            if ((r41 & 128) == 0) goto L25;
            Integer r11 = null;
        L27:
            if ((r41 & 256) == 0) goto L29;
            Integer r12 = null;
        L31:
            if ((r41 & 512) == 0) goto L33;
            Integer r13 = null;
        L35:
            if ((r41 & 1024) == 0) goto L37;
            Integer r14 = null;
        L39:
            if ((r41 & 2048) == 0) goto L41;
            Integer r15 = null;
        L43:
            if ((r41 & 4096) == 0) goto L45;
            String r16 = null;
        L47:
            if ((r41 & 8192) == 0) goto L49;
            List r17 = null;
        L51:
            if ((r41 & 16384) == 0) goto L53;
            List r18 = null;
        L55:
            if ((32768 & r41) == 0) goto L57;
            List r19 = null;
        L59:
            if ((65536 & r41) == 0) goto L61;
            List r20 = null;
        L63:
            if ((r41 & 131072) == 0) goto L66;
            List r21 = null;
        L67:
            this(r23, r24, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
            return;
        L66:
            r21 = r40;
            goto L67
        L61:
            r20 = r39;
            goto L63
        L57:
            r19 = r38;
            goto L59
        L53:
            r18 = r37;
            goto L55
        L49:
            r17 = r36;
            goto L51
        L45:
            r16 = r35;
            goto L47
        L41:
            r15 = r34;
            goto L43
        L37:
            r14 = r33;
            goto L39
        L33:
            r13 = r32;
            goto L35
        L29:
            r12 = r31;
            goto L31
        L25:
            r11 = r30;
            goto L27
        L21:
            r10 = r29;
            goto L23
        L17:
            r9 = r28;
            goto L19
        L13:
            r8 = r27;
            goto L15
        L9:
            r7 = r26;
            goto L11
        L5:
            r6 = r25;
            goto L7
        }
    }

    static {
        INSTANCE = new UploadSleepDataHYKY();
    }

    private UploadSleepDataHYKY() {
    }
}
