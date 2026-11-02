package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.IIIOOX1I1;
import com.android.mltcode.paycertificationapi.X101I10I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.m6;
import com.batoulapps.adhan2.XIi00iiXO;
import com.szabh.smable3.entity.BlePrayerTimes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nPrayerTimes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTimesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,413:1\n1869#2:414\n1869#2,2:415\n1870#2:417\n*S KotlinDebug\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTimesKt\n*L\n368#1:414\n370#1:415,2\n368#1:417\n*E\n"})
public final class PrayerTimesKt {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[PrayTimeType.values().length];
            r0[PrayTimeType.FAJR.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
        L19:
            r0[PrayTimeType.SUNRISE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
        L27:
            r0[PrayTimeType.DHUHR.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
        L21:
            r0[PrayTimeType.ASR.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L23:
            r0[PrayTimeType.MAGHRIB.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
        L17:
            r0[PrayTimeType.ISHA.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    @aa1
    public static final List<PrayerTime> getPrayerTime(@aa1 PrayerTimeSettings r7, double r8, double r10, long r12) {
        Intrinsics.X0O(r7, "prayerTimeSettings");
        XIi00iiXO r9 = new XIi00iiXO(new IIIOOX1I1(r8, r10), X101I10I.XO0O10.OXO1(m6.Companion.XIi00iiXO(r12)), PrayerTimesCalculationMethod.Companion.getMethodParameters(r7));     // Catch: Exception -> L5
        return CollectionsKt__CollectionsKt.iXiX011(new PrayerTime[]{new PrayerTime(PrayTimeType.FAJR, r9.X1ii().X0O()), new PrayerTime(PrayTimeType.SUNRISE, r9.I1XOi1().X0O()), new PrayerTime(PrayTimeType.DHUHR, r9.XXI().X0O()), new PrayerTime(PrayTimeType.ASR, r9.OIi0().X0O()), new PrayerTime(PrayTimeType.MAGHRIB, r9.X0O().X0O()), new PrayerTime(PrayTimeType.ISHA, r9.O10IXXX0X().X0O())});
    L5:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("getPrayerTime -> error: " + e.getMessage());
        return CollectionsKt__CollectionsKt.iI();
    }

    @aa1
    public static final Map<Long, List<PrayerTime>> getPrayerTimeMap(@aa1 PrayerTimeSettings r16, double r17, double r19, long r21, int r23) {
        PrayerTimeSettings r0 = r16;
        Intrinsics.X0O(r0, "prayerTimeSettings");
        i1O0OXO1O r1 = i1O0OXO1O.OXO1;
        StringBuilder r2 = new StringBuilder();
        r2.append("getPrayerTime -> ");
        double r3 = r17;
        r2.append(r3);
        r2.append(", ");
        double r10 = r19;
        r2.append(r10);
        r2.append(", ");
        r2.append(r21);
        r2.append(", ");
        r2.append(r0);
        r2.append(", ");
        r2.append(r23);
        r1.OXO1(r2.toString());
        LinkedHashMap r12 = new LinkedHashMap();
        int r13 = 0;
    L3:
        if (r13 >= r23) goto L5;
        long r5 = r21 + (((long) r13) * TimeUnit.DAYS.toMillis(1));
        r12.put(Long.valueOf(r5), getPrayerTime(r0, r3, r10, r5));
        r13 = r13 + 1;
        r0 = r16;
        r3 = r17;
        r10 = r19;
        goto L3
    L5:
        return r12;
    }

    public static /* synthetic */ Map getPrayerTimeMap$default(PrayerTimeSettings r9, double r10, double r12, long r14, int r16, int r17, Object r18) {
        if ((r17 & 16) == 0) goto L6;
        int r8 = 31;
    L8:
        return getPrayerTimeMap(r9, r10, r12, r14, r8);
    L6:
        r8 = r16;
        goto L8
    }

    @aa1
    public static final List<BlePrayerTimes> toBlePrayerTimes(@aa1 Map<Long, ? extends List<PrayerTime>> r18) {
        Intrinsics.X0O(r18, "map");
        ArrayList r0 = new ArrayList();
        Iterator<T> r1 = r18.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L19;
        List r2 = (List) r1.next();
        BlePrayerTimes r3 = new BlePrayerTimes(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, bo0.iO, null);
        Iterator r4 = r2.iterator();
    L7:
        if (r4.hasNext() == false) goto L18;
        PrayerTime r5 = (PrayerTime) r4.next();
        PrayTimeType r6 = r5.getType();
        switch(WhenMappings.$EnumSwitchMapping$0[r6.ordinal()]) {
            case 1: goto L17;
            case 2: goto L16;
            case 3: goto L15;
            case 4: goto L14;
            case 5: goto L13;
            case 6: goto L12;
            default: goto L11;
        };
    L11:
        throw new NoWhenBranchMatchedException();
    L13:
        r3.setMMaghribHour(r5.getTimeHour());
        r3.setMMaghribMinite(r5.getTimeMinute());
        goto L7
    L14:
        r3.setMAsrHour(r5.getTimeHour());
        r3.setMAsrMinite(r5.getTimeMinute());
        goto L7
    L15:
        r3.setMDhuhrHour(r5.getTimeHour());
        r3.setMDhuhrMinite(r5.getTimeMinute());
        goto L7
    L16:
        r3.setMSunriseHour(r5.getTimeHour());
        r3.setMSunriseMinite(r5.getTimeMinute());
        goto L7
    L17:
        r3.setMFajrHour(r5.getTimeHour());
        r3.setMFajrMinite(r5.getTimeMinute());
        goto L7
    L12:
        r3.setMIshaHour(r5.getTimeHour());
        r3.setMIshaMinite(r5.getTimeMinute());
        goto L7
    L18:
        r0.add(r3);
        goto L4
    L19:
        return r0;
    }
}
