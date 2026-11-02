package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.C2680m6;
import com.android.mltcode.paycertificationapi.IIIOOX1I1;
import com.android.mltcode.paycertificationapi.X101I10I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
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
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrayTimeType.values().length];
            try {
                iArr[PrayTimeType.FAJR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrayTimeType.SUNRISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrayTimeType.DHUHR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrayTimeType.ASR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrayTimeType.MAGHRIB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrayTimeType.ISHA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @aa1
    public static final List<PrayerTime> getPrayerTime(@aa1 PrayerTimeSettings prayerTimeSettings, double d, double d2, long j) {
        Intrinsics.X0O(prayerTimeSettings, "prayerTimeSettings");
        try {
            XIi00iiXO xIi00iiXO = new XIi00iiXO(new IIIOOX1I1(d, d2), X101I10I.XO0O10.OXO1(C2680m6.Companion.XIi00iiXO(j)), PrayerTimesCalculationMethod.Companion.getMethodParameters(prayerTimeSettings));
            return CollectionsKt__CollectionsKt.iXiX011(new PrayerTime(PrayTimeType.FAJR, xIi00iiXO.X1ii().X0O()), new PrayerTime(PrayTimeType.SUNRISE, xIi00iiXO.I1XOi1().X0O()), new PrayerTime(PrayTimeType.DHUHR, xIi00iiXO.XXI().X0O()), new PrayerTime(PrayTimeType.ASR, xIi00iiXO.OIi0().X0O()), new PrayerTime(PrayTimeType.MAGHRIB, xIi00iiXO.X0O().X0O()), new PrayerTime(PrayTimeType.ISHA, xIi00iiXO.O10IXXX0X().X0O()));
        } catch (Exception e) {
            e.printStackTrace();
            i1O0OXO1O.OXO1.OXO1("getPrayerTime -> error: " + e.getMessage());
            return CollectionsKt__CollectionsKt.m39402iI();
        }
    }

    @aa1
    public static final Map<Long, List<PrayerTime>> getPrayerTimeMap(@aa1 PrayerTimeSettings prayerTimeSettings, double d, double d2, long j, int i) {
        PrayerTimeSettings prayerTimeSettings2 = prayerTimeSettings;
        Intrinsics.X0O(prayerTimeSettings2, "prayerTimeSettings");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        StringBuilder sb = new StringBuilder();
        sb.append("getPrayerTime -> ");
        double d3 = d;
        sb.append(d3);
        sb.append(", ");
        double d4 = d2;
        sb.append(d4);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(prayerTimeSettings2);
        sb.append(", ");
        sb.append(i);
        i1o0oxo1o.OXO1(sb.toString());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        while (i2 < i) {
            long millis = j + (((long) i2) * TimeUnit.DAYS.toMillis(1L));
            linkedHashMap.put(Long.valueOf(millis), getPrayerTime(prayerTimeSettings2, d3, d4, millis));
            i2++;
            prayerTimeSettings2 = prayerTimeSettings;
            d3 = d;
            d4 = d2;
        }
        return linkedHashMap;
    }

    @aa1
    public static final List<BlePrayerTimes> toBlePrayerTimes(@aa1 Map<Long, ? extends List<PrayerTime>> map) {
        Intrinsics.X0O(map, "map");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = map.values().iterator();
        while (it.hasNext()) {
            List<PrayerTime> list = (List) it.next();
            BlePrayerTimes blePrayerTimes = new BlePrayerTimes(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, bo0.f5772iO, null);
            for (PrayerTime prayerTime : list) {
                switch (WhenMappings.$EnumSwitchMapping$0[prayerTime.getType().ordinal()]) {
                    case 1:
                        blePrayerTimes.setMFajrHour(prayerTime.getTimeHour());
                        blePrayerTimes.setMFajrMinite(prayerTime.getTimeMinute());
                        break;
                    case 2:
                        blePrayerTimes.setMSunriseHour(prayerTime.getTimeHour());
                        blePrayerTimes.setMSunriseMinite(prayerTime.getTimeMinute());
                        break;
                    case 3:
                        blePrayerTimes.setMDhuhrHour(prayerTime.getTimeHour());
                        blePrayerTimes.setMDhuhrMinite(prayerTime.getTimeMinute());
                        break;
                    case 4:
                        blePrayerTimes.setMAsrHour(prayerTime.getTimeHour());
                        blePrayerTimes.setMAsrMinite(prayerTime.getTimeMinute());
                        break;
                    case 5:
                        blePrayerTimes.setMMaghribHour(prayerTime.getTimeHour());
                        blePrayerTimes.setMMaghribMinite(prayerTime.getTimeMinute());
                        break;
                    case 6:
                        blePrayerTimes.setMIshaHour(prayerTime.getTimeHour());
                        blePrayerTimes.setMIshaMinite(prayerTime.getTimeMinute());
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            arrayList.add(blePrayerTimes);
        }
        return arrayList;
    }
}
