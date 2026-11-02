package com.sma.smartv3.model;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class HRDataParse {

    @aa1
    public static final HRDataParse INSTANCE = new HRDataParse();

    private HRDataParse() {
    }

    public final void filterDayData(@aa1 Context context, @aa1 List<HeartRate> data, @aa1 LinkedHashMap<Long, ArrayList<HeartRate>> weekData, @aa1 List<HRDayData> hrDayDataList, @aa1 List<BarEntry> values) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(weekData, "weekData");
        Intrinsics.X0O(hrDayDataList, "hrDayDataList");
        Intrinsics.X0O(values, "values");
        for (HeartRate heartRate : data) {
            for (Map.Entry<Long, ArrayList<HeartRate>> entry : weekData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<HeartRate> value = entry.getValue();
                if (heartRate.getMTime() <= jLongValue) {
                    value.add(heartRate);
                    break;
                }
            }
        }
        hrDayDataList.clear();
        Iterator<Map.Entry<Long, ArrayList<HeartRate>>> it = weekData.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<HeartRate> value2 = it.next().getValue();
            HRDayData hRDayData = new HRDayData(0, 0, 0, null, 15, null);
            if (value2.size() != 0) {
                Iterator<HeartRate> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                int mBpm = 0;
                while (it2.hasNext()) {
                    HeartRate next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    HeartRate heartRate2 = next;
                    if (hRDayData.getMin() == 0 || hRDayData.getMin() > heartRate2.getMBpm()) {
                        hRDayData.setMin(heartRate2.getMBpm());
                    }
                    if (hRDayData.getMax() < heartRate2.getMBpm()) {
                        hRDayData.setMax(heartRate2.getMBpm());
                    }
                    mBpm += heartRate2.getMBpm();
                }
                hRDayData.setAvg(mBpm / value2.size());
                if (hRDayData.getAvg() < 60) {
                    String string = context.getString(R.string.low);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    hRDayData.setStatus(string);
                } else if (hRDayData.getAvg() > 100) {
                    String string2 = context.getString(R.string.high);
                    Intrinsics.O10IXXX0X(string2, "getString(...)");
                    hRDayData.setStatus(string2);
                } else {
                    String string3 = context.getString(R.string.normal);
                    Intrinsics.O10IXXX0X(string3, "getString(...)");
                    hRDayData.setStatus(string3);
                }
            }
            hrDayDataList.add(hRDayData);
        }
        float f = 0.0f;
        for (HRDayData hRDayData2 : hrDayDataList) {
            values.add(new BarEntry(f, new float[]{hRDayData2.getMin(), hRDayData2.getMax() - hRDayData2.getMin()}));
            f += 1.0f;
        }
    }

    @aa1
    public final HRDayData filterMinuteData(@aa1 long[] range, @aa1 List<HeartRate> heartRates, @aa1 List<Entry> values) {
        Intrinsics.X0O(range, "range");
        Intrinsics.X0O(heartRates, "heartRates");
        Intrinsics.X0O(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = range[0];
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, range[1], 60000L);
        if (j <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(j), new HRMinuteData(0, 0));
                if (j == jXO0O10) {
                    break;
                }
                j += 60000;
            }
        }
        int mBpm = 0;
        int mBpm2 = 0;
        for (HeartRate heartRate : heartRates) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                HRMinuteData hRMinuteData = (HRMinuteData) entry.getValue();
                if (heartRate.getMTime() <= jLongValue) {
                    hRMinuteData.setTotal(hRMinuteData.getTotal() + heartRate.getMBpm());
                    hRMinuteData.setNum(hRMinuteData.getNum() + 1);
                    break;
                }
            }
            if (mBpm < heartRate.getMBpm()) {
                mBpm = heartRate.getMBpm();
            }
            if (mBpm2 == 0 || mBpm2 > heartRate.getMBpm()) {
                mBpm2 = heartRate.getMBpm();
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        float f = 0.0f;
        int i = 0;
        while (it.hasNext()) {
            HRMinuteData hRMinuteData2 = (HRMinuteData) ((Map.Entry) it.next()).getValue();
            if (hRMinuteData2.getNum() != 0 && hRMinuteData2.getTotal() != 0) {
                int total = hRMinuteData2.getTotal() / hRMinuteData2.getNum();
                values.add(new Entry(f, total));
                i += total;
            }
            f += 1.0f;
        }
        return new HRDayData(mBpm, mBpm2, values.size() != 0 ? i / values.size() : 0, null, 8, null);
    }

    @aa1
    public final String getHeartRateStatus(int i) {
        if (i < 60) {
            return UtilsKt.XXO(R.string.data_lower);
        }
        return i > 100 ? UtilsKt.XXO(R.string.data_high) : UtilsKt.XXO(R.string.normal);
    }

    public final int getStateColor(@aa1 Context context, int i) {
        Intrinsics.X0O(context, "context");
        if (i < 60) {
            return ContextCompat.getColor(context, R.color.abh_level_color_high);
        }
        return i > 100 ? ContextCompat.getColor(context, R.color.abh_level_color_severely_high) : ContextCompat.getColor(context, R.color.abh_level_color_low);
    }
}
