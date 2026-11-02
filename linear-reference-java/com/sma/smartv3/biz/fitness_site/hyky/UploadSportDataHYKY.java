package com.sma.smartv3.biz.fitness_site.hyky;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.X0XIi10;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bm;
import com.android.mltcode.paycertificationapi.tb1;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.sma.smartv3.network.GetGomoreAuthKey;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class UploadSportDataHYKY {

    @aa1
    public static final UploadSportDataHYKY INSTANCE = null;

    @aa1
    public static final String URL = "/ac-health-data/thirdPlatform/userDevice/general/dataReport/sportData";

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
        private String sn;

        @aa1
        private Object sportData;

        public BodyData(@aa1 String r2, int r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 Object r8) {
            Intrinsics.X0O(r2, "phone");
            Intrinsics.X0O(r4, GetGomoreAuthKey.DEVICE_ID);
            Intrinsics.X0O(r5, "cmei");
            Intrinsics.X0O(r6, "sn");
            Intrinsics.X0O(r7, "mac");
            Intrinsics.X0O(r8, "sportData");
            this.phone = r2;
            this.deviceType = r3;
            this.deviceId = r4;
            this.cmei = r5;
            this.sn = r6;
            this.mac = r7;
            this.sportData = r8;
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
            r7 = r0.sportData;
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
            return this.sportData;
        }

        @aa1
        public final BodyData copy(@aa1 String r10, int r11, @aa1 String r12, @aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 Object r16) {
            Intrinsics.X0O(r10, "phone");
            Intrinsics.X0O(r12, GetGomoreAuthKey.DEVICE_ID);
            Intrinsics.X0O(r13, "cmei");
            Intrinsics.X0O(r14, "sn");
            Intrinsics.X0O(r15, "mac");
            Intrinsics.X0O(r16, "sportData");
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
            if (Intrinsics.XOO0ii0(this.sportData, r6.sportData) == true) goto L29;
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
        public final String getSn() {
            return this.sn;
        }

        @aa1
        public final Object getSportData() {
            return this.sportData;
        }

        public int hashCode() {
            return (((((((((((this.phone.hashCode() * 31) + Integer.hashCode(this.deviceType)) * 31) + this.deviceId.hashCode()) * 31) + this.cmei.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.mac.hashCode()) * 31) + this.sportData.hashCode();
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

        public final void setSn(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.sn = r2;
        }

        public final void setSportData(@aa1 Object r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.sportData = r2;
        }

        @aa1
        public String toString() {
            return "BodyData(phone=" + this.phone + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", cmei=" + this.cmei + ", sn=" + this.sn + ", mac=" + this.mac + ", sportData=" + this.sportData + I000IiI1O.iO.iO;
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

    public static final class Hr {
        private int hr;
        private int tm;

        public Hr(int r1, int r2) {
            this.tm = r1;
            this.hr = r2;
        }

        public static /* synthetic */ Hr copy$default(Hr r0, int r1, int r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.tm;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.hr;
        L9:
            return r0.copy(r1, r2);
        }

        public final int component1() {
            return this.tm;
        }

        public final int component2() {
            return this.hr;
        }

        @aa1
        public final Hr copy(int r2, int r3) {
            return new Hr(r2, r3);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Hr) == true) goto L8;
            return false;
        L8:
            Hr r6 = (Hr) r5;
            if (this.tm == r6.tm) goto L12;
            return false;
        L12:
            if (this.hr == r6.hr) goto L14;
            return false;
        L14:
            return true;
        }

        public final int getHr() {
            return this.hr;
        }

        public final int getTm() {
            return this.tm;
        }

        public int hashCode() {
            return (Integer.hashCode(this.tm) * 31) + Integer.hashCode(this.hr);
        }

        public final void setHr(int r1) {
            this.hr = r1;
        }

        public final void setTm(int r1) {
            this.tm = r1;
        }

        @aa1
        public String toString() {
            return "Hr(tm=" + this.tm + ", hr=" + this.hr + I000IiI1O.iO.iO;
        }
    }

    public static final class Pace {
        private int pc;
        private int seq;

        public Pace(int r1, int r2) {
            this.seq = r1;
            this.pc = r2;
        }

        public static /* synthetic */ Pace copy$default(Pace r0, int r1, int r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.seq;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.pc;
        L9:
            return r0.copy(r1, r2);
        }

        public final int component1() {
            return this.seq;
        }

        public final int component2() {
            return this.pc;
        }

        @aa1
        public final Pace copy(int r2, int r3) {
            return new Pace(r2, r3);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Pace) == true) goto L8;
            return false;
        L8:
            Pace r6 = (Pace) r5;
            if (this.seq == r6.seq) goto L12;
            return false;
        L12:
            if (this.pc == r6.pc) goto L14;
            return false;
        L14:
            return true;
        }

        public final int getPc() {
            return this.pc;
        }

        public final int getSeq() {
            return this.seq;
        }

        public int hashCode() {
            return (Integer.hashCode(this.seq) * 31) + Integer.hashCode(this.pc);
        }

        public final void setPc(int r1) {
            this.pc = r1;
        }

        public final void setSeq(int r1) {
            this.seq = r1;
        }

        @aa1
        public String toString() {
            return "Pace(seq=" + this.seq + ", pc=" + this.pc + I000IiI1O.iO.iO;
        }
    }

    public static final class Pos {

        @aa1
        private String lc;
        private int tm;

        public Pos(int r2, @aa1 String r3) {
            Intrinsics.X0O(r3, "lc");
            this.tm = r2;
            this.lc = r3;
        }

        public static /* synthetic */ Pos copy$default(Pos r0, int r1, String r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.tm;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.lc;
        L9:
            return r0.copy(r1, r2);
        }

        public final int component1() {
            return this.tm;
        }

        @aa1
        public final String component2() {
            return this.lc;
        }

        @aa1
        public final Pos copy(int r2, @aa1 String r3) {
            Intrinsics.X0O(r3, "lc");
            return new Pos(r2, r3);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Pos) == true) goto L8;
            return false;
        L8:
            Pos r6 = (Pos) r5;
            if (this.tm == r6.tm) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.lc, r6.lc) == true) goto L14;
            return false;
        L14:
            return true;
        }

        @aa1
        public final String getLc() {
            return this.lc;
        }

        public final int getTm() {
            return this.tm;
        }

        public int hashCode() {
            return (Integer.hashCode(this.tm) * 31) + this.lc.hashCode();
        }

        public final void setLc(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.lc = r2;
        }

        public final void setTm(int r1) {
            this.tm = r1;
        }

        @aa1
        public String toString() {
            return "Pos(tm=" + this.tm + ", lc=" + this.lc + I000IiI1O.iO.iO;
        }
    }

    public static final class SportData {

        @aa1
        private String endTime;

        @tb1
        private List<Hr> hrList;

        @tb1
        private List<Pace> paceList;

        @tb1
        private List<Pos> posList;

        @tb1
        private String posType;

        @aa1
        private String recordTime;

        @aa1
        private String sportDataId;
        private int sportDataType;

        @tb1
        private SportOverView sportOverView;
        private int sportType;

        @aa1
        private String startTime;

        @tb1
        private List<StepFreq> stepFreqList;

        public SportData(int r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, int r6, @aa1 String r7, @tb1 SportOverView r8, @tb1 String r9, @tb1 List<Hr> r10, @tb1 List<Pos> r11, @tb1 List<StepFreq> r12, @tb1 List<Pace> r13) {
            Intrinsics.X0O(r3, "startTime");
            Intrinsics.X0O(r4, SDKConstants.PARAM_END_TIME);
            Intrinsics.X0O(r5, "sportDataId");
            Intrinsics.X0O(r7, "recordTime");
            this.sportType = r2;
            this.startTime = r3;
            this.endTime = r4;
            this.sportDataId = r5;
            this.sportDataType = r6;
            this.recordTime = r7;
            this.sportOverView = r8;
            this.posType = r9;
            this.hrList = r10;
            this.posList = r11;
            this.stepFreqList = r12;
            this.paceList = r13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SportData copy$default(SportData r0, int r1, String r2, String r3, String r4, int r5, String r6, SportOverView r7, String r8, List r9, List r10, List r11, List r12, int r13, Object r14) {
            if ((r13 & 1) == 0) goto L6;
            r1 = r0.sportType;
        L6:
            if ((r13 & 2) == 0) goto L9;
            r2 = r0.startTime;
        L9:
            if ((r13 & 4) == 0) goto L12;
            r3 = r0.endTime;
        L12:
            if ((r13 & 8) == 0) goto L15;
            r4 = r0.sportDataId;
        L15:
            if ((r13 & 16) == 0) goto L18;
            r5 = r0.sportDataType;
        L18:
            if ((r13 & 32) == 0) goto L21;
            r6 = r0.recordTime;
        L21:
            if ((r13 & 64) == 0) goto L24;
            r7 = r0.sportOverView;
        L24:
            if ((r13 & 128) == 0) goto L27;
            r8 = r0.posType;
        L27:
            if ((r13 & 256) == 0) goto L30;
            r9 = r0.hrList;
        L30:
            if ((r13 & 512) == 0) goto L33;
            r10 = r0.posList;
        L33:
            if ((r13 & 1024) == 0) goto L36;
            r11 = r0.stepFreqList;
        L36:
            if ((r13 & 2048) == 0) goto L38;
            r12 = r0.paceList;
        L38:
            List r15 = r11;
            List r16 = r12;
            List r17 = r9;
            List r18 = r10;
            SportOverView r19 = r7;
            String r110 = r8;
            int r20 = r5;
            String r21 = r6;
            String r22 = r3;
            String r23 = r4;
            return r0.copy(r1, r2, r22, r23, r20, r21, r19, r110, r17, r18, r15, r16);
        }

        public final int component1() {
            return this.sportType;
        }

        @tb1
        public final List<Pos> component10() {
            return this.posList;
        }

        @tb1
        public final List<StepFreq> component11() {
            return this.stepFreqList;
        }

        @tb1
        public final List<Pace> component12() {
            return this.paceList;
        }

        @aa1
        public final String component2() {
            return this.startTime;
        }

        @aa1
        public final String component3() {
            return this.endTime;
        }

        @aa1
        public final String component4() {
            return this.sportDataId;
        }

        public final int component5() {
            return this.sportDataType;
        }

        @aa1
        public final String component6() {
            return this.recordTime;
        }

        @tb1
        public final SportOverView component7() {
            return this.sportOverView;
        }

        @tb1
        public final String component8() {
            return this.posType;
        }

        @tb1
        public final List<Hr> component9() {
            return this.hrList;
        }

        @aa1
        public final SportData copy(int r15, @aa1 String r16, @aa1 String r17, @aa1 String r18, int r19, @aa1 String r20, @tb1 SportOverView r21, @tb1 String r22, @tb1 List<Hr> r23, @tb1 List<Pos> r24, @tb1 List<StepFreq> r25, @tb1 List<Pace> r26) {
            Intrinsics.X0O(r16, "startTime");
            Intrinsics.X0O(r17, SDKConstants.PARAM_END_TIME);
            Intrinsics.X0O(r18, "sportDataId");
            Intrinsics.X0O(r20, "recordTime");
            return new SportData(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof SportData) == true) goto L8;
            return false;
        L8:
            SportData r6 = (SportData) r5;
            if (this.sportType == r6.sportType) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.startTime, r6.startTime) == true) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.endTime, r6.endTime) == true) goto L18;
            return false;
        L18:
            if (Intrinsics.XOO0ii0(this.sportDataId, r6.sportDataId) == true) goto L21;
            return false;
        L21:
            if (this.sportDataType == r6.sportDataType) goto L24;
            return false;
        L24:
            if (Intrinsics.XOO0ii0(this.recordTime, r6.recordTime) == true) goto L27;
            return false;
        L27:
            if (Intrinsics.XOO0ii0(this.sportOverView, r6.sportOverView) == true) goto L30;
            return false;
        L30:
            if (Intrinsics.XOO0ii0(this.posType, r6.posType) == true) goto L33;
            return false;
        L33:
            if (Intrinsics.XOO0ii0(this.hrList, r6.hrList) == true) goto L36;
            return false;
        L36:
            if (Intrinsics.XOO0ii0(this.posList, r6.posList) == true) goto L39;
            return false;
        L39:
            if (Intrinsics.XOO0ii0(this.stepFreqList, r6.stepFreqList) == true) goto L42;
            return false;
        L42:
            if (Intrinsics.XOO0ii0(this.paceList, r6.paceList) == true) goto L44;
            return false;
        L44:
            return true;
        }

        @aa1
        public final String getEndTime() {
            return this.endTime;
        }

        @tb1
        public final List<Hr> getHrList() {
            return this.hrList;
        }

        @tb1
        public final List<Pace> getPaceList() {
            return this.paceList;
        }

        @tb1
        public final List<Pos> getPosList() {
            return this.posList;
        }

        @tb1
        public final String getPosType() {
            return this.posType;
        }

        @aa1
        public final String getRecordTime() {
            return this.recordTime;
        }

        @aa1
        public final String getSportDataId() {
            return this.sportDataId;
        }

        public final int getSportDataType() {
            return this.sportDataType;
        }

        @tb1
        public final SportOverView getSportOverView() {
            return this.sportOverView;
        }

        public final int getSportType() {
            return this.sportType;
        }

        @aa1
        public final String getStartTime() {
            return this.startTime;
        }

        @tb1
        public final List<StepFreq> getStepFreqList() {
            return this.stepFreqList;
        }

        public int hashCode() {
            int r0 = ((((((((((Integer.hashCode(this.sportType) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31) + this.sportDataId.hashCode()) * 31) + Integer.hashCode(this.sportDataType)) * 31) + this.recordTime.hashCode()) * 31;
            SportOverView r1 = this.sportOverView;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r3 = 0;
        L6:
            int r4 = (r0 + r3) * 31;
            String r5 = this.posType;
            if (r5 != null) goto L9;
            int r6 = 0;
        L10:
            int r7 = (r4 + r6) * 31;
            List<Hr> r8 = this.hrList;
            if (r8 != null) goto L13;
            int r9 = 0;
        L14:
            int r10 = (r7 + r9) * 31;
            List<Pos> r11 = this.posList;
            if (r11 != null) goto L17;
            int r12 = 0;
        L18:
            int r13 = (r10 + r12) * 31;
            List<StepFreq> r14 = this.stepFreqList;
            if (r14 != null) goto L21;
            int r15 = 0;
        L22:
            int r16 = (r13 + r15) * 31;
            List<Pace> r17 = this.paceList;
            if (r17 == null) goto L27;
            r2 = r17.hashCode();
        L27:
            return r16 + r2;
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

        public final void setEndTime(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.endTime = r2;
        }

        public final void setHrList(@tb1 List<Hr> r1) {
            this.hrList = r1;
        }

        public final void setPaceList(@tb1 List<Pace> r1) {
            this.paceList = r1;
        }

        public final void setPosList(@tb1 List<Pos> r1) {
            this.posList = r1;
        }

        public final void setPosType(@tb1 String r1) {
            this.posType = r1;
        }

        public final void setRecordTime(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.recordTime = r2;
        }

        public final void setSportDataId(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.sportDataId = r2;
        }

        public final void setSportDataType(int r1) {
            this.sportDataType = r1;
        }

        public final void setSportOverView(@tb1 SportOverView r1) {
            this.sportOverView = r1;
        }

        public final void setSportType(int r1) {
            this.sportType = r1;
        }

        public final void setStartTime(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.startTime = r2;
        }

        public final void setStepFreqList(@tb1 List<StepFreq> r1) {
            this.stepFreqList = r1;
        }

        @aa1
        public String toString() {
            return "SportData(sportType=" + this.sportType + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", sportDataId=" + this.sportDataId + ", sportDataType=" + this.sportDataType + ", recordTime=" + this.recordTime + ", sportOverView=" + this.sportOverView + ", posType=" + this.posType + ", hrList=" + this.hrList + ", posList=" + this.posList + ", stepFreqList=" + this.stepFreqList + ", paceList=" + this.paceList + I000IiI1O.iO.iO;
        }

        public /* synthetic */ SportData(int r2, String r3, String r4, String r5, int r6, String r7, SportOverView r8, String r9, List r10, List r11, List r12, List r13, int r14, DefaultConstructorMarker r15) {
            if ((r14 & 1) == 0) goto L6;
            r2 = SportType.OTHER.getValue();
        L6:
            if ((r14 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r14 & 4) == 0) goto L12;
            r4 = "";
        L12:
            if ((r14 & 8) == 0) goto L15;
            r5 = "";
        L15:
            if ((r14 & 16) == 0) goto L18;
            r6 = 1;
        L18:
            if ((r14 & 32) == 0) goto L21;
            r7 = "";
        L21:
            if ((r14 & 128) == 0) goto L24;
            r9 = null;
        L24:
            if ((r14 & 256) == 0) goto L27;
            r10 = null;
        L27:
            if ((r14 & 512) == 0) goto L30;
            r11 = null;
        L30:
            if ((r14 & 1024) == 0) goto L33;
            r12 = null;
        L33:
            if ((r14 & 2048) == 0) goto L35;
            List r16 = null;
        L36:
            this(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r16);
            return;
        L35:
            r16 = r13;
            goto L36
        }
    }

    public static final class SportOverView {

        @tb1
        private Integer avgHr;

        @tb1
        private Integer calorie;

        @tb1
        private Integer declineTotal;

        @tb1
        private Integer distance;

        @tb1
        private Integer duration;

        @tb1
        private Integer maxHr;

        @tb1
        private Integer minHr;

        @tb1
        private Integer riseTotal;

        @tb1
        private Integer roundCount;

        @tb1
        private String sportName;

        @tb1
        private Integer stepCount;

        @tb1
        private Integer stepFreq;

        @tb1
        private Integer swingFreq;

        @tb1
        private Integer swolf;

        public SportOverView() {
            Integer r1 = null;
            Integer r2 = null;
            Integer r3 = null;
            Integer r4 = null;
            Integer r5 = null;
            Integer r6 = null;
            Integer r7 = null;
            Integer r8 = null;
            Integer r9 = null;
            Integer r10 = null;
            Integer r11 = null;
            Integer r12 = null;
            String r13 = null;
            Integer r14 = null;
            this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, bm.OXO1, null);
        }

        public static /* synthetic */ SportOverView copy$default(SportOverView r14, Integer r15, Integer r16, Integer r17, Integer r18, Integer r19, Integer r20, Integer r21, Integer r22, Integer r23, Integer r24, Integer r25, Integer r26, String r27, Integer r28, int r29, Object r30) {
            if ((r29 & 1) == 0) goto L5;
            Integer r1 = r14.stepCount;
        L7:
            if ((r29 & 2) == 0) goto L9;
            Integer r2 = r14.stepFreq;
        L11:
            if ((r29 & 4) == 0) goto L13;
            Integer r3 = r14.riseTotal;
        L15:
            if ((r29 & 8) == 0) goto L17;
            Integer r4 = r14.declineTotal;
        L19:
            if ((r29 & 16) == 0) goto L21;
            Integer r5 = r14.roundCount;
        L23:
            if ((r29 & 32) == 0) goto L25;
            Integer r6 = r14.swingFreq;
        L27:
            if ((r29 & 64) == 0) goto L29;
            Integer r7 = r14.swolf;
        L31:
            if ((r29 & 128) == 0) goto L33;
            Integer r8 = r14.duration;
        L35:
            if ((r29 & 256) == 0) goto L37;
            Integer r9 = r14.calorie;
        L39:
            if ((r29 & 512) == 0) goto L41;
            Integer r10 = r14.avgHr;
        L43:
            if ((r29 & 1024) == 0) goto L45;
            Integer r11 = r14.maxHr;
        L47:
            if ((r29 & 2048) == 0) goto L49;
            Integer r12 = r14.minHr;
        L51:
            if ((r29 & 4096) == 0) goto L53;
            String r13 = r14.sportName;
        L55:
            if ((r29 & 8192) == 0) goto L58;
            Integer r210 = r14.distance;
        L60:
            return r14.copy(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r210);
        L58:
            r210 = r28;
            goto L60
        L53:
            r13 = r27;
            goto L55
        L49:
            r12 = r26;
            goto L51
        L45:
            r11 = r25;
            goto L47
        L41:
            r10 = r24;
            goto L43
        L37:
            r9 = r23;
            goto L39
        L33:
            r8 = r22;
            goto L35
        L29:
            r7 = r21;
            goto L31
        L25:
            r6 = r20;
            goto L27
        L21:
            r5 = r19;
            goto L23
        L17:
            r4 = r18;
            goto L19
        L13:
            r3 = r17;
            goto L15
        L9:
            r2 = r16;
            goto L11
        L5:
            r1 = r15;
            goto L7
        }

        @tb1
        public final Integer component1() {
            return this.stepCount;
        }

        @tb1
        public final Integer component10() {
            return this.avgHr;
        }

        @tb1
        public final Integer component11() {
            return this.maxHr;
        }

        @tb1
        public final Integer component12() {
            return this.minHr;
        }

        @tb1
        public final String component13() {
            return this.sportName;
        }

        @tb1
        public final Integer component14() {
            return this.distance;
        }

        @tb1
        public final Integer component2() {
            return this.stepFreq;
        }

        @tb1
        public final Integer component3() {
            return this.riseTotal;
        }

        @tb1
        public final Integer component4() {
            return this.declineTotal;
        }

        @tb1
        public final Integer component5() {
            return this.roundCount;
        }

        @tb1
        public final Integer component6() {
            return this.swingFreq;
        }

        @tb1
        public final Integer component7() {
            return this.swolf;
        }

        @tb1
        public final Integer component8() {
            return this.duration;
        }

        @tb1
        public final Integer component9() {
            return this.calorie;
        }

        @aa1
        public final SportOverView copy(@tb1 Integer r16, @tb1 Integer r17, @tb1 Integer r18, @tb1 Integer r19, @tb1 Integer r20, @tb1 Integer r21, @tb1 Integer r22, @tb1 Integer r23, @tb1 Integer r24, @tb1 Integer r25, @tb1 Integer r26, @tb1 Integer r27, @tb1 String r28, @tb1 Integer r29) {
            return new SportOverView(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof SportOverView) == true) goto L8;
            return false;
        L8:
            SportOverView r6 = (SportOverView) r5;
            if (Intrinsics.XOO0ii0(this.stepCount, r6.stepCount) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.stepFreq, r6.stepFreq) == true) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.riseTotal, r6.riseTotal) == true) goto L18;
            return false;
        L18:
            if (Intrinsics.XOO0ii0(this.declineTotal, r6.declineTotal) == true) goto L21;
            return false;
        L21:
            if (Intrinsics.XOO0ii0(this.roundCount, r6.roundCount) == true) goto L24;
            return false;
        L24:
            if (Intrinsics.XOO0ii0(this.swingFreq, r6.swingFreq) == true) goto L27;
            return false;
        L27:
            if (Intrinsics.XOO0ii0(this.swolf, r6.swolf) == true) goto L30;
            return false;
        L30:
            if (Intrinsics.XOO0ii0(this.duration, r6.duration) == true) goto L33;
            return false;
        L33:
            if (Intrinsics.XOO0ii0(this.calorie, r6.calorie) == true) goto L36;
            return false;
        L36:
            if (Intrinsics.XOO0ii0(this.avgHr, r6.avgHr) == true) goto L39;
            return false;
        L39:
            if (Intrinsics.XOO0ii0(this.maxHr, r6.maxHr) == true) goto L42;
            return false;
        L42:
            if (Intrinsics.XOO0ii0(this.minHr, r6.minHr) == true) goto L45;
            return false;
        L45:
            if (Intrinsics.XOO0ii0(this.sportName, r6.sportName) == true) goto L48;
            return false;
        L48:
            if (Intrinsics.XOO0ii0(this.distance, r6.distance) == true) goto L50;
            return false;
        L50:
            return true;
        }

        @tb1
        public final Integer getAvgHr() {
            return this.avgHr;
        }

        @tb1
        public final Integer getCalorie() {
            return this.calorie;
        }

        @tb1
        public final Integer getDeclineTotal() {
            return this.declineTotal;
        }

        @tb1
        public final Integer getDistance() {
            return this.distance;
        }

        @tb1
        public final Integer getDuration() {
            return this.duration;
        }

        @tb1
        public final Integer getMaxHr() {
            return this.maxHr;
        }

        @tb1
        public final Integer getMinHr() {
            return this.minHr;
        }

        @tb1
        public final Integer getRiseTotal() {
            return this.riseTotal;
        }

        @tb1
        public final Integer getRoundCount() {
            return this.roundCount;
        }

        @tb1
        public final String getSportName() {
            return this.sportName;
        }

        @tb1
        public final Integer getStepCount() {
            return this.stepCount;
        }

        @tb1
        public final Integer getStepFreq() {
            return this.stepFreq;
        }

        @tb1
        public final Integer getSwingFreq() {
            return this.swingFreq;
        }

        @tb1
        public final Integer getSwolf() {
            return this.swolf;
        }

        public int hashCode() {
            Integer r0 = this.stepCount;
            int r1 = 0;
            if (r0 != null) goto L5;
            int r2 = 0;
        L6:
            int r3 = r2 * 31;
            Integer r4 = this.stepFreq;
            if (r4 != null) goto L9;
            int r5 = 0;
        L10:
            int r6 = (r3 + r5) * 31;
            Integer r7 = this.riseTotal;
            if (r7 != null) goto L13;
            int r8 = 0;
        L14:
            int r9 = (r6 + r8) * 31;
            Integer r10 = this.declineTotal;
            if (r10 != null) goto L17;
            int r11 = 0;
        L18:
            int r12 = (r9 + r11) * 31;
            Integer r13 = this.roundCount;
            if (r13 != null) goto L21;
            int r14 = 0;
        L22:
            int r15 = (r12 + r14) * 31;
            Integer r16 = this.swingFreq;
            if (r16 != null) goto L25;
            int r17 = 0;
        L26:
            int r18 = (r15 + r17) * 31;
            Integer r19 = this.swolf;
            if (r19 != null) goto L29;
            int r20 = 0;
        L30:
            int r21 = (r18 + r20) * 31;
            Integer r22 = this.duration;
            if (r22 != null) goto L33;
            int r23 = 0;
        L34:
            int r24 = (r21 + r23) * 31;
            Integer r25 = this.calorie;
            if (r25 != null) goto L37;
            int r26 = 0;
        L38:
            int r27 = (r24 + r26) * 31;
            Integer r28 = this.avgHr;
            if (r28 != null) goto L41;
            int r29 = 0;
        L42:
            int r30 = (r27 + r29) * 31;
            Integer r31 = this.maxHr;
            if (r31 != null) goto L45;
            int r32 = 0;
        L46:
            int r33 = (r30 + r32) * 31;
            Integer r34 = this.minHr;
            if (r34 != null) goto L49;
            int r35 = 0;
        L50:
            int r36 = (r33 + r35) * 31;
            String r37 = this.sportName;
            if (r37 != null) goto L53;
            int r38 = 0;
        L54:
            int r39 = (r36 + r38) * 31;
            Integer r40 = this.distance;
            if (r40 == null) goto L59;
            r1 = r40.hashCode();
        L59:
            return r39 + r1;
        L53:
            r38 = r37.hashCode();
            goto L54
        L49:
            r35 = r34.hashCode();
            goto L50
        L45:
            r32 = r31.hashCode();
            goto L46
        L41:
            r29 = r28.hashCode();
            goto L42
        L37:
            r26 = r25.hashCode();
            goto L38
        L33:
            r23 = r22.hashCode();
            goto L34
        L29:
            r20 = r19.hashCode();
            goto L30
        L25:
            r17 = r16.hashCode();
            goto L26
        L21:
            r14 = r13.hashCode();
            goto L22
        L17:
            r11 = r10.hashCode();
            goto L18
        L13:
            r8 = r7.hashCode();
            goto L14
        L9:
            r5 = r4.hashCode();
            goto L10
        L5:
            r2 = r0.hashCode();
            goto L6
        }

        public final void setAvgHr(@tb1 Integer r1) {
            this.avgHr = r1;
        }

        public final void setCalorie(@tb1 Integer r1) {
            this.calorie = r1;
        }

        public final void setDeclineTotal(@tb1 Integer r1) {
            this.declineTotal = r1;
        }

        public final void setDistance(@tb1 Integer r1) {
            this.distance = r1;
        }

        public final void setDuration(@tb1 Integer r1) {
            this.duration = r1;
        }

        public final void setMaxHr(@tb1 Integer r1) {
            this.maxHr = r1;
        }

        public final void setMinHr(@tb1 Integer r1) {
            this.minHr = r1;
        }

        public final void setRiseTotal(@tb1 Integer r1) {
            this.riseTotal = r1;
        }

        public final void setRoundCount(@tb1 Integer r1) {
            this.roundCount = r1;
        }

        public final void setSportName(@tb1 String r1) {
            this.sportName = r1;
        }

        public final void setStepCount(@tb1 Integer r1) {
            this.stepCount = r1;
        }

        public final void setStepFreq(@tb1 Integer r1) {
            this.stepFreq = r1;
        }

        public final void setSwingFreq(@tb1 Integer r1) {
            this.swingFreq = r1;
        }

        public final void setSwolf(@tb1 Integer r1) {
            this.swolf = r1;
        }

        @aa1
        public String toString() {
            return "SportOverView(stepCount=" + this.stepCount + ", stepFreq=" + this.stepFreq + ", riseTotal=" + this.riseTotal + ", declineTotal=" + this.declineTotal + ", roundCount=" + this.roundCount + ", swingFreq=" + this.swingFreq + ", swolf=" + this.swolf + ", duration=" + this.duration + ", calorie=" + this.calorie + ", avgHr=" + this.avgHr + ", maxHr=" + this.maxHr + ", minHr=" + this.minHr + ", sportName=" + this.sportName + ", distance=" + this.distance + I000IiI1O.iO.iO;
        }

        public SportOverView(@tb1 Integer r1, @tb1 Integer r2, @tb1 Integer r3, @tb1 Integer r4, @tb1 Integer r5, @tb1 Integer r6, @tb1 Integer r7, @tb1 Integer r8, @tb1 Integer r9, @tb1 Integer r10, @tb1 Integer r11, @tb1 Integer r12, @tb1 String r13, @tb1 Integer r14) {
            this.stepCount = r1;
            this.stepFreq = r2;
            this.riseTotal = r3;
            this.declineTotal = r4;
            this.roundCount = r5;
            this.swingFreq = r6;
            this.swolf = r7;
            this.duration = r8;
            this.calorie = r9;
            this.avgHr = r10;
            this.maxHr = r11;
            this.minHr = r12;
            this.sportName = r13;
            this.distance = r14;
        }

        public /* synthetic */ SportOverView(Integer r16, Integer r17, Integer r18, Integer r19, Integer r20, Integer r21, Integer r22, Integer r23, Integer r24, Integer r25, Integer r26, Integer r27, String r28, Integer r29, int r30, DefaultConstructorMarker r31) {
            if ((r30 & 1) == 0) goto L5;
            Integer r1 = null;
        L7:
            if ((r30 & 2) == 0) goto L9;
            Integer r3 = null;
        L11:
            if ((r30 & 4) == 0) goto L13;
            Integer r4 = null;
        L15:
            if ((r30 & 8) == 0) goto L17;
            Integer r5 = null;
        L19:
            if ((r30 & 16) == 0) goto L21;
            Integer r6 = null;
        L23:
            if ((r30 & 32) == 0) goto L25;
            Integer r7 = null;
        L27:
            if ((r30 & 64) == 0) goto L29;
            Integer r8 = null;
        L31:
            if ((r30 & 128) == 0) goto L33;
            Integer r9 = null;
        L35:
            if ((r30 & 256) == 0) goto L37;
            Integer r10 = null;
        L39:
            if ((r30 & 512) == 0) goto L41;
            Integer r11 = null;
        L43:
            if ((r30 & 1024) == 0) goto L45;
            Integer r12 = null;
        L47:
            if ((r30 & 2048) == 0) goto L49;
            Integer r13 = null;
        L51:
            if ((r30 & 4096) == 0) goto L53;
            String r14 = null;
        L55:
            if ((r30 & 8192) == 0) goto L58;
            Integer r32 = null;
        L59:
            this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r32);
            return;
        L58:
            r32 = r29;
            goto L59
        L53:
            r14 = r28;
            goto L55
        L49:
            r13 = r27;
            goto L51
        L45:
            r12 = r26;
            goto L47
        L41:
            r11 = r25;
            goto L43
        L37:
            r10 = r24;
            goto L39
        L33:
            r9 = r23;
            goto L35
        L29:
            r8 = r22;
            goto L31
        L25:
            r7 = r21;
            goto L27
        L21:
            r6 = r20;
            goto L23
        L17:
            r5 = r19;
            goto L19
        L13:
            r4 = r18;
            goto L15
        L9:
            r3 = r17;
            goto L11
        L5:
            r1 = r16;
            goto L7
        }
    }

    public static final enum SportType extends Enum<SportType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ SportType[] $VALUES = null;
        public static final SportType CYCLING = null;
        public static final SportType MOUNTAINEERING = null;
        public static final SportType OTHER = null;
        public static final SportType RUNNING = null;
        public static final SportType SKIPPING_ROPE = null;
        public static final SportType SWIM = null;
        public static final SportType WALK = null;
        private final int value;

        private static final /* synthetic */ SportType[] $values() {
            return new SportType[]{SKIPPING_ROPE, RUNNING, CYCLING, MOUNTAINEERING, SWIM, WALK, OTHER};
        }

        static {
            SKIPPING_ROPE = new SportType("SKIPPING_ROPE", 0, 1);
            RUNNING = new SportType(X0XIi10.XIi00iiXO, 1, 2);
            CYCLING = new SportType("CYCLING", 2, 3);
            MOUNTAINEERING = new SportType("MOUNTAINEERING", 3, 4);
            SWIM = new SportType("SWIM", 4, 5);
            WALK = new SportType("WALK", 5, 6);
            OTHER = new SportType("OTHER", 6, 7);
            SportType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private SportType(String r1, int r2, int r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<SportType> getEntries() {
            return $ENTRIES;
        }

        public static SportType valueOf(String r1) {
            return (SportType) Enum.valueOf(SportType.class, r1);
        }

        public static SportType[] values() {
            return (SportType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static final class StepFreq {
        private int sf;
        private int tm;

        public StepFreq(int r1, int r2) {
            this.tm = r1;
            this.sf = r2;
        }

        public static /* synthetic */ StepFreq copy$default(StepFreq r0, int r1, int r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.tm;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.sf;
        L9:
            return r0.copy(r1, r2);
        }

        public final int component1() {
            return this.tm;
        }

        public final int component2() {
            return this.sf;
        }

        @aa1
        public final StepFreq copy(int r2, int r3) {
            return new StepFreq(r2, r3);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof StepFreq) == true) goto L8;
            return false;
        L8:
            StepFreq r6 = (StepFreq) r5;
            if (this.tm == r6.tm) goto L12;
            return false;
        L12:
            if (this.sf == r6.sf) goto L14;
            return false;
        L14:
            return true;
        }

        public final int getSf() {
            return this.sf;
        }

        public final int getTm() {
            return this.tm;
        }

        public int hashCode() {
            return (Integer.hashCode(this.tm) * 31) + Integer.hashCode(this.sf);
        }

        public final void setSf(int r1) {
            this.sf = r1;
        }

        public final void setTm(int r1) {
            this.tm = r1;
        }

        @aa1
        public String toString() {
            return "StepFreq(tm=" + this.tm + ", sf=" + this.sf + I000IiI1O.iO.iO;
        }
    }

    static {
        INSTANCE = new UploadSportDataHYKY();
    }

    private UploadSportDataHYKY() {
    }
}
