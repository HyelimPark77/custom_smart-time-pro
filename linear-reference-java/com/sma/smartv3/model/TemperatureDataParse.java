package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.github.mikephil.charting.data.BarEntry;
import com.sma.smartv3.db.entity.Temperature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TemperatureDataParse {

    @aa1
    public static final TemperatureDataParse INSTANCE = null;

    static {
        INSTANCE = new TemperatureDataParse();
    }

    private TemperatureDataParse() {
    }

    public final void filterDayData(boolean r8, @aa1 List<Temperature> r9, @aa1 LinkedHashMap<Long, ArrayList<Temperature>> r10, @aa1 List<TemperatureDayData> r11, @aa1 List<BarEntry> r12) {
        Intrinsics.X0O(r9, "data");
        Intrinsics.X0O(r10, "weekData");
        Intrinsics.X0O(r11, "tempDayDataList");
        Intrinsics.X0O(r12, "values");
        Iterator<Temperature> r13 = r9.iterator();
    L4:
        if (r13.hasNext() == false) goto L11;
        Temperature r0 = r13.next();
        Iterator<Map.Entry<Long, ArrayList<Temperature>>> r1 = r10.entrySet().iterator();
    L7:
        if (r1.hasNext() == false) goto L4;
        Map.Entry<Long, ArrayList<Temperature>> r2 = r1.next();
        long r3 = r2.getKey().longValue();
        ArrayList<Temperature> r4 = r2.getValue();
        if (r0.getMTime() > r3) goto L7;
        r4.add(r0);
        goto L4
    L11:
        r11.clear();
        Iterator<Map.Entry<Long, ArrayList<Temperature>>> r14 = r10.entrySet().iterator();
    L12:
        float r5 = 0.0f;
        if (r14.hasNext() == false) goto L31;
        ArrayList<Temperature> r15 = r14.next().getValue();
        TemperatureDayData r6 = new TemperatureDayData(0.0f, 0.0f, 0.0f, 7, null);
        if (r15.size() == 0) goto L30;
        Iterator<Temperature> r7 = r15.iterator();
        Intrinsics.O10IXXX0X(r7, "iterator(...)");
        float r16 = 0.0f;
    L18:
        if (r7.hasNext() == false) goto L29;
        Temperature r17 = r7.next();
        Intrinsics.O10IXXX0X(r17, "next(...)");
        float r18 = cp5.iIiiO(r17.getMTemperature(), r8);
        if (r6.getMin() != 0.0f) goto L23;
    L24:
        r6.setMin(r18);
    L26:
        if (r6.getMax() >= r18) goto L28;
        r6.setMax(r18);
    L28:
        r16 = r16 + r18;
        goto L18
    L23:
        if (r6.getMin() <= r18) goto L26;
    L29:
        r6.setAvg(r16 / r15.size());
    L30:
        r11.add(r6);
        goto L12
    L31:
        Iterator<TemperatureDayData> r19 = r11.iterator();
    L33:
        if (r19.hasNext() == false) goto L40;
        TemperatureDayData r20 = r19.next();
        if (r20.getMax() != r20.getMin()) goto L39;
        if (r20.getMin() <= 30.0f) goto L39;
        r20.setMax(r20.getMax() + 0.01f);
    L39:
        r12.add(new BarEntry(r5, new float[]{r20.getMin(), r20.getMax() - r20.getMin()}));
        r5 = r5 + 1.0f;
        goto L33
    }
}
