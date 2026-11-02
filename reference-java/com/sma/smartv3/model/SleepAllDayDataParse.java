package com.sma.smartv3.model;

import android.app.Application;
import android.content.Context;
import android.util.SparseIntArray;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import com.github.mikephil.charting.data.BarEntry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.entity.BleSleep;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nSleepAllDayData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAllDayData.kt\ncom/sma/smartv3/model/SleepAllDayDataParse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n1#1,344:1\n1563#2:345\n1634#2,3:346\n1878#2,3:349\n31#3:352\n31#3:353\n31#3:354\n31#3:355\n31#3:356\n*S KotlinDebug\n*F\n+ 1 SleepAllDayData.kt\ncom/sma/smartv3/model/SleepAllDayDataParse\n*L\n42#1:345\n42#1:346,3\n56#1:349,3\n179#1:352\n180#1:353\n181#1:354\n182#1:355\n183#1:356\n*E\n"})
public final class SleepAllDayDataParse {

    @aa1
    public static final SleepAllDayDataParse INSTANCE = new SleepAllDayDataParse();

    private SleepAllDayDataParse() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepAllDayData filterData$default(SleepAllDayDataParse sleepAllDayDataParse, List list, float f, List list2, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 100.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            j = 0;
        }
        return sleepAllDayDataParse.filterData(list, f2, list3, j);
    }

    @aa1
    public final SleepAllDayData filterData(@aa1 List<Sleep> data, float f, @tb1 List<BarEntry> list, long j) {
        int i;
        float[] fArr;
        Intrinsics.X0O(data, "data");
        if (data.isEmpty()) {
            return new SleepAllDayData(0, 0, 0, null, null, null, 63, null);
        }
        BleSleep.Companion companion = BleSleep.Companion;
        List<Sleep> list2 = data;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
        for (Sleep sleep : list2) {
            arrayList.add(new BleSleep((int) BleReadable.Companion.millisToTime(sleep.getMTime()), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
        }
        List<BleSleep> listAnalyseSleepAllDay = companion.analyseSleepAllDay(arrayList, j);
        if (listAnalyseSleepAllDay.isEmpty()) {
            return new SleepAllDayData(0, 0, 0, null, null, null, 63, null);
        }
        int i2 = 0;
        List sleepAllDayViewDatas$default = BleSleep.Companion.getSleepAllDayViewDatas$default(BleSleep.Companion, listAnalyseSleepAllDay, false, 2, null);
        int i3 = 0;
        for (Object obj : sleepAllDayViewDatas$default) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            i1O0OXO1O.OXO1.OXO1("analyseSleepAllDayView -> " + i3 + " " + ((BleSleep) obj));
            i3 = i4;
        }
        long j2 = 1000;
        int mLocalTime = (int) (((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(listAnalyseSleepAllDay)).getMLocalTime() / j2);
        int mLocalTime2 = (int) (((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(listAnalyseSleepAllDay)).getMLocalTime() / j2);
        List list3 = sleepAllDayViewDatas$default;
        if (!list3.isEmpty()) {
            mLocalTime = (int) (((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(sleepAllDayViewDatas$default)).getMLocalTime() / j2);
            mLocalTime2 = (int) (((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(sleepAllDayViewDatas$default)).getMLocalTime() / j2);
        }
        if (!list3.isEmpty()) {
            float f2 = f / 4;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = i2;
                if (i5 >= sleepAllDayViewDatas$default.size() - 1) {
                    break;
                }
                BleSleep bleSleep = (BleSleep) sleepAllDayViewDatas$default.get(i5);
                long mLocalTime3 = i5 == 0 ? (bleSleep.getMLocalTime() / j2) / ((long) 60) : ((bleSleep.getMLocalTime() / j2) / ((long) 60)) + 1;
                int i7 = i5 + 1;
                BleSleep bleSleep2 = (BleSleep) sleepAllDayViewDatas$default.get(i7);
                long mLocalTime4 = (bleSleep2.getMLocalTime() / j2) / ((long) 60);
                if (mLocalTime3 <= mLocalTime4) {
                    while (true) {
                        if (i72.OXO1.iX01()) {
                            int mMode = bleSleep.getMMode();
                            if (mMode == 1) {
                                fArr = new float[2];
                                fArr[i] = 0.0f;
                                fArr[1] = f2;
                            } else if (mMode == 2) {
                                fArr = new float[2];
                                fArr[i] = f2;
                                fArr[1] = f2;
                            } else if (mMode == 3) {
                                fArr = new float[2];
                                fArr[i] = 3 * f2;
                                fArr[1] = f2;
                            } else if (mMode == 8) {
                                fArr = new float[2];
                                fArr[i] = 0.0f;
                                fArr[1] = 3 * f2;
                            } else if (mMode == 9) {
                                fArr = new float[2];
                                fArr[i] = 2 * f2;
                                fArr[1] = f2;
                            } else if (mMode != 17) {
                                fArr = new float[2];
                                fArr[i] = 0.0f;
                                fArr[1] = f;
                            } else if (bleSleep2.getMMode() == 8) {
                                fArr = new float[2];
                                fArr[i] = 0.0f;
                                fArr[1] = 3 * f2;
                            } else {
                                fArr = new float[2];
                                fArr[i] = 0.0f;
                                fArr[1] = f;
                            }
                        } else {
                            int mMode2 = bleSleep.getMMode();
                            if (mMode2 == 1) {
                                fArr = new float[2];
                                fArr[i] = 0.0f;
                                fArr[1] = f2;
                            } else if (mMode2 == 2) {
                                fArr = new float[2];
                                fArr[i] = f2;
                                fArr[1] = f2;
                            } else if (mMode2 == 3) {
                                fArr = new float[2];
                                fArr[i] = 2 * f2;
                                fArr[1] = f2;
                            } else if (mMode2 == 8) {
                                fArr = new float[2];
                                fArr[i] = 0.0f;
                                fArr[1] = 3 * f2;
                            } else if (mMode2 == 9) {
                                fArr = new float[2];
                                float f3 = 2 * f2;
                                fArr[i] = f3;
                                fArr[1] = f3;
                            } else if (mMode2 != 17) {
                                fArr = new float[2];
                                fArr[i] = 0.0f;
                                fArr[1] = f;
                            } else if (bleSleep2.getMMode() == 8) {
                                fArr = new float[2];
                                fArr[i] = 0.0f;
                                fArr[1] = 3 * f2;
                            } else {
                                fArr = new float[2];
                                fArr[i] = 0.0f;
                                fArr[1] = f;
                            }
                        }
                        if (list != null) {
                            Application app = Utils.getApp();
                            Intrinsics.O10IXXX0X(app, "getApp(...)");
                            list.add(new BarEntry(i6, fArr, getBarColors(app, bleSleep.getMMode(), bleSleep2.getMMode())));
                        }
                        i6++;
                        if (mLocalTime3 != mLocalTime4) {
                            mLocalTime3++;
                            sleepAllDayViewDatas$default = sleepAllDayViewDatas$default;
                            mLocalTime = mLocalTime;
                            bleSleep2 = bleSleep2;
                        }
                    }
                } else {
                    sleepAllDayViewDatas$default = sleepAllDayViewDatas$default;
                    mLocalTime = mLocalTime;
                }
                i2 = i;
                mLocalTime2 = mLocalTime2;
                i5 = i7;
                sleepAllDayViewDatas$default = sleepAllDayViewDatas$default;
                mLocalTime = mLocalTime;
            }
        } else {
            i = 0;
        }
        int i8 = mLocalTime;
        int i9 = mLocalTime2;
        HashMap<Integer, Integer> sleepAllDayStatus = BleSleep.Companion.getSleepAllDayStatus(listAnalyseSleepAllDay);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Integer num = sleepAllDayStatus.get(2);
        sparseIntArray.put(2, num != null ? num.intValue() : i);
        Integer num2 = sleepAllDayStatus.get(1);
        sparseIntArray.put(1, num2 != null ? num2.intValue() : i);
        Integer num3 = sleepAllDayStatus.get(3);
        sparseIntArray.put(3, num3 != null ? num3.intValue() : i);
        Integer num4 = sleepAllDayStatus.get(9);
        sparseIntArray.put(9, num4 != null ? num4.intValue() : i);
        Integer num5 = sleepAllDayStatus.get(8);
        sparseIntArray.put(8, num5 != null ? num5.intValue() : i);
        return new SleepAllDayData(sparseIntArray.get(2) + sparseIntArray.get(1) + sparseIntArray.get(3) + sparseIntArray.get(9) + sparseIntArray.get(8), i8, i9, sparseIntArray, null, listAnalyseSleepAllDay, 16, null);
    }

    public final int filterDayData(@aa1 Context context, @aa1 List<Sleep> data, @aa1 LinkedHashMap<Long, ArrayList<Sleep>> monthData, @aa1 List<SleepAllDayData> sleepDayDataList, @aa1 List<BarEntry> values) {
        SleepAllDayData sleepAllDayDataFilterData$default;
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(monthData, "monthData");
        Intrinsics.X0O(sleepDayDataList, "sleepDayDataList");
        Intrinsics.X0O(values, "values");
        if (data.isEmpty()) {
            return 0;
        }
        Iterator<Sleep> it = data.iterator();
        while (true) {
            long j = 1;
            if (!it.hasNext()) {
                break;
            }
            Sleep next = it.next();
            for (Map.Entry<Long, ArrayList<Sleep>> entry : monthData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Sleep> value = entry.getValue();
                if (next.getMTime() >= (jLongValue - TimeUnit.DAYS.toMillis(j)) - ((long) O0X11OiO.iXiX011) && next.getMTime() <= jLongValue) {
                    value.add(next);
                }
                j = 1;
            }
        }
        Iterator<Map.Entry<Long, ArrayList<Sleep>>> it2 = monthData.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<Long, ArrayList<Sleep>> next2 = it2.next();
            long jLongValue2 = next2.getKey().longValue();
            ArrayList<Sleep> value2 = next2.getValue();
            long millis = jLongValue2 - TimeUnit.DAYS.toMillis(1L);
            i1O0OXO1O.OXO1.OXO1("zeroClockTime -> " + O0X11OiO.IO0iXO0O().format(Long.valueOf(millis)) + ", " + value2.size());
            SleepAllDayData sleepAllDayData = new SleepAllDayData(0, 0, 0, null, null, null, 63, null);
            if (value2.isEmpty()) {
                sleepAllDayDataFilterData$default = sleepAllDayData;
            } else {
                sleepAllDayDataFilterData$default = filterData$default(this, value2, 0.0f, null, millis, 6, null);
                if (sleepAllDayDataFilterData$default.getTotal() <= 60) {
                    sleepAllDayDataFilterData$default.setTotal(0);
                    sleepAllDayDataFilterData$default.setEvaluation(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
                } else if (sleepAllDayDataFilterData$default.getTotal() > 540) {
                    String string = context.getString(R.string.sleepyhead);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    sleepAllDayDataFilterData$default.setEvaluation(string);
                } else if (sleepAllDayDataFilterData$default.getTotal() <= 420) {
                    String string2 = context.getString(R.string.bad);
                    Intrinsics.O10IXXX0X(string2, "getString(...)");
                    sleepAllDayDataFilterData$default.setEvaluation(string2);
                } else if (sleepAllDayDataFilterData$default.getStatus().get(1) >= 120) {
                    String string3 = context.getString(R.string.good);
                    Intrinsics.O10IXXX0X(string3, "getString(...)");
                    sleepAllDayDataFilterData$default.setEvaluation(string3);
                } else if (sleepAllDayDataFilterData$default.getStatus().get(1) >= 60) {
                    String string4 = context.getString(R.string.general);
                    Intrinsics.O10IXXX0X(string4, "getString(...)");
                    sleepAllDayDataFilterData$default.setEvaluation(string4);
                } else {
                    String string5 = context.getString(R.string.bad);
                    Intrinsics.O10IXXX0X(string5, "getString(...)");
                    sleepAllDayDataFilterData$default.setEvaluation(string5);
                }
            }
            sleepDayDataList.add(sleepAllDayDataFilterData$default);
        }
        float f = 0.0f;
        int total = 0;
        int i = 0;
        for (SleepAllDayData sleepAllDayData2 : sleepDayDataList) {
            values.add(new BarEntry(f, sleepAllDayData2.getTotal() / 60.0f));
            f += 1.0f;
            if (sleepAllDayData2.getTotal() != 0) {
                total += sleepAllDayData2.getTotal();
                i++;
            }
        }
        LogUtils.m11128d(" sleep " + total);
        return total / (i != 0 ? i : 1);
    }

    @aa1
    public final int[] getBarColors(@aa1 Context context, int i, int i2) {
        Intrinsics.X0O(context, "context");
        if (i == 1) {
            return new int[]{ContextCompat.getColor(context, R.color.sleep_show_5), ContextCompat.getColor(context, R.color.sleep_show_5)};
        }
        if (i == 2) {
            return new int[]{ContextCompat.getColor(context, R.color.sleep_show_3), ContextCompat.getColor(context, R.color.sleep_show_3)};
        }
        if (i == 3) {
            return new int[]{ContextCompat.getColor(context, R.color.sleep_show_1), ContextCompat.getColor(context, R.color.sleep_show_1)};
        }
        if (i == 8) {
            return new int[]{ContextCompat.getColor(context, R.color.sleep_show_8), ContextCompat.getColor(context, R.color.sleep_show_8)};
        }
        if (i == 9) {
            return new int[]{ContextCompat.getColor(context, R.color.sleep_show_10), ContextCompat.getColor(context, R.color.sleep_show_10)};
        }
        if (i == 17 && i2 == 8) {
            return new int[]{ContextCompat.getColor(context, R.color.sleep_show_8), ContextCompat.getColor(context, R.color.sleep_show_8)};
        }
        return new int[]{ContextCompat.getColor(context, R.color.transparent), ContextCompat.getColor(context, R.color.transparent)};
    }
}
