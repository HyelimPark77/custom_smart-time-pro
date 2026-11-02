package com.sma.smartv3.model;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.p608db.entity.Electrocardiogram;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ECGDataParse {

    @aa1
    public static final ECGDataParse INSTANCE = new ECGDataParse();

    private ECGDataParse() {
    }

    public final void filterDayData(@aa1 Context context, @aa1 List<Electrocardiogram> data, @aa1 LinkedHashMap<Long, ArrayList<Electrocardiogram>> weekData, @aa1 List<ECGDayData> ecgDayDataList, @aa1 List<BarEntry> values) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(weekData, "weekData");
        Intrinsics.X0O(ecgDayDataList, "ecgDayDataList");
        Intrinsics.X0O(values, "values");
        for (Electrocardiogram electrocardiogram : data) {
            for (Map.Entry<Long, ArrayList<Electrocardiogram>> entry : weekData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Electrocardiogram> value = entry.getValue();
                if (electrocardiogram.getMTime() <= jLongValue) {
                    value.add(electrocardiogram);
                    break;
                }
            }
        }
        ecgDayDataList.clear();
        Iterator<Map.Entry<Long, ArrayList<Electrocardiogram>>> it = weekData.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<Electrocardiogram> value2 = it.next().getValue();
            ECGDayData eCGDayData = new ECGDayData(0, 0, 0, null, 15, null);
            if (value2.size() != 0) {
                Iterator<Electrocardiogram> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                int mValue = 0;
                while (it2.hasNext()) {
                    Electrocardiogram next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    Electrocardiogram electrocardiogram2 = next;
                    if (eCGDayData.getMin() == 0 || eCGDayData.getMin() > electrocardiogram2.getMValue()) {
                        eCGDayData.setMin(electrocardiogram2.getMValue());
                    }
                    if (eCGDayData.getMax() < electrocardiogram2.getMValue()) {
                        eCGDayData.setMax(electrocardiogram2.getMValue());
                    }
                    mValue += electrocardiogram2.getMValue();
                }
                eCGDayData.setAvg(mValue / value2.size());
                if (eCGDayData.getAvg() < 60) {
                    String string = context.getString(R.string.low);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    eCGDayData.setStatus(string);
                } else if (eCGDayData.getAvg() > 100) {
                    String string2 = context.getString(R.string.high);
                    Intrinsics.O10IXXX0X(string2, "getString(...)");
                    eCGDayData.setStatus(string2);
                } else {
                    String string3 = context.getString(R.string.normal);
                    Intrinsics.O10IXXX0X(string3, "getString(...)");
                    eCGDayData.setStatus(string3);
                }
            }
            ecgDayDataList.add(eCGDayData);
        }
        float f = 0.0f;
        for (ECGDayData eCGDayData2 : ecgDayDataList) {
            values.add(new BarEntry(f, new float[]{eCGDayData2.getMin(), eCGDayData2.getMax() - eCGDayData2.getMin()}));
            f += 1.0f;
        }
    }

    @aa1
    public final ECGDayData filterMinuteData(@aa1 long[] range, @aa1 List<Electrocardiogram> heartRates, @aa1 List<Entry> values) {
        Intrinsics.X0O(range, "range");
        Intrinsics.X0O(heartRates, "heartRates");
        Intrinsics.X0O(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = range[0];
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, range[1], 1000L);
        if (j <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(j), new ECGMinuteData(0, 0));
                if (j == jXO0O10) {
                    break;
                }
                j += 1000;
            }
        }
        int mValue = 0;
        int mValue2 = 0;
        for (Electrocardiogram electrocardiogram : heartRates) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                ECGMinuteData eCGMinuteData = (ECGMinuteData) entry.getValue();
                if (electrocardiogram.getMTime() <= jLongValue) {
                    eCGMinuteData.setTotal(eCGMinuteData.getTotal() + electrocardiogram.getMValue());
                    eCGMinuteData.setNum(eCGMinuteData.getNum() + 1);
                    break;
                }
            }
            if (mValue < electrocardiogram.getMValue()) {
                mValue = electrocardiogram.getMValue();
            }
            if (mValue2 == 0 || mValue2 > electrocardiogram.getMValue()) {
                mValue2 = electrocardiogram.getMValue();
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        float f = 0.0f;
        int i = 0;
        while (it.hasNext()) {
            ECGMinuteData eCGMinuteData2 = (ECGMinuteData) ((Map.Entry) it.next()).getValue();
            if (eCGMinuteData2.getNum() != 0 && eCGMinuteData2.getTotal() != 0) {
                int total = eCGMinuteData2.getTotal() / eCGMinuteData2.getNum();
                values.add(new Entry(f, total));
                i += total;
            }
            f += 1.0f;
        }
        return new ECGDayData(mValue, mValue2, values.size() != 0 ? i / values.size() : 0, null, 8, null);
    }
}
