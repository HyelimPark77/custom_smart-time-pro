package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.k22;
import com.android.mltcode.paycertificationapi.tb1;
import com.batoulapps.adhan2.Madhab;
import com.batoulapps.adhan2.OXO1;
import com.batoulapps.adhan2.model.Rounding;
import com.goodix.ble.gr.libdfu.task.sub.ResultCode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
public final class PrayerTimesCalculationMethod implements Serializable {

    @aa1
    public static final Companion Companion = null;
    private final double fajrAngle;
    private final double ishaAngle;
    private final int method;

    @aa1
    private final String name;

    @SourceDebugExtension({"SMAP\nPrayerTimes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,413:1\n1#2:414\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final String getMethodName(int r4) {
            Iterator<T> r0 = getMethods().iterator();
        L4:
            if (r0.hasNext() == false) goto L8;
            Object r1 = r0.next();
            if (((PrayerTimesCalculationMethod) r1).getMethod() != r4) goto L4;
        L9:
            PrayerTimesCalculationMethod r2 = (PrayerTimesCalculationMethod) r1;
            if (r2 == null) goto L15;
            String r5 = r2.getName();
            if (r5 == null) goto L20;
            return r5;
        L20:
            return "";
        L15:
            return "";
        L8:
            r1 = null;
            goto L9
        }

        @aa1
        public final OXO1 getMethodParameters(@aa1 PrayerTimeSettings r17) {
            Intrinsics.X0O(r17, "prayerTimeSettings");
            if (r17.getArsJuristicMethod() == 0) goto L6;
            Madhab r0 = Madhab.HANAFI;
        L5:
            Madhab r8 = r0;
            switch(r17.getCalculationMethod()) {
                case 0: goto L34;
                case 1: goto L32;
                case 2: goto L30;
                case 3: goto L28;
                case 4: goto L26;
                case 5: goto L24;
                case 6: goto L22;
                case 7: goto L20;
                case 8: goto L18;
                case 9: goto L16;
                case 10: goto L14;
                case 11: goto L10;
                case 12: goto L12;
                default: goto L10;
            };
        L10:
            return new OXO1(0.0d, 0.0d, 0, null, r8, null, null, new k22(r17.getFajrAdjustment(), r17.getSunriseAdjustment(), r17.getDhuhrAdjustment(), r17.getAsrAdjustment(), r17.getMaghribAdjustment(), r17.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
        L12:
            return new OXO1(20.0d, 18.0d, 0, null, r8, null, null, new k22(r17.getFajrAdjustment() + 1, r17.getSunriseAdjustment(), r17.getDhuhrAdjustment(), r17.getAsrAdjustment(), r17.getMaghribAdjustment(), r17.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
        L14:
            return new OXO1(18.0d, 17.0d, 0, null, r8, null, null, new k22(r17.getFajrAdjustment(), r17.getSunriseAdjustment() - 7, r17.getDhuhrAdjustment() + 5, r17.getAsrAdjustment() + 4, r17.getMaghribAdjustment() + 7, r17.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
        L16:
            return new OXO1(20.0d, 18.0d, 0, null, r8, null, null, new k22(r17.getFajrAdjustment(), r17.getSunriseAdjustment(), r17.getDhuhrAdjustment() + 1, r17.getAsrAdjustment(), r17.getMaghribAdjustment(), r17.getIshaAdjustment()), Rounding.UP, null, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, null);
        L18:
            return new OXO1(18.0d, 0.0d, 90, null, r8, null, null, new k22(r17.getFajrAdjustment(), r17.getSunriseAdjustment(), r17.getDhuhrAdjustment(), r17.getAsrAdjustment(), r17.getMaghribAdjustment(), r17.getIshaAdjustment()), null, null, 874, null);
        L20:
            return new OXO1(18.0d, 17.5d, 0, null, r8, null, null, new k22(r17.getFajrAdjustment(), r17.getSunriseAdjustment(), r17.getDhuhrAdjustment(), r17.getAsrAdjustment(), r17.getMaghribAdjustment(), r17.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
        L22:
            return new OXO1(15.0d, 15.0d, 0, null, r8, null, null, new k22(r17.getFajrAdjustment(), r17.getSunriseAdjustment(), r17.getDhuhrAdjustment() + 1, r17.getAsrAdjustment(), r17.getMaghribAdjustment(), r17.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
        L24:
            return new OXO1(18.0d, 18.0d, 0, null, r8, null, null, new k22(r17.getFajrAdjustment(), r17.getSunriseAdjustment(), r17.getDhuhrAdjustment() + 5, r17.getAsrAdjustment(), r17.getMaghribAdjustment() + 3, r17.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
        L26:
            return new OXO1(18.2d, 18.2d, 0, null, r8, null, null, new k22(r17.getFajrAdjustment(), r17.getSunriseAdjustment() - 3, r17.getDhuhrAdjustment() + 3, r17.getAsrAdjustment() + 3, r17.getMaghribAdjustment() + 3, r17.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
        L28:
            return new OXO1(18.5d, 0.0d, 90, null, r8, null, null, new k22(r17.getFajrAdjustment(), r17.getSunriseAdjustment(), r17.getDhuhrAdjustment(), r17.getAsrAdjustment(), r17.getMaghribAdjustment(), r17.getIshaAdjustment()), null, null, 874, null);
        L30:
            return new OXO1(18.0d, 18.0d, 0, null, r8, null, null, new k22(r17.getFajrAdjustment(), r17.getSunriseAdjustment(), r17.getDhuhrAdjustment() + 1, r17.getAsrAdjustment(), r17.getMaghribAdjustment(), r17.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
        L32:
            return new OXO1(19.5d, 17.5d, 0, null, r8, null, null, new k22(r17.getFajrAdjustment(), r17.getSunriseAdjustment(), r17.getDhuhrAdjustment() + 1, r17.getAsrAdjustment(), r17.getMaghribAdjustment(), r17.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
        L34:
            return new OXO1(18.0d, 17.0d, 0, null, r8, null, null, new k22(r17.getFajrAdjustment(), r17.getSunriseAdjustment(), r17.getDhuhrAdjustment() + 1, r17.getAsrAdjustment(), r17.getMaghribAdjustment(), r17.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
        L6:
            r0 = Madhab.SHAFI;
            goto L5
        }

        @aa1
        public final List<PrayerTimesCalculationMethod> getMethods() {
            return CollectionsKt__CollectionsKt.iIiiO(new PrayerTimesCalculationMethod[]{new PrayerTimesCalculationMethod(0, "Muslim World League", 18.0d, 17.0d), new PrayerTimesCalculationMethod(12, "Sihat/Kemenag", 20.0d, 18.0d), new PrayerTimesCalculationMethod(1, "Egyptian", 19.5d, 17.5d), new PrayerTimesCalculationMethod(2, "Karachi", 18.0d, 18.0d), new PrayerTimesCalculationMethod(3, "Umm al-Qura", 18.5d, 90.0d), new PrayerTimesCalculationMethod(4, "Dubai", 18.2d, 18.2d), new PrayerTimesCalculationMethod(5, "Moon Sighting Committee", 18.0d, 18.0d), new PrayerTimesCalculationMethod(6, "North America", 15.0d, 15.0d), new PrayerTimesCalculationMethod(7, "Kuwait", 18.0d, 17.5d), new PrayerTimesCalculationMethod(8, "Qatar", 18.0d, 18.0d), new PrayerTimesCalculationMethod(9, "Singapore", 20.0d, 18.0d), new PrayerTimesCalculationMethod(10, "Turkey", 18.0d, 17.0d), new PrayerTimesCalculationMethod(11, "Other", 0.0d, 0.0d)});
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public PrayerTimesCalculationMethod() {
        int r1 = 0;
        String r2 = null;
        double r3 = 0.0d;
        double r5 = 0.0d;
        this(r1, r2, r3, r5, 15, null);
    }

    public static /* synthetic */ PrayerTimesCalculationMethod copy$default(PrayerTimesCalculationMethod r0, int r1, String r2, double r3, double r5, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.method;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.name;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.fajrAngle;
    L12:
        if ((r7 & 8) == 0) goto L14;
        r5 = r0.ishaAngle;
    L14:
        double r9 = r5;
        double r6 = r3;
        return r0.copy(r1, r2, r6, r9);
    }

    public final int component1() {
        return this.method;
    }

    @aa1
    public final String component2() {
        return this.name;
    }

    public final double component3() {
        return this.fajrAngle;
    }

    public final double component4() {
        return this.ishaAngle;
    }

    @aa1
    public final PrayerTimesCalculationMethod copy(int r9, @aa1 String r10, double r11, double r13) {
        Intrinsics.X0O(r10, "name");
        return new PrayerTimesCalculationMethod(r9, r10, r11, r13);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof PrayerTimesCalculationMethod) == true) goto L8;
        return false;
    L8:
        PrayerTimesCalculationMethod r9 = (PrayerTimesCalculationMethod) r8;
        if (this.method == r9.method) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.name, r9.name) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.fajrAngle, r9.fajrAngle) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.ishaAngle, r9.ishaAngle) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public final double getFajrAngle() {
        return this.fajrAngle;
    }

    public final double getIshaAngle() {
        return this.ishaAngle;
    }

    public final int getMethod() {
        return this.method;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.method) * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.fajrAngle)) * 31) + Double.hashCode(this.ishaAngle);
    }

    @aa1
    public String toString() {
        return "PrayerTimesCalculationMethod(method=" + this.method + ", name=" + this.name + ", fajrAngle=" + this.fajrAngle + ", ishaAngle=" + this.ishaAngle + I000IiI1O.iO.iO;
    }

    public PrayerTimesCalculationMethod(int r2, @aa1 String r3, double r4, double r6) {
        Intrinsics.X0O(r3, "name");
        this.method = r2;
        this.name = r3;
        this.fajrAngle = r4;
        this.ishaAngle = r6;
    }

    public /* synthetic */ PrayerTimesCalculationMethod(int r3, String r4, double r5, double r7, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r5 = 0.0d;
    L12:
        if ((r9 & 8) == 0) goto L15;
        double r11 = 0.0d;
    L16:
        this(r3, r4, r5, r11);
        return;
    L15:
        r11 = r7;
        goto L16
    }
}
