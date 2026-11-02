package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.github.mikephil.charting.data.BarEntry;
import com.sma.smartv3.p608db.entity.Temperature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TemperatureDataParse {

    @aa1
    public static final TemperatureDataParse INSTANCE = new TemperatureDataParse();

    private TemperatureDataParse() {
    }

    public final void filterDayData(boolean z, @aa1 List<Temperature> data, @aa1 LinkedHashMap<Long, ArrayList<Temperature>> weekData, @aa1 List<TemperatureDayData> tempDayDataList, @aa1 List<BarEntry> values) {
        float f;
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(weekData, "weekData");
        Intrinsics.X0O(tempDayDataList, "tempDayDataList");
        Intrinsics.X0O(values, "values");
        for (Temperature temperature : data) {
            for (Map.Entry<Long, ArrayList<Temperature>> entry : weekData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Temperature> value = entry.getValue();
                if (temperature.getMTime() <= jLongValue) {
                    value.add(temperature);
                    break;
                }
            }
        }
        tempDayDataList.clear();
        Iterator<Map.Entry<Long, ArrayList<Temperature>>> it = weekData.entrySet().iterator();
        while (true) {
            f = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            ArrayList<Temperature> value2 = it.next().getValue();
            TemperatureDayData temperatureDayData = new TemperatureDayData(0.0f, 0.0f, 0.0f, 7, null);
            if (value2.size() != 0) {
                Iterator<Temperature> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                float f2 = 0.0f;
                while (it2.hasNext()) {
                    Temperature next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    float fIIiiO = cp5.iIiiO(next.getMTemperature(), z);
                    if (temperatureDayData.getMin() == 0.0f || temperatureDayData.getMin() > fIIiiO) {
                        temperatureDayData.setMin(fIIiiO);
                    }
                    if (temperatureDayData.getMax() < fIIiiO) {
                        temperatureDayData.setMax(fIIiiO);
                    }
                    f2 += fIIiiO;
                }
                temperatureDayData.setAvg(f2 / value2.size());
            }
            tempDayDataList.add(temperatureDayData);
        }
        for (TemperatureDayData temperatureDayData2 : tempDayDataList) {
            if (temperatureDayData2.getMax() == temperatureDayData2.getMin() && temperatureDayData2.getMin() > 30.0f) {
                temperatureDayData2.setMax(temperatureDayData2.getMax() + 0.01f);
            }
            values.add(new BarEntry(f, new float[]{temperatureDayData2.getMin(), temperatureDayData2.getMax() - temperatureDayData2.getMin()}));
            f += 1.0f;
        }
    }
}
