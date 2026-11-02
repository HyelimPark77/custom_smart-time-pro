package com.sma.smartv3.model;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.p608db.entity.BloodOxygen;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BloodOxyGenDataParse {

    @aa1
    public static final BloodOxyGenDataParse INSTANCE = new BloodOxyGenDataParse();

    private BloodOxyGenDataParse() {
    }

    public final void filterDayData(@aa1 Context context, @aa1 List<BloodOxygen> data, @aa1 LinkedHashMap<Long, ArrayList<BloodOxygen>> weekData, @aa1 List<BloodOxyGenDayData> bloodOxyGenDayDataList, @aa1 List<Entry> values) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(weekData, "weekData");
        Intrinsics.X0O(bloodOxyGenDayDataList, "bloodOxyGenDayDataList");
        Intrinsics.X0O(values, "values");
        for (BloodOxygen bloodOxygen : data) {
            for (Map.Entry<Long, ArrayList<BloodOxygen>> entry : weekData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<BloodOxygen> value = entry.getValue();
                if (bloodOxygen.getMTime() < jLongValue) {
                    value.add(bloodOxygen);
                    break;
                }
            }
        }
        bloodOxyGenDayDataList.clear();
        Iterator<Map.Entry<Long, ArrayList<BloodOxygen>>> it = weekData.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<BloodOxygen> value2 = it.next().getValue();
            BloodOxyGenDayData bloodOxyGenDayData = new BloodOxyGenDayData(0, 0, 0, null, 15, null);
            if (value2.size() != 0) {
                Iterator<BloodOxygen> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                int mValue = 0;
                while (it2.hasNext()) {
                    BloodOxygen next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    BloodOxygen bloodOxygen2 = next;
                    if (bloodOxyGenDayData.getMin() == 0 || bloodOxyGenDayData.getMin() > bloodOxygen2.getMValue()) {
                        bloodOxyGenDayData.setMin(bloodOxygen2.getMValue());
                    }
                    if (bloodOxyGenDayData.getMax() < bloodOxygen2.getMValue()) {
                        bloodOxyGenDayData.setMax(bloodOxygen2.getMValue());
                    }
                    mValue += bloodOxygen2.getMValue();
                }
                bloodOxyGenDayData.setAvg(mValue / value2.size());
                if (bloodOxyGenDayData.getAvg() < 92) {
                    String string = context.getString(R.string.low);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    bloodOxyGenDayData.setStatus(string);
                } else {
                    String string2 = context.getString(R.string.normal);
                    Intrinsics.O10IXXX0X(string2, "getString(...)");
                    bloodOxyGenDayData.setStatus(string2);
                }
            }
            bloodOxyGenDayDataList.add(bloodOxyGenDayData);
        }
        float f = 0.0f;
        for (BloodOxyGenDayData bloodOxyGenDayData2 : bloodOxyGenDayDataList) {
            if (bloodOxyGenDayData2.getAvg() != 0) {
                values.add(new Entry(f, bloodOxyGenDayData2.getAvg()));
            }
            f += 1.0f;
        }
    }

    @aa1
    public final BloodOxyGenDayData filterMinuteData(@aa1 long[] range, @aa1 List<BloodOxygen> bloodOxygens, @aa1 List<Entry> values) {
        Intrinsics.X0O(range, "range");
        Intrinsics.X0O(bloodOxygens, "bloodOxygens");
        Intrinsics.X0O(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = range[0];
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, range[1], 60000L);
        if (j <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(j), new BloodOxyGenMinuteData(0, 0));
                if (j == jXO0O10) {
                    break;
                }
                j += 60000;
            }
        }
        for (BloodOxygen bloodOxygen : bloodOxygens) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                BloodOxyGenMinuteData bloodOxyGenMinuteData = (BloodOxyGenMinuteData) entry.getValue();
                if (bloodOxygen.getMTime() <= jLongValue) {
                    bloodOxyGenMinuteData.setTotal(bloodOxyGenMinuteData.getTotal() + bloodOxygen.getMValue());
                    bloodOxyGenMinuteData.setNum(bloodOxyGenMinuteData.getNum() + 1);
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
            BloodOxyGenMinuteData bloodOxyGenMinuteData2 = (BloodOxyGenMinuteData) ((Map.Entry) it.next()).getValue();
            if (bloodOxyGenMinuteData2.getNum() != 0 && bloodOxyGenMinuteData2.getTotal() != 0) {
                int total = bloodOxyGenMinuteData2.getTotal() / bloodOxyGenMinuteData2.getNum();
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
        return new BloodOxyGenDayData(i2, i3, values.size() != 0 ? i / values.size() : 0, null, 8, null);
    }

    @aa1
    public final int[] getBarColors(@aa1 Context context, int i) {
        Intrinsics.X0O(context, "context");
        return i >= 90 ? new int[]{ContextCompat.getColor(context, R.color.adh_blood_oxy_secondary_4_color), ContextCompat.getColor(context, R.color.adh_blood_oxy_secondary_4_color)} : new int[]{ContextCompat.getColor(context, R.color.abh_level_color_severely_high), ContextCompat.getColor(context, R.color.abh_level_color_severely_high)};
    }
}
