package com.sma.smartv3.biz.fitness_site.hyky;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.C2263bm;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class UploadSportDataHYKY {

    @aa1
    public static final UploadSportDataHYKY INSTANCE = new UploadSportDataHYKY();

    @aa1
    public static final String URL = "/ac-health-data/thirdPlatform/userDevice/general/dataReport/sportData";

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.UploadSportDataHYKY$Hr */
    public static final class C15478Hr {

        /* JADX INFO: renamed from: hr */
        private int f50939hr;

        /* JADX INFO: renamed from: tm */
        private int f50940tm;

        public C15478Hr(int i, int i2) {
            this.f50940tm = i;
            this.f50939hr = i2;
        }

        public static /* synthetic */ C15478Hr copy$default(C15478Hr c15478Hr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = c15478Hr.f50940tm;
            }
            if ((i3 & 2) != 0) {
                i2 = c15478Hr.f50939hr;
            }
            return c15478Hr.copy(i, i2);
        }

        public final int component1() {
            return this.f50940tm;
        }

        public final int component2() {
            return this.f50939hr;
        }

        @aa1
        public final C15478Hr copy(int i, int i2) {
            return new C15478Hr(i, i2);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15478Hr)) {
                return false;
            }
            C15478Hr c15478Hr = (C15478Hr) obj;
            return this.f50940tm == c15478Hr.f50940tm && this.f50939hr == c15478Hr.f50939hr;
        }

        public final int getHr() {
            return this.f50939hr;
        }

        public final int getTm() {
            return this.f50940tm;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f50940tm) * 31) + Integer.hashCode(this.f50939hr);
        }

        public final void setHr(int i) {
            this.f50939hr = i;
        }

        public final void setTm(int i) {
            this.f50940tm = i;
        }

        @aa1
        public String toString() {
            return "Hr(tm=" + this.f50940tm + ", hr=" + this.f50939hr + I000IiI1O.C2156iO.f1007iO;
        }
    }

    public static final class Pace {

        /* JADX INFO: renamed from: pc */
        private int f50941pc;
        private int seq;

        public Pace(int i, int i2) {
            this.seq = i;
            this.f50941pc = i2;
        }

        public static /* synthetic */ Pace copy$default(Pace pace, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = pace.seq;
            }
            if ((i3 & 2) != 0) {
                i2 = pace.f50941pc;
            }
            return pace.copy(i, i2);
        }

        public final int component1() {
            return this.seq;
        }

        public final int component2() {
            return this.f50941pc;
        }

        @aa1
        public final Pace copy(int i, int i2) {
            return new Pace(i, i2);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pace)) {
                return false;
            }
            Pace pace = (Pace) obj;
            return this.seq == pace.seq && this.f50941pc == pace.f50941pc;
        }

        public final int getPc() {
            return this.f50941pc;
        }

        public final int getSeq() {
            return this.seq;
        }

        public int hashCode() {
            return (Integer.hashCode(this.seq) * 31) + Integer.hashCode(this.f50941pc);
        }

        public final void setPc(int i) {
            this.f50941pc = i;
        }

        public final void setSeq(int i) {
            this.seq = i;
        }

        @aa1
        public String toString() {
            return "Pace(seq=" + this.seq + ", pc=" + this.f50941pc + I000IiI1O.C2156iO.f1007iO;
        }
    }

    public static final class Pos {

        /* JADX INFO: renamed from: lc */
        @aa1
        private String f50942lc;

        /* JADX INFO: renamed from: tm */
        private int f50943tm;

        public Pos(int i, @aa1 String lc) {
            Intrinsics.X0O(lc, "lc");
            this.f50943tm = i;
            this.f50942lc = lc;
        }

        public static /* synthetic */ Pos copy$default(Pos pos, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pos.f50943tm;
            }
            if ((i2 & 2) != 0) {
                str = pos.f50942lc;
            }
            return pos.copy(i, str);
        }

        public final int component1() {
            return this.f50943tm;
        }

        @aa1
        public final String component2() {
            return this.f50942lc;
        }

        @aa1
        public final Pos copy(int i, @aa1 String lc) {
            Intrinsics.X0O(lc, "lc");
            return new Pos(i, lc);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pos)) {
                return false;
            }
            Pos pos = (Pos) obj;
            return this.f50943tm == pos.f50943tm && Intrinsics.XOO0ii0(this.f50942lc, pos.f50942lc);
        }

        @aa1
        public final String getLc() {
            return this.f50942lc;
        }

        public final int getTm() {
            return this.f50943tm;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f50943tm) * 31) + this.f50942lc.hashCode();
        }

        public final void setLc(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.f50942lc = str;
        }

        public final void setTm(int i) {
            this.f50943tm = i;
        }

        @aa1
        public String toString() {
            return "Pos(tm=" + this.f50943tm + ", lc=" + this.f50942lc + I000IiI1O.C2156iO.f1007iO;
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
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, C2263bm.OXO1, null);
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
        public final SportOverView copy(@tb1 Integer num, @tb1 Integer num2, @tb1 Integer num3, @tb1 Integer num4, @tb1 Integer num5, @tb1 Integer num6, @tb1 Integer num7, @tb1 Integer num8, @tb1 Integer num9, @tb1 Integer num10, @tb1 Integer num11, @tb1 Integer num12, @tb1 String str, @tb1 Integer num13) {
            return new SportOverView(num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, str, num13);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SportOverView)) {
                return false;
            }
            SportOverView sportOverView = (SportOverView) obj;
            return Intrinsics.XOO0ii0(this.stepCount, sportOverView.stepCount) && Intrinsics.XOO0ii0(this.stepFreq, sportOverView.stepFreq) && Intrinsics.XOO0ii0(this.riseTotal, sportOverView.riseTotal) && Intrinsics.XOO0ii0(this.declineTotal, sportOverView.declineTotal) && Intrinsics.XOO0ii0(this.roundCount, sportOverView.roundCount) && Intrinsics.XOO0ii0(this.swingFreq, sportOverView.swingFreq) && Intrinsics.XOO0ii0(this.swolf, sportOverView.swolf) && Intrinsics.XOO0ii0(this.duration, sportOverView.duration) && Intrinsics.XOO0ii0(this.calorie, sportOverView.calorie) && Intrinsics.XOO0ii0(this.avgHr, sportOverView.avgHr) && Intrinsics.XOO0ii0(this.maxHr, sportOverView.maxHr) && Intrinsics.XOO0ii0(this.minHr, sportOverView.minHr) && Intrinsics.XOO0ii0(this.sportName, sportOverView.sportName) && Intrinsics.XOO0ii0(this.distance, sportOverView.distance);
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
            Integer num = this.stepCount;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.stepFreq;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.riseTotal;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.declineTotal;
            int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.roundCount;
            int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.swingFreq;
            int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.swolf;
            int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Integer num8 = this.duration;
            int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.calorie;
            int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Integer num10 = this.avgHr;
            int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
            Integer num11 = this.maxHr;
            int iHashCode11 = (iHashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
            Integer num12 = this.minHr;
            int iHashCode12 = (iHashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
            String str = this.sportName;
            int iHashCode13 = (iHashCode12 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num13 = this.distance;
            return iHashCode13 + (num13 != null ? num13.hashCode() : 0);
        }

        public final void setAvgHr(@tb1 Integer num) {
            this.avgHr = num;
        }

        public final void setCalorie(@tb1 Integer num) {
            this.calorie = num;
        }

        public final void setDeclineTotal(@tb1 Integer num) {
            this.declineTotal = num;
        }

        public final void setDistance(@tb1 Integer num) {
            this.distance = num;
        }

        public final void setDuration(@tb1 Integer num) {
            this.duration = num;
        }

        public final void setMaxHr(@tb1 Integer num) {
            this.maxHr = num;
        }

        public final void setMinHr(@tb1 Integer num) {
            this.minHr = num;
        }

        public final void setRiseTotal(@tb1 Integer num) {
            this.riseTotal = num;
        }

        public final void setRoundCount(@tb1 Integer num) {
            this.roundCount = num;
        }

        public final void setSportName(@tb1 String str) {
            this.sportName = str;
        }

        public final void setStepCount(@tb1 Integer num) {
            this.stepCount = num;
        }

        public final void setStepFreq(@tb1 Integer num) {
            this.stepFreq = num;
        }

        public final void setSwingFreq(@tb1 Integer num) {
            this.swingFreq = num;
        }

        public final void setSwolf(@tb1 Integer num) {
            this.swolf = num;
        }

        @aa1
        public String toString() {
            return "SportOverView(stepCount=" + this.stepCount + ", stepFreq=" + this.stepFreq + ", riseTotal=" + this.riseTotal + ", declineTotal=" + this.declineTotal + ", roundCount=" + this.roundCount + ", swingFreq=" + this.swingFreq + ", swolf=" + this.swolf + ", duration=" + this.duration + ", calorie=" + this.calorie + ", avgHr=" + this.avgHr + ", maxHr=" + this.maxHr + ", minHr=" + this.minHr + ", sportName=" + this.sportName + ", distance=" + this.distance + I000IiI1O.C2156iO.f1007iO;
        }

        public SportOverView(@tb1 Integer num, @tb1 Integer num2, @tb1 Integer num3, @tb1 Integer num4, @tb1 Integer num5, @tb1 Integer num6, @tb1 Integer num7, @tb1 Integer num8, @tb1 Integer num9, @tb1 Integer num10, @tb1 Integer num11, @tb1 Integer num12, @tb1 String str, @tb1 Integer num13) {
            this.stepCount = num;
            this.stepFreq = num2;
            this.riseTotal = num3;
            this.declineTotal = num4;
            this.roundCount = num5;
            this.swingFreq = num6;
            this.swolf = num7;
            this.duration = num8;
            this.calorie = num9;
            this.avgHr = num10;
            this.maxHr = num11;
            this.minHr = num12;
            this.sportName = str;
            this.distance = num13;
        }

        public /* synthetic */ SportOverView(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, String str, Integer num13, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? null : num10, (i & 1024) != 0 ? null : num11, (i & 2048) != 0 ? null : num12, (i & 4096) != 0 ? null : str, (i & 8192) != 0 ? null : num13);
        }
    }

    public enum SportType {
        SKIPPING_ROPE(1),
        RUNNING(2),
        CYCLING(3),
        MOUNTAINEERING(4),
        SWIM(5),
        WALK(6),
        OTHER(7);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
        private final int value;

        SportType(int i) {
            this.value = i;
        }

        @aa1
        public static EnumEntries<SportType> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static final class StepFreq {

        /* JADX INFO: renamed from: sf */
        private int f50944sf;

        /* JADX INFO: renamed from: tm */
        private int f50945tm;

        public StepFreq(int i, int i2) {
            this.f50945tm = i;
            this.f50944sf = i2;
        }

        public static /* synthetic */ StepFreq copy$default(StepFreq stepFreq, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = stepFreq.f50945tm;
            }
            if ((i3 & 2) != 0) {
                i2 = stepFreq.f50944sf;
            }
            return stepFreq.copy(i, i2);
        }

        public final int component1() {
            return this.f50945tm;
        }

        public final int component2() {
            return this.f50944sf;
        }

        @aa1
        public final StepFreq copy(int i, int i2) {
            return new StepFreq(i, i2);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StepFreq)) {
                return false;
            }
            StepFreq stepFreq = (StepFreq) obj;
            return this.f50945tm == stepFreq.f50945tm && this.f50944sf == stepFreq.f50944sf;
        }

        public final int getSf() {
            return this.f50944sf;
        }

        public final int getTm() {
            return this.f50945tm;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f50945tm) * 31) + Integer.hashCode(this.f50944sf);
        }

        public final void setSf(int i) {
            this.f50944sf = i;
        }

        public final void setTm(int i) {
            this.f50945tm = i;
        }

        @aa1
        public String toString() {
            return "StepFreq(tm=" + this.f50945tm + ", sf=" + this.f50944sf + I000IiI1O.C2156iO.f1007iO;
        }
    }

    private UploadSportDataHYKY() {
    }

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

        /* JADX INFO: renamed from: sn */
        @aa1
        private String f50938sn;

        @aa1
        private Object sportData;

        public BodyData(@aa1 String phone, int i, @aa1 String deviceId, @aa1 String cmei, @aa1 String sn, @aa1 String mac, @aa1 Object sportData) {
            Intrinsics.X0O(phone, "phone");
            Intrinsics.X0O(deviceId, "deviceId");
            Intrinsics.X0O(cmei, "cmei");
            Intrinsics.X0O(sn, "sn");
            Intrinsics.X0O(mac, "mac");
            Intrinsics.X0O(sportData, "sportData");
            this.phone = phone;
            this.deviceType = i;
            this.deviceId = deviceId;
            this.cmei = cmei;
            this.f50938sn = sn;
            this.mac = mac;
            this.sportData = sportData;
        }

        public static /* synthetic */ BodyData copy$default(BodyData bodyData, String str, int i, String str2, String str3, String str4, String str5, Object obj, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                str = bodyData.phone;
            }
            if ((i2 & 2) != 0) {
                i = bodyData.deviceType;
            }
            if ((i2 & 4) != 0) {
                str2 = bodyData.deviceId;
            }
            if ((i2 & 8) != 0) {
                str3 = bodyData.cmei;
            }
            if ((i2 & 16) != 0) {
                str4 = bodyData.f50938sn;
            }
            if ((i2 & 32) != 0) {
                str5 = bodyData.mac;
            }
            if ((i2 & 64) != 0) {
                obj = bodyData.sportData;
            }
            String str6 = str5;
            Object obj3 = obj;
            String str7 = str4;
            String str8 = str2;
            return bodyData.copy(str, i, str8, str3, str7, str6, obj3);
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
            return this.f50938sn;
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
        public final BodyData copy(@aa1 String phone, int i, @aa1 String deviceId, @aa1 String cmei, @aa1 String sn, @aa1 String mac, @aa1 Object sportData) {
            Intrinsics.X0O(phone, "phone");
            Intrinsics.X0O(deviceId, "deviceId");
            Intrinsics.X0O(cmei, "cmei");
            Intrinsics.X0O(sn, "sn");
            Intrinsics.X0O(mac, "mac");
            Intrinsics.X0O(sportData, "sportData");
            return new BodyData(phone, i, deviceId, cmei, sn, mac, sportData);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BodyData)) {
                return false;
            }
            BodyData bodyData = (BodyData) obj;
            return Intrinsics.XOO0ii0(this.phone, bodyData.phone) && this.deviceType == bodyData.deviceType && Intrinsics.XOO0ii0(this.deviceId, bodyData.deviceId) && Intrinsics.XOO0ii0(this.cmei, bodyData.cmei) && Intrinsics.XOO0ii0(this.f50938sn, bodyData.f50938sn) && Intrinsics.XOO0ii0(this.mac, bodyData.mac) && Intrinsics.XOO0ii0(this.sportData, bodyData.sportData);
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
            return this.f50938sn;
        }

        @aa1
        public final Object getSportData() {
            return this.sportData;
        }

        public int hashCode() {
            return (((((((((((this.phone.hashCode() * 31) + Integer.hashCode(this.deviceType)) * 31) + this.deviceId.hashCode()) * 31) + this.cmei.hashCode()) * 31) + this.f50938sn.hashCode()) * 31) + this.mac.hashCode()) * 31) + this.sportData.hashCode();
        }

        public final void setCmei(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.cmei = str;
        }

        public final void setDeviceId(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.deviceId = str;
        }

        public final void setDeviceType(int i) {
            this.deviceType = i;
        }

        public final void setMac(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.mac = str;
        }

        public final void setPhone(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.phone = str;
        }

        public final void setSn(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.f50938sn = str;
        }

        public final void setSportData(@aa1 Object obj) {
            Intrinsics.X0O(obj, "<set-?>");
            this.sportData = obj;
        }

        @aa1
        public String toString() {
            return "BodyData(phone=" + this.phone + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", cmei=" + this.cmei + ", sn=" + this.f50938sn + ", mac=" + this.mac + ", sportData=" + this.sportData + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ BodyData(String str, int i, String str2, String str3, String str4, String str5, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? HykyAPI.DeviceType : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, obj);
        }
    }

    public static final class SportData {

        @aa1
        private String endTime;

        @tb1
        private List<C15478Hr> hrList;

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

        public SportData(int i, @aa1 String startTime, @aa1 String endTime, @aa1 String sportDataId, int i2, @aa1 String recordTime, @tb1 SportOverView sportOverView, @tb1 String str, @tb1 List<C15478Hr> list, @tb1 List<Pos> list2, @tb1 List<StepFreq> list3, @tb1 List<Pace> list4) {
            Intrinsics.X0O(startTime, "startTime");
            Intrinsics.X0O(endTime, "endTime");
            Intrinsics.X0O(sportDataId, "sportDataId");
            Intrinsics.X0O(recordTime, "recordTime");
            this.sportType = i;
            this.startTime = startTime;
            this.endTime = endTime;
            this.sportDataId = sportDataId;
            this.sportDataType = i2;
            this.recordTime = recordTime;
            this.sportOverView = sportOverView;
            this.posType = str;
            this.hrList = list;
            this.posList = list2;
            this.stepFreqList = list3;
            this.paceList = list4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SportData copy$default(SportData sportData, int i, String str, String str2, String str3, int i2, String str4, SportOverView sportOverView, String str5, List list, List list2, List list3, List list4, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = sportData.sportType;
            }
            if ((i3 & 2) != 0) {
                str = sportData.startTime;
            }
            if ((i3 & 4) != 0) {
                str2 = sportData.endTime;
            }
            if ((i3 & 8) != 0) {
                str3 = sportData.sportDataId;
            }
            if ((i3 & 16) != 0) {
                i2 = sportData.sportDataType;
            }
            if ((i3 & 32) != 0) {
                str4 = sportData.recordTime;
            }
            if ((i3 & 64) != 0) {
                sportOverView = sportData.sportOverView;
            }
            if ((i3 & 128) != 0) {
                str5 = sportData.posType;
            }
            if ((i3 & 256) != 0) {
                list = sportData.hrList;
            }
            if ((i3 & 512) != 0) {
                list2 = sportData.posList;
            }
            if ((i3 & 1024) != 0) {
                list3 = sportData.stepFreqList;
            }
            if ((i3 & 2048) != 0) {
                list4 = sportData.paceList;
            }
            List list5 = list3;
            List list6 = list4;
            List list7 = list;
            List list8 = list2;
            SportOverView sportOverView2 = sportOverView;
            String str6 = str5;
            int i4 = i2;
            String str7 = str4;
            return sportData.copy(i, str, str2, str3, i4, str7, sportOverView2, str6, list7, list8, list5, list6);
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
        public final List<C15478Hr> component9() {
            return this.hrList;
        }

        @aa1
        public final SportData copy(int i, @aa1 String startTime, @aa1 String endTime, @aa1 String sportDataId, int i2, @aa1 String recordTime, @tb1 SportOverView sportOverView, @tb1 String str, @tb1 List<C15478Hr> list, @tb1 List<Pos> list2, @tb1 List<StepFreq> list3, @tb1 List<Pace> list4) {
            Intrinsics.X0O(startTime, "startTime");
            Intrinsics.X0O(endTime, "endTime");
            Intrinsics.X0O(sportDataId, "sportDataId");
            Intrinsics.X0O(recordTime, "recordTime");
            return new SportData(i, startTime, endTime, sportDataId, i2, recordTime, sportOverView, str, list, list2, list3, list4);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SportData)) {
                return false;
            }
            SportData sportData = (SportData) obj;
            return this.sportType == sportData.sportType && Intrinsics.XOO0ii0(this.startTime, sportData.startTime) && Intrinsics.XOO0ii0(this.endTime, sportData.endTime) && Intrinsics.XOO0ii0(this.sportDataId, sportData.sportDataId) && this.sportDataType == sportData.sportDataType && Intrinsics.XOO0ii0(this.recordTime, sportData.recordTime) && Intrinsics.XOO0ii0(this.sportOverView, sportData.sportOverView) && Intrinsics.XOO0ii0(this.posType, sportData.posType) && Intrinsics.XOO0ii0(this.hrList, sportData.hrList) && Intrinsics.XOO0ii0(this.posList, sportData.posList) && Intrinsics.XOO0ii0(this.stepFreqList, sportData.stepFreqList) && Intrinsics.XOO0ii0(this.paceList, sportData.paceList);
        }

        @aa1
        public final String getEndTime() {
            return this.endTime;
        }

        @tb1
        public final List<C15478Hr> getHrList() {
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
            int iHashCode = ((((((((((Integer.hashCode(this.sportType) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31) + this.sportDataId.hashCode()) * 31) + Integer.hashCode(this.sportDataType)) * 31) + this.recordTime.hashCode()) * 31;
            SportOverView sportOverView = this.sportOverView;
            int iHashCode2 = (iHashCode + (sportOverView == null ? 0 : sportOverView.hashCode())) * 31;
            String str = this.posType;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<C15478Hr> list = this.hrList;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            List<Pos> list2 = this.posList;
            int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<StepFreq> list3 = this.stepFreqList;
            int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<Pace> list4 = this.paceList;
            return iHashCode6 + (list4 != null ? list4.hashCode() : 0);
        }

        public final void setEndTime(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.endTime = str;
        }

        public final void setHrList(@tb1 List<C15478Hr> list) {
            this.hrList = list;
        }

        public final void setPaceList(@tb1 List<Pace> list) {
            this.paceList = list;
        }

        public final void setPosList(@tb1 List<Pos> list) {
            this.posList = list;
        }

        public final void setPosType(@tb1 String str) {
            this.posType = str;
        }

        public final void setRecordTime(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.recordTime = str;
        }

        public final void setSportDataId(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.sportDataId = str;
        }

        public final void setSportDataType(int i) {
            this.sportDataType = i;
        }

        public final void setSportOverView(@tb1 SportOverView sportOverView) {
            this.sportOverView = sportOverView;
        }

        public final void setSportType(int i) {
            this.sportType = i;
        }

        public final void setStartTime(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.startTime = str;
        }

        public final void setStepFreqList(@tb1 List<StepFreq> list) {
            this.stepFreqList = list;
        }

        @aa1
        public String toString() {
            return "SportData(sportType=" + this.sportType + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", sportDataId=" + this.sportDataId + ", sportDataType=" + this.sportDataType + ", recordTime=" + this.recordTime + ", sportOverView=" + this.sportOverView + ", posType=" + this.posType + ", hrList=" + this.hrList + ", posList=" + this.posList + ", stepFreqList=" + this.stepFreqList + ", paceList=" + this.paceList + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ SportData(int i, String str, String str2, String str3, int i2, String str4, SportOverView sportOverView, String str5, List list, List list2, List list3, List list4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? SportType.OTHER.getValue() : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? 1 : i2, (i3 & 32) != 0 ? "" : str4, sportOverView, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? null : list, (i3 & 512) != 0 ? null : list2, (i3 & 1024) != 0 ? null : list3, (i3 & 2048) != 0 ? null : list4);
        }
    }
}
