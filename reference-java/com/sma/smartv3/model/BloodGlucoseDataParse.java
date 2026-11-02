package com.sma.smartv3.model;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.p608db.entity.BloodGlucose;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BloodGlucoseDataParse {

    @aa1
    public static final BloodGlucoseDataParse INSTANCE = new BloodGlucoseDataParse();

    private BloodGlucoseDataParse() {
    }

    public final void filterDayData(@aa1 Context context, @aa1 List<BloodGlucose> data, @aa1 LinkedHashMap<Long, ArrayList<BloodGlucose>> weekData, @aa1 List<BloodGlucoseDayData> bloodGlucoseDayDataList, @aa1 List<Entry> values) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(weekData, "weekData");
        Intrinsics.X0O(bloodGlucoseDayDataList, "bloodGlucoseDayDataList");
        Intrinsics.X0O(values, "values");
        for (BloodGlucose bloodGlucose : data) {
            for (Map.Entry<Long, ArrayList<BloodGlucose>> entry : weekData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<BloodGlucose> value = entry.getValue();
                if (bloodGlucose.getMTime() < jLongValue) {
                    value.add(bloodGlucose);
                    break;
                }
            }
        }
        bloodGlucoseDayDataList.clear();
        Iterator<Map.Entry<Long, ArrayList<BloodGlucose>>> it = weekData.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<BloodGlucose> value2 = it.next().getValue();
            BloodGlucoseDayData bloodGlucoseDayData = new BloodGlucoseDayData(0, 0, 0, null, 15, null);
            if (value2.size() != 0) {
                Iterator<BloodGlucose> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                int mValue = 0;
                while (it2.hasNext()) {
                    BloodGlucose next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    BloodGlucose bloodGlucose2 = next;
                    if (bloodGlucoseDayData.getMin() == 0 || bloodGlucoseDayData.getMin() > bloodGlucose2.getMValue()) {
                        bloodGlucoseDayData.setMin(bloodGlucose2.getMValue());
                    }
                    if (bloodGlucoseDayData.getMax() < bloodGlucose2.getMValue()) {
                        bloodGlucoseDayData.setMax(bloodGlucose2.getMValue());
                    }
                    mValue += bloodGlucose2.getMValue();
                }
                bloodGlucoseDayData.setAvg(mValue / value2.size());
                if (bloodGlucoseDayData.getAvg() < 33) {
                    String string = context.getString(R.string.low);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    bloodGlucoseDayData.setStatus(string);
                } else if (bloodGlucoseDayData.getAvg() > 70) {
                    String string2 = context.getString(R.string.high);
                    Intrinsics.O10IXXX0X(string2, "getString(...)");
                    bloodGlucoseDayData.setStatus(string2);
                } else {
                    String string3 = context.getString(R.string.normal);
                    Intrinsics.O10IXXX0X(string3, "getString(...)");
                    bloodGlucoseDayData.setStatus(string3);
                }
            }
            bloodGlucoseDayDataList.add(bloodGlucoseDayData);
        }
        float f = 0.0f;
        for (BloodGlucoseDayData bloodGlucoseDayData2 : bloodGlucoseDayDataList) {
            if (bloodGlucoseDayData2.getAvg() != 0) {
                values.add(new Entry(f, bloodGlucoseDayData2.getAvg()));
            }
            f += 1.0f;
        }
    }

    @aa1
    public final BloodGlucoseDayData filterMinuteData(@aa1 long[] range, @aa1 List<BloodGlucose> bloodGlucoses, @aa1 List<Entry> values) {
        Intrinsics.X0O(range, "range");
        Intrinsics.X0O(bloodGlucoses, "bloodGlucoses");
        Intrinsics.X0O(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = range[0];
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, range[1], 60000L);
        if (j <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(j), new BloodGlucoseMinuteData(0, 0));
                if (j == jXO0O10) {
                    break;
                }
                j += 60000;
            }
        }
        for (BloodGlucose bloodGlucose : bloodGlucoses) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                BloodGlucoseMinuteData bloodGlucoseMinuteData = (BloodGlucoseMinuteData) entry.getValue();
                if (bloodGlucose.getMTime() <= jLongValue) {
                    bloodGlucoseMinuteData.setTotal(bloodGlucoseMinuteData.getTotal() + bloodGlucose.getMValue());
                    bloodGlucoseMinuteData.setNum(bloodGlucoseMinuteData.getNum() + 1);
                    break;
                }
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            BloodGlucoseMinuteData bloodGlucoseMinuteData2 = (BloodGlucoseMinuteData) ((Map.Entry) it.next()).getValue();
            if (bloodGlucoseMinuteData2.getNum() != 0 && bloodGlucoseMinuteData2.getTotal() != 0) {
                int total = bloodGlucoseMinuteData2.getTotal() / bloodGlucoseMinuteData2.getNum();
                values.add(new Entry(f, total));
                if (i2 < total) {
                    i2 = total;
                }
                if (i3 == 0) {
                    i3 = total;
                }
                if (1 <= total && total < i3) {
                    i3 = total;
                }
                i += total;
            }
            f += 1.0f;
        }
        return new BloodGlucoseDayData(i2, i3, values.size() != 0 ? i / values.size() : 0, null, 8, null);
    }
}
