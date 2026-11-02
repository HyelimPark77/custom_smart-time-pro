package com.sma.smartv3.model;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.p608db.entity.Hrv;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class HRVDataParse {

    @aa1
    public static final HRVDataParse INSTANCE = new HRVDataParse();

    private HRVDataParse() {
    }

    public final void filterDayData(@aa1 Context context, @aa1 List<Hrv> data, @aa1 LinkedHashMap<Long, ArrayList<Hrv>> weekData, @aa1 List<HRVDayData> hrvDayDataList, @aa1 List<Entry> values) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(weekData, "weekData");
        Intrinsics.X0O(hrvDayDataList, "hrvDayDataList");
        Intrinsics.X0O(values, "values");
        for (Hrv hrv : data) {
            for (Map.Entry<Long, ArrayList<Hrv>> entry : weekData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Hrv> value = entry.getValue();
                if (hrv.getMTime() < jLongValue) {
                    value.add(hrv);
                    break;
                }
            }
        }
        hrvDayDataList.clear();
        Iterator<Map.Entry<Long, ArrayList<Hrv>>> it = weekData.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<Hrv> value2 = it.next().getValue();
            HRVDayData hRVDayData = new HRVDayData(0, 0, 0, null, 15, null);
            if (value2.size() != 0) {
                Iterator<Hrv> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                int mValue = 0;
                while (it2.hasNext()) {
                    Hrv next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    Hrv hrv2 = next;
                    if (hRVDayData.getMin() == 0 || hRVDayData.getMin() > hrv2.getMValue()) {
                        hRVDayData.setMin(hrv2.getMValue());
                    }
                    if (hRVDayData.getMax() < hrv2.getMValue()) {
                        hRVDayData.setMax(hrv2.getMValue());
                    }
                    mValue += hrv2.getMValue();
                }
                hRVDayData.setAvg(mValue / value2.size());
                if (hRVDayData.getAvg() < 60) {
                    String string = context.getString(R.string.low);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    hRVDayData.setStatus(string);
                } else if (hRVDayData.getAvg() > 100) {
                    String string2 = context.getString(R.string.high);
                    Intrinsics.O10IXXX0X(string2, "getString(...)");
                    hRVDayData.setStatus(string2);
                } else {
                    String string3 = context.getString(R.string.normal);
                    Intrinsics.O10IXXX0X(string3, "getString(...)");
                    hRVDayData.setStatus(string3);
                }
            }
            hrvDayDataList.add(hRVDayData);
        }
        float f = 0.0f;
        for (HRVDayData hRVDayData2 : hrvDayDataList) {
            if (hRVDayData2.getAvg() != 0) {
                values.add(new Entry(f, hRVDayData2.getAvg()));
            }
            f += 1.0f;
        }
    }

    @aa1
    public final HRVDayData filterMinuteData(@aa1 long[] range, @aa1 List<Hrv> hrvs, @aa1 List<Entry> values) {
        Intrinsics.X0O(range, "range");
        Intrinsics.X0O(hrvs, "hrvs");
        Intrinsics.X0O(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = range[0];
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, range[1], 60000L);
        if (j <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(j), new HRVMinuteData(0, 0));
                if (j == jXO0O10) {
                    break;
                }
                j += 60000;
            }
        }
        for (Hrv hrv : hrvs) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                HRVMinuteData hRVMinuteData = (HRVMinuteData) entry.getValue();
                if (hrv.getMTime() <= jLongValue) {
                    hRVMinuteData.setTotal(hRVMinuteData.getTotal() + hrv.getMValue());
                    hRVMinuteData.setNum(hRVMinuteData.getNum() + 1);
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
            HRVMinuteData hRVMinuteData2 = (HRVMinuteData) ((Map.Entry) it.next()).getValue();
            if (hRVMinuteData2.getNum() != 0 && hRVMinuteData2.getTotal() != 0) {
                int total = hRVMinuteData2.getTotal() / hRVMinuteData2.getNum();
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
        return new HRVDayData(i2, i3, values.size() != 0 ? i / values.size() : 0, null, 8, null);
    }
}
