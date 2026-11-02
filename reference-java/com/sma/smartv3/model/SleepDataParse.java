package com.sma.smartv3.model;

import android.content.Context;
import android.util.SparseIntArray;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.github.mikephil.charting.data.BarEntry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.entity.BleSleep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nSleepData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepData.kt\ncom/sma/smartv3/model/SleepDataParse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1573#2:175\n1604#2,4:176\n*S KotlinDebug\n*F\n+ 1 SleepData.kt\ncom/sma/smartv3/model/SleepDataParse\n*L\n31#1:175\n31#1:176,4\n*E\n"})
public final class SleepDataParse {

    @aa1
    public static final SleepDataParse INSTANCE = new SleepDataParse();

    private SleepDataParse() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepDayData filterData$default(SleepDataParse sleepDataParse, List list, float f, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 100.0f;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        return sleepDataParse.filterData(list, f, list2);
    }

    @aa1
    public final SleepDayData filterData(@aa1 List<Sleep> data, float f, @tb1 List<BarEntry> list) {
        SparseIntArray sleepStatusDuration;
        int i;
        Intrinsics.X0O(data, "data");
        if (data.isEmpty()) {
            return new SleepDayData(0, 0, null, null, 15, null);
        }
        int mAlgorithmType = data.get(0).getMAlgorithmType();
        List<Sleep> list2 = data;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            Sleep sleep = (Sleep) obj;
            if (sleep.getMMode() == 17) {
                mAlgorithmType = sleep.getMAlgorithmType();
            }
            arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
            i2 = i3;
        }
        LogUtils.m11128d("source " + mAlgorithmType + " " + arrayList);
        List<BleSleep> listAnalyseSleep = BleSleep.Companion.analyseSleep(arrayList, mAlgorithmType);
        if (listAnalyseSleep.isEmpty()) {
            return new SleepDayData(0, 0, null, null, 15, null);
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < listAnalyseSleep.size() - 1) {
            BleSleep bleSleep = listAnalyseSleep.get(i4);
            int mTime = i4 == 0 ? bleSleep.getMTime() / 60 : (bleSleep.getMTime() / 60) + 1;
            i4++;
            int mTime2 = listAnalyseSleep.get(i4).getMTime() / 60;
            if (mTime <= mTime2) {
                while (true) {
                    int mMode = bleSleep.getMMode();
                    float[] fArr = mMode != 1 ? mMode != 2 ? new float[]{0.0f, 0.0f, f} : new float[]{0.0f, f, 0.0f} : new float[]{f, 0.0f, 0.0f};
                    if (list != null) {
                        list.add(new BarEntry(i5, fArr));
                    }
                    i5++;
                    if (mTime != mTime2) {
                        mTime++;
                    }
                }
            }
        }
        if (mAlgorithmType == 1) {
            sleepStatusDuration = BleSleep.Companion.getSleepStatusDuration(listAnalyseSleep, arrayList);
            i = sleepStatusDuration.get(4);
        } else {
            sleepStatusDuration = BleSleep.Companion.getSleepStatusDuration(listAnalyseSleep);
            i = sleepStatusDuration.get(2) + sleepStatusDuration.get(1) + sleepStatusDuration.get(3);
        }
        return new SleepDayData(i, ((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(listAnalyseSleep)).getMTime(), sleepStatusDuration, null, 8, null);
    }

    public final int filterDayData(@aa1 Context context, @aa1 List<Sleep> data, @aa1 LinkedHashMap<Long, ArrayList<Sleep>> monthData, @aa1 List<SleepDayData> sleepDayDataList, @aa1 List<BarEntry> values) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(monthData, "monthData");
        Intrinsics.X0O(sleepDayDataList, "sleepDayDataList");
        Intrinsics.X0O(values, "values");
        int total = 0;
        if (data.isEmpty()) {
            return 0;
        }
        for (Sleep sleep : data) {
            for (Map.Entry<Long, ArrayList<Sleep>> entry : monthData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Sleep> value = entry.getValue();
                if (sleep.getMTime() <= jLongValue) {
                    value.add(sleep);
                    break;
                }
            }
        }
        Iterator<Map.Entry<Long, ArrayList<Sleep>>> it = monthData.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ArrayList<Sleep> value2 = it.next().getValue();
            SleepDayData sleepDayData = new SleepDayData(0, 0, null, null, 15, null);
            if (!value2.isEmpty()) {
                sleepDayData = filterData$default(this, value2, 0.0f, null, 6, null);
                if (sleepDayData.getTotal() <= 60) {
                    sleepDayData.setTotal(0);
                    sleepDayData.setEvaluation(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
                } else if (sleepDayData.getTotal() > 540) {
                    String string = context.getString(R.string.sleepyhead);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    sleepDayData.setEvaluation(string);
                } else if (sleepDayData.getTotal() <= 420) {
                    String string2 = context.getString(R.string.bad);
                    Intrinsics.O10IXXX0X(string2, "getString(...)");
                    sleepDayData.setEvaluation(string2);
                } else if (sleepDayData.getStatus().get(1) >= 120) {
                    String string3 = context.getString(R.string.good);
                    Intrinsics.O10IXXX0X(string3, "getString(...)");
                    sleepDayData.setEvaluation(string3);
                } else if (sleepDayData.getStatus().get(1) >= 60) {
                    String string4 = context.getString(R.string.general);
                    Intrinsics.O10IXXX0X(string4, "getString(...)");
                    sleepDayData.setEvaluation(string4);
                } else {
                    String string5 = context.getString(R.string.bad);
                    Intrinsics.O10IXXX0X(string5, "getString(...)");
                    sleepDayData.setEvaluation(string5);
                }
            }
            sleepDayDataList.add(sleepDayData);
        }
        float f = 0.0f;
        int i = 0;
        for (SleepDayData sleepDayData2 : sleepDayDataList) {
            values.add(new BarEntry(f, sleepDayData2.getTotal() / 60.0f));
            f += 1.0f;
            if (sleepDayData2.getTotal() != 0) {
                total += sleepDayData2.getTotal();
                i++;
            }
        }
        LogUtils.m11128d(" sleep " + total);
        return total / (i != 0 ? i : 1);
    }
}
