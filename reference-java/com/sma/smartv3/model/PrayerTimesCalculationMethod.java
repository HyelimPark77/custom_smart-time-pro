package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.k22;
import com.android.mltcode.paycertificationapi.tb1;
import com.batoulapps.adhan2.Madhab;
import com.batoulapps.adhan2.OXO1;
import com.batoulapps.adhan2.model.Rounding;
import com.goodix.ble.p595gr.libdfu.task.sub.ResultCode;
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
    public static final Companion Companion = new Companion(null);
    private final double fajrAngle;
    private final double ishaAngle;
    private final int method;

    @aa1
    private final String name;

    @SourceDebugExtension({"SMAP\nPrayerTimes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,413:1\n1#2:414\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final String getMethodName(int i) {
            Object next;
            String name;
            Iterator<T> it = getMethods().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((PrayerTimesCalculationMethod) next).getMethod() != i);
            PrayerTimesCalculationMethod prayerTimesCalculationMethod = (PrayerTimesCalculationMethod) next;
            return (prayerTimesCalculationMethod == null || (name = prayerTimesCalculationMethod.getName()) == null) ? "" : name;
        }

        @aa1
        public final OXO1 getMethodParameters(@aa1 PrayerTimeSettings prayerTimeSettings) {
            Intrinsics.X0O(prayerTimeSettings, "prayerTimeSettings");
            Madhab madhab = prayerTimeSettings.getArsJuristicMethod() != 0 ? Madhab.HANAFI : Madhab.SHAFI;
            switch (prayerTimeSettings.getCalculationMethod()) {
                case 0:
                    return new OXO1(18.0d, 17.0d, 0, null, madhab, null, null, new k22(prayerTimeSettings.getFajrAdjustment(), prayerTimeSettings.getSunriseAdjustment(), prayerTimeSettings.getDhuhrAdjustment() + 1, prayerTimeSettings.getAsrAdjustment(), prayerTimeSettings.getMaghribAdjustment(), prayerTimeSettings.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
                case 1:
                    return new OXO1(19.5d, 17.5d, 0, null, madhab, null, null, new k22(prayerTimeSettings.getFajrAdjustment(), prayerTimeSettings.getSunriseAdjustment(), prayerTimeSettings.getDhuhrAdjustment() + 1, prayerTimeSettings.getAsrAdjustment(), prayerTimeSettings.getMaghribAdjustment(), prayerTimeSettings.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
                case 2:
                    return new OXO1(18.0d, 18.0d, 0, null, madhab, null, null, new k22(prayerTimeSettings.getFajrAdjustment(), prayerTimeSettings.getSunriseAdjustment(), prayerTimeSettings.getDhuhrAdjustment() + 1, prayerTimeSettings.getAsrAdjustment(), prayerTimeSettings.getMaghribAdjustment(), prayerTimeSettings.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
                case 3:
                    return new OXO1(18.5d, 0.0d, 90, null, madhab, null, null, new k22(prayerTimeSettings.getFajrAdjustment(), prayerTimeSettings.getSunriseAdjustment(), prayerTimeSettings.getDhuhrAdjustment(), prayerTimeSettings.getAsrAdjustment(), prayerTimeSettings.getMaghribAdjustment(), prayerTimeSettings.getIshaAdjustment()), null, null, 874, null);
                case 4:
                    return new OXO1(18.2d, 18.2d, 0, null, madhab, null, null, new k22(prayerTimeSettings.getFajrAdjustment(), prayerTimeSettings.getSunriseAdjustment() - 3, prayerTimeSettings.getDhuhrAdjustment() + 3, prayerTimeSettings.getAsrAdjustment() + 3, prayerTimeSettings.getMaghribAdjustment() + 3, prayerTimeSettings.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
                case 5:
                    return new OXO1(18.0d, 18.0d, 0, null, madhab, null, null, new k22(prayerTimeSettings.getFajrAdjustment(), prayerTimeSettings.getSunriseAdjustment(), prayerTimeSettings.getDhuhrAdjustment() + 5, prayerTimeSettings.getAsrAdjustment(), prayerTimeSettings.getMaghribAdjustment() + 3, prayerTimeSettings.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
                case 6:
                    return new OXO1(15.0d, 15.0d, 0, null, madhab, null, null, new k22(prayerTimeSettings.getFajrAdjustment(), prayerTimeSettings.getSunriseAdjustment(), prayerTimeSettings.getDhuhrAdjustment() + 1, prayerTimeSettings.getAsrAdjustment(), prayerTimeSettings.getMaghribAdjustment(), prayerTimeSettings.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
                case 7:
                    return new OXO1(18.0d, 17.5d, 0, null, madhab, null, null, new k22(prayerTimeSettings.getFajrAdjustment(), prayerTimeSettings.getSunriseAdjustment(), prayerTimeSettings.getDhuhrAdjustment(), prayerTimeSettings.getAsrAdjustment(), prayerTimeSettings.getMaghribAdjustment(), prayerTimeSettings.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
                case 8:
                    return new OXO1(18.0d, 0.0d, 90, null, madhab, null, null, new k22(prayerTimeSettings.getFajrAdjustment(), prayerTimeSettings.getSunriseAdjustment(), prayerTimeSettings.getDhuhrAdjustment(), prayerTimeSettings.getAsrAdjustment(), prayerTimeSettings.getMaghribAdjustment(), prayerTimeSettings.getIshaAdjustment()), null, null, 874, null);
                case 9:
                    return new OXO1(20.0d, 18.0d, 0, null, madhab, null, null, new k22(prayerTimeSettings.getFajrAdjustment(), prayerTimeSettings.getSunriseAdjustment(), prayerTimeSettings.getDhuhrAdjustment() + 1, prayerTimeSettings.getAsrAdjustment(), prayerTimeSettings.getMaghribAdjustment(), prayerTimeSettings.getIshaAdjustment()), Rounding.UP, null, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, null);
                case 10:
                    return new OXO1(18.0d, 17.0d, 0, null, madhab, null, null, new k22(prayerTimeSettings.getFajrAdjustment(), prayerTimeSettings.getSunriseAdjustment() - 7, prayerTimeSettings.getDhuhrAdjustment() + 5, prayerTimeSettings.getAsrAdjustment() + 4, prayerTimeSettings.getMaghribAdjustment() + 7, prayerTimeSettings.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
                case 11:
                default:
                    return new OXO1(0.0d, 0.0d, 0, null, madhab, null, null, new k22(prayerTimeSettings.getFajrAdjustment(), prayerTimeSettings.getSunriseAdjustment(), prayerTimeSettings.getDhuhrAdjustment(), prayerTimeSettings.getAsrAdjustment(), prayerTimeSettings.getMaghribAdjustment(), prayerTimeSettings.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
                case 12:
                    return new OXO1(20.0d, 18.0d, 0, null, madhab, null, null, new k22(prayerTimeSettings.getFajrAdjustment() + 1, prayerTimeSettings.getSunriseAdjustment(), prayerTimeSettings.getDhuhrAdjustment(), prayerTimeSettings.getAsrAdjustment(), prayerTimeSettings.getMaghribAdjustment(), prayerTimeSettings.getIshaAdjustment()), null, null, ResultCode.SEND_CMD_FAILD, null);
            }
        }

        @aa1
        public final List<PrayerTimesCalculationMethod> getMethods() {
            return CollectionsKt__CollectionsKt.iIiiO(new PrayerTimesCalculationMethod(0, "Muslim World League", 18.0d, 17.0d), new PrayerTimesCalculationMethod(12, "Sihat/Kemenag", 20.0d, 18.0d), new PrayerTimesCalculationMethod(1, "Egyptian", 19.5d, 17.5d), new PrayerTimesCalculationMethod(2, "Karachi", 18.0d, 18.0d), new PrayerTimesCalculationMethod(3, "Umm al-Qura", 18.5d, 90.0d), new PrayerTimesCalculationMethod(4, "Dubai", 18.2d, 18.2d), new PrayerTimesCalculationMethod(5, "Moon Sighting Committee", 18.0d, 18.0d), new PrayerTimesCalculationMethod(6, "North America", 15.0d, 15.0d), new PrayerTimesCalculationMethod(7, "Kuwait", 18.0d, 17.5d), new PrayerTimesCalculationMethod(8, "Qatar", 18.0d, 18.0d), new PrayerTimesCalculationMethod(9, "Singapore", 20.0d, 18.0d), new PrayerTimesCalculationMethod(10, "Turkey", 18.0d, 17.0d), new PrayerTimesCalculationMethod(11, "Other", 0.0d, 0.0d));
        }

        private Companion() {
        }
    }

    public PrayerTimesCalculationMethod() {
        this(0, null, 0.0d, 0.0d, 15, null);
    }

    public static /* synthetic */ PrayerTimesCalculationMethod copy$default(PrayerTimesCalculationMethod prayerTimesCalculationMethod, int i, String str, double d, double d2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = prayerTimesCalculationMethod.method;
        }
        if ((i2 & 2) != 0) {
            str = prayerTimesCalculationMethod.name;
        }
        if ((i2 & 4) != 0) {
            d = prayerTimesCalculationMethod.fajrAngle;
        }
        if ((i2 & 8) != 0) {
            d2 = prayerTimesCalculationMethod.ishaAngle;
        }
        double d3 = d2;
        return prayerTimesCalculationMethod.copy(i, str, d, d3);
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
    public final PrayerTimesCalculationMethod copy(int i, @aa1 String name, double d, double d2) {
        Intrinsics.X0O(name, "name");
        return new PrayerTimesCalculationMethod(i, name, d, d2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrayerTimesCalculationMethod)) {
            return false;
        }
        PrayerTimesCalculationMethod prayerTimesCalculationMethod = (PrayerTimesCalculationMethod) obj;
        return this.method == prayerTimesCalculationMethod.method && Intrinsics.XOO0ii0(this.name, prayerTimesCalculationMethod.name) && Double.compare(this.fajrAngle, prayerTimesCalculationMethod.fajrAngle) == 0 && Double.compare(this.ishaAngle, prayerTimesCalculationMethod.ishaAngle) == 0;
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
        return "PrayerTimesCalculationMethod(method=" + this.method + ", name=" + this.name + ", fajrAngle=" + this.fajrAngle + ", ishaAngle=" + this.ishaAngle + I000IiI1O.C2156iO.f1007iO;
    }

    public PrayerTimesCalculationMethod(int i, @aa1 String name, double d, double d2) {
        Intrinsics.X0O(name, "name");
        this.method = i;
        this.name = name;
        this.fajrAngle = d;
        this.ishaAngle = d2;
    }

    public /* synthetic */ PrayerTimesCalculationMethod(int i, String str, double d, double d2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0.0d : d, (i2 & 8) != 0 ? 0.0d : d2);
    }
}
