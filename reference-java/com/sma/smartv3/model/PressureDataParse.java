package com.sma.smartv3.model;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.p608db.entity.Pressure;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PressureDataParse {

    @aa1
    public static final PressureDataParse INSTANCE = new PressureDataParse();

    private PressureDataParse() {
    }

    public final void filterDayData(@aa1 Context context, @aa1 List<Pressure> data, @aa1 LinkedHashMap<Long, ArrayList<Pressure>> weekData, @aa1 List<PressureDayData> pressureDayDataList, @aa1 List<BarEntry> values) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(weekData, "weekData");
        Intrinsics.X0O(pressureDayDataList, "pressureDayDataList");
        Intrinsics.X0O(values, "values");
        for (Pressure pressure : data) {
            for (Map.Entry<Long, ArrayList<Pressure>> entry : weekData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Pressure> value = entry.getValue();
                if (pressure.getMTime() <= jLongValue) {
                    value.add(pressure);
                    break;
                }
            }
        }
        pressureDayDataList.clear();
        Iterator<Map.Entry<Long, ArrayList<Pressure>>> it = weekData.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<Pressure> value2 = it.next().getValue();
            PressureDayData pressureDayData = new PressureDayData(0, 0, 0, null, 15, null);
            if (value2.size() != 0) {
                Iterator<Pressure> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                int mValue = 0;
                while (it2.hasNext()) {
                    Pressure next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    Pressure pressure2 = next;
                    if (pressureDayData.getMin() == 0 || pressureDayData.getMin() > pressure2.getMValue()) {
                        pressureDayData.setMin(pressure2.getMValue());
                    }
                    if (pressureDayData.getMax() < pressure2.getMValue()) {
                        pressureDayData.setMax(pressure2.getMValue());
                    }
                    mValue += pressure2.getMValue();
                }
                pressureDayData.setAvg(mValue / value2.size());
                if (pressureDayData.getAvg() < 25) {
                    String string = context.getString(R.string.pressure_level_relax);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    pressureDayData.setStatus(string);
                } else if (pressureDayData.getAvg() < 50) {
                    String string2 = context.getString(R.string.pressure_level_normal);
                    Intrinsics.O10IXXX0X(string2, "getString(...)");
                    pressureDayData.setStatus(string2);
                } else if (pressureDayData.getAvg() < 75) {
                    String string3 = context.getString(R.string.pressure_level_moderate_stress);
                    Intrinsics.O10IXXX0X(string3, "getString(...)");
                    pressureDayData.setStatus(string3);
                } else {
                    String string4 = context.getString(R.string.pressure_level_overstress);
                    Intrinsics.O10IXXX0X(string4, "getString(...)");
                    pressureDayData.setStatus(string4);
                }
            }
            pressureDayDataList.add(pressureDayData);
        }
        float f = 0.0f;
        for (PressureDayData pressureDayData2 : pressureDayDataList) {
            int min = pressureDayData2.getMin();
            if (pressureDayData2.getMin() == pressureDayData2.getMax()) {
                min = 0;
            }
            float f2 = min;
            values.add(new BarEntry(f, new float[]{f2, pressureDayData2.getMax() - f2}, PressureDataKt.getBarColors(context, pressureDayData2.getAvg())));
            f += 1.0f;
        }
    }

    @aa1
    public final PressureDayData filterHourData(@aa1 Context context, @aa1 List<Pressure> data, @aa1 LinkedHashMap<Long, ArrayList<Pressure>> hourData, @aa1 List<PressureDayData> pressureHourDataList, @aa1 List<BarEntry> values) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(hourData, "hourData");
        Intrinsics.X0O(pressureHourDataList, "pressureHourDataList");
        Intrinsics.X0O(values, "values");
        for (Pressure pressure : data) {
            for (Map.Entry<Long, ArrayList<Pressure>> entry : hourData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Pressure> value = entry.getValue();
                if (pressure.getMTime() <= jLongValue) {
                    value.add(pressure);
                    break;
                }
            }
        }
        pressureHourDataList.clear();
        Iterator<Map.Entry<Long, ArrayList<Pressure>>> it = hourData.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<Pressure> value2 = it.next().getValue();
            PressureDayData pressureDayData = new PressureDayData(0, 0, 0, null, 15, null);
            if (value2.size() != 0) {
                Iterator<Pressure> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                int mValue = 0;
                while (it2.hasNext()) {
                    Pressure next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    Pressure pressure2 = next;
                    if (pressureDayData.getMin() == 0 || pressureDayData.getMin() > pressure2.getMValue()) {
                        pressureDayData.setMin(pressure2.getMValue());
                    }
                    if (pressureDayData.getMax() < pressure2.getMValue()) {
                        pressureDayData.setMax(pressure2.getMValue());
                    }
                    mValue += pressure2.getMValue();
                }
                pressureDayData.setAvg(mValue / value2.size());
                if (pressureDayData.getAvg() < 25) {
                    String string = context.getString(R.string.pressure_level_relax);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    pressureDayData.setStatus(string);
                } else if (pressureDayData.getAvg() < 50) {
                    String string2 = context.getString(R.string.pressure_level_normal);
                    Intrinsics.O10IXXX0X(string2, "getString(...)");
                    pressureDayData.setStatus(string2);
                } else if (pressureDayData.getAvg() < 75) {
                    String string3 = context.getString(R.string.pressure_level_moderate_stress);
                    Intrinsics.O10IXXX0X(string3, "getString(...)");
                    pressureDayData.setStatus(string3);
                } else {
                    String string4 = context.getString(R.string.pressure_level_overstress);
                    Intrinsics.O10IXXX0X(string4, "getString(...)");
                    pressureDayData.setStatus(string4);
                }
            }
            pressureHourDataList.add(pressureDayData);
        }
        int i = 0;
        int avg = 0;
        int avg2 = 0;
        float f = 0.0f;
        for (PressureDayData pressureDayData2 : pressureHourDataList) {
            float min = pressureDayData2.getMin();
            float max = pressureDayData2.getMax();
            values.add(new BarEntry(f, new float[]{0.0f, pressureDayData2.getAvg()}, PressureDataKt.getBarColors(context, pressureDayData2.getAvg())));
            if (i < max) {
                i = (int) max;
            }
            if (avg == 0) {
                avg = pressureDayData2.getAvg();
            }
            if (min != 0.0f && avg > min) {
                avg = (int) min;
            }
            avg2 += pressureDayData2.getAvg();
            f += 1.0f;
        }
        return new PressureDayData(i, avg, values.size() != 0 ? avg2 / values.size() : 0, null, 8, null);
    }

    @aa1
    public final PressureDayData filterMinuteData(@aa1 long[] range, @aa1 List<Pressure> pressures, @aa1 List<Entry> values) {
        Intrinsics.X0O(range, "range");
        Intrinsics.X0O(pressures, "pressures");
        Intrinsics.X0O(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = range[0];
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, range[1], 60000L);
        if (j <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(j), new PressureMinuteData(0, 0));
                if (j == jXO0O10) {
                    break;
                }
                j += 60000;
            }
        }
        for (Pressure pressure : pressures) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                PressureMinuteData pressureMinuteData = (PressureMinuteData) entry.getValue();
                if (pressure.getMTime() <= jLongValue) {
                    pressureMinuteData.setTotal(pressureMinuteData.getTotal() + pressure.getMValue());
                    pressureMinuteData.setNum(pressureMinuteData.getNum() + 1);
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
            PressureMinuteData pressureMinuteData2 = (PressureMinuteData) ((Map.Entry) it.next()).getValue();
            if (pressureMinuteData2.getNum() != 0 && pressureMinuteData2.getTotal() != 0) {
                int total = pressureMinuteData2.getTotal() / pressureMinuteData2.getNum();
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
        return new PressureDayData(i2, i3, values.size() != 0 ? i / values.size() : 0, null, 8, null);
    }
}
