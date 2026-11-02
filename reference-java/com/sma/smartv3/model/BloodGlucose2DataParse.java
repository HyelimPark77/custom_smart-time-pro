package com.sma.smartv3.model;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.BarEntry;
import com.sma.smartv3.p608db.entity.BloodGlucose2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BloodGlucose2DataParse {

    @aa1
    public static final BloodGlucose2DataParse INSTANCE = new BloodGlucose2DataParse();

    private BloodGlucose2DataParse() {
    }

    public final void filterDayData(@aa1 Context context, @aa1 List<BloodGlucose2> data, @aa1 LinkedHashMap<Long, ArrayList<BloodGlucose2>> weekData, @aa1 List<BloodGlucose2DayData> bloodGlucoseDayDataList, @aa1 List<BarEntry> values) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(weekData, "weekData");
        Intrinsics.X0O(bloodGlucoseDayDataList, "bloodGlucoseDayDataList");
        Intrinsics.X0O(values, "values");
        for (BloodGlucose2 bloodGlucose2 : data) {
            for (Map.Entry<Long, ArrayList<BloodGlucose2>> entry : weekData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<BloodGlucose2> value = entry.getValue();
                if (bloodGlucose2.getMTime() < jLongValue) {
                    value.add(bloodGlucose2);
                    break;
                }
            }
        }
        bloodGlucoseDayDataList.clear();
        Iterator<Map.Entry<Long, ArrayList<BloodGlucose2>>> it = weekData.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<BloodGlucose2> value2 = it.next().getValue();
            BloodGlucose2DayData bloodGlucose2DayData = new BloodGlucose2DayData(0, 0, null, 7, null);
            BloodGlucose2 bloodGlucose3 = (BloodGlucose2) CollectionsKt___CollectionsKt.OI1O(value2, 0);
            if (bloodGlucose3 != null) {
                double d = 10;
                bloodGlucose2DayData.setMin((int) (bloodGlucose3.getMLowerBound() * d));
                bloodGlucose2DayData.setMax((int) (bloodGlucose3.getMUpperBound() * d));
            }
            bloodGlucoseDayDataList.add(bloodGlucose2DayData);
        }
        float f = 0.0f;
        for (BloodGlucose2DayData bloodGlucose2DayData2 : bloodGlucoseDayDataList) {
            values.add(new BarEntry(f, new float[]{bloodGlucose2DayData2.getMin(), bloodGlucose2DayData2.getMax() - bloodGlucose2DayData2.getMin()}));
            f += 1.0f;
        }
    }

    public final void filterHourData(@aa1 Context context, @aa1 List<BloodGlucose2> data, @aa1 LinkedHashMap<Long, ArrayList<BloodGlucose2>> hourData, @aa1 List<BloodGlucose2DayData> hourDataList, @aa1 List<BarEntry> values) {
        BloodGlucose2 bloodGlucose2;
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(hourData, "hourData");
        Intrinsics.X0O(hourDataList, "hourDataList");
        Intrinsics.X0O(values, "values");
        for (BloodGlucose2 bloodGlucose3 : data) {
            for (Map.Entry<Long, ArrayList<BloodGlucose2>> entry : hourData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<BloodGlucose2> value = entry.getValue();
                if (bloodGlucose3.getMTime() <= jLongValue) {
                    value.add(bloodGlucose3);
                    break;
                }
            }
        }
        hourDataList.clear();
        Iterator<Map.Entry<Long, ArrayList<BloodGlucose2>>> it = hourData.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            ArrayList<BloodGlucose2> value2 = it.next().getValue();
            BloodGlucose2DayData bloodGlucose2DayData = new BloodGlucose2DayData(0, 0, null, 7, null);
            if (!z && (bloodGlucose2 = (BloodGlucose2) CollectionsKt___CollectionsKt.OI1O(value2, 0)) != null) {
                double d = 10;
                bloodGlucose2DayData.setMin((int) (bloodGlucose2.getMLowerBound() * d));
                bloodGlucose2DayData.setMax((int) (bloodGlucose2.getMUpperBound() * d));
                z = true;
            }
            hourDataList.add(bloodGlucose2DayData);
        }
        float f = 0.0f;
        for (BloodGlucose2DayData bloodGlucose2DayData2 : hourDataList) {
            values.add(new BarEntry(f, new float[]{bloodGlucose2DayData2.getMin(), bloodGlucose2DayData2.getMax() - bloodGlucose2DayData2.getMin()}));
            f += 1.0f;
        }
    }
}
