package com.sma.smartv3.model;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.entity.Pressure;
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
    public static final PressureDataParse INSTANCE = null;

    static {
        INSTANCE = new PressureDataParse();
    }

    private PressureDataParse() {
    }

    public final void filterDayData(@aa1 Context r9, @aa1 List<Pressure> r10, @aa1 LinkedHashMap<Long, ArrayList<Pressure>> r11, @aa1 List<PressureDayData> r12, @aa1 List<BarEntry> r13) {
        Intrinsics.X0O(r9, "context");
        Intrinsics.X0O(r10, "data");
        Intrinsics.X0O(r11, "weekData");
        Intrinsics.X0O(r12, "pressureDayDataList");
        Intrinsics.X0O(r13, "values");
        Iterator<Pressure> r14 = r10.iterator();
    L4:
        if (r14.hasNext() == false) goto L11;
        Pressure r1 = r14.next();
        Iterator<Map.Entry<Long, ArrayList<Pressure>>> r2 = r11.entrySet().iterator();
    L7:
        if (r2.hasNext() == false) goto L4;
        Map.Entry<Long, ArrayList<Pressure>> r3 = r2.next();
        long r4 = r3.getKey().longValue();
        ArrayList<Pressure> r5 = r3.getValue();
        if (r1.getMTime() > r4) goto L7;
        r5.add(r1);
        goto L4
    L11:
        r12.clear();
        Iterator<Map.Entry<Long, ArrayList<Pressure>>> r15 = r11.entrySet().iterator();
    L13:
        if (r15.hasNext() == false) goto L39;
        ArrayList<Pressure> r16 = r15.next().getValue();
        PressureDayData r6 = new PressureDayData(0, 0, 0, null, 15, null);
        if (r16.size() == 0) goto L38;
        Iterator<Pressure> r7 = r16.iterator();
        Intrinsics.O10IXXX0X(r7, "iterator(...)");
        int r8 = 0;
    L18:
        if (r7.hasNext() == false) goto L28;
        Pressure r17 = r7.next();
        Intrinsics.O10IXXX0X(r17, "next(...)");
        Pressure r18 = r17;
        if (r6.getMin() != 0) goto L22;
    L23:
        r6.setMin(r18.getMValue());
    L25:
        if (r6.getMax() >= r18.getMValue()) goto L27;
        r6.setMax(r18.getMValue());
    L27:
        r8 = r8 + r18.getMValue();
        goto L18
    L22:
        if (r6.getMin() <= r18.getMValue()) goto L25;
    L28:
        r6.setAvg(r8 / r16.size());
        if (r6.getAvg() >= 25) goto L32;
        String r19 = r9.getString(R.string.pressure_level_relax);
        Intrinsics.O10IXXX0X(r19, "getString(...)");
        r6.setStatus(r19);
        goto L38
    L32:
        if (r6.getAvg() >= 50) goto L35;
        String r110 = r9.getString(R.string.pressure_level_normal);
        Intrinsics.O10IXXX0X(r110, "getString(...)");
        r6.setStatus(r110);
        goto L38
    L35:
        if (r6.getAvg() >= 75) goto L37;
        String r111 = r9.getString(R.string.pressure_level_moderate_stress);
        Intrinsics.O10IXXX0X(r111, "getString(...)");
        r6.setStatus(r111);
        goto L38
    L37:
        String r112 = r9.getString(R.string.pressure_level_overstress);
        Intrinsics.O10IXXX0X(r112, "getString(...)");
        r6.setStatus(r112);
    L38:
        r12.add(r6);
        goto L13
    L39:
        Iterator<PressureDayData> r113 = r12.iterator();
        float r114 = 0.0f;
    L41:
        if (r113.hasNext() == false) goto L46;
        PressureDayData r115 = r113.next();
        int r20 = r115.getMin();
        if (r115.getMin() != r115.getMax()) goto L45;
        r20 = 0;
    L45:
        float r21 = r20;
        r13.add(new BarEntry(r114, new float[]{r21, r115.getMax() - r21}, PressureDataKt.getBarColors(r9, r115.getAvg())));
        r114 = r114 + 1.0f;
        goto L41
    }

    @aa1
    public final PressureDayData filterHourData(@aa1 Context r17, @aa1 List<Pressure> r18, @aa1 LinkedHashMap<Long, ArrayList<Pressure>> r19, @aa1 List<PressureDayData> r20, @aa1 List<BarEntry> r21) {
        int r3 = 0;
        Intrinsics.X0O(r17, "context");
        Intrinsics.X0O(r18, "data");
        Intrinsics.X0O(r19, "hourData");
        Intrinsics.X0O(r20, "pressureHourDataList");
        Intrinsics.X0O(r21, "values");
        Iterator<Pressure> r4 = r18.iterator();
    L4:
        if (r4.hasNext() == false) goto L11;
        Pressure r5 = r4.next();
        Iterator<Map.Entry<Long, ArrayList<Pressure>>> r7 = r19.entrySet().iterator();
    L7:
        if (r7.hasNext() == false) goto L4;
        Map.Entry<Long, ArrayList<Pressure>> r8 = r7.next();
        long r9 = r8.getKey().longValue();
        ArrayList<Pressure> r10 = r8.getValue();
        if (r5.getMTime() > r9) goto L7;
        r10.add(r5);
        goto L4
    L11:
        r20.clear();
        Iterator<Map.Entry<Long, ArrayList<Pressure>>> r6 = r19.entrySet().iterator();
    L13:
        if (r6.hasNext() == false) goto L39;
        ArrayList<Pressure> r11 = r6.next().getValue();
        PressureDayData r12 = new PressureDayData(0, 0, 0, null, 15, null);
        if (r11.size() == 0) goto L38;
        Iterator<Pressure> r13 = r11.iterator();
        Intrinsics.O10IXXX0X(r13, "iterator(...)");
        int r14 = 0;
    L18:
        if (r13.hasNext() == false) goto L28;
        Pressure r15 = r13.next();
        Intrinsics.O10IXXX0X(r15, "next(...)");
        Pressure r16 = r15;
        if (r12.getMin() != 0) goto L22;
    L23:
        r12.setMin(r16.getMValue());
    L25:
        if (r12.getMax() >= r16.getMValue()) goto L27;
        r12.setMax(r16.getMValue());
    L27:
        r14 = r14 + r16.getMValue();
        goto L18
    L22:
        if (r12.getMin() <= r16.getMValue()) goto L25;
    L28:
        r12.setAvg(r14 / r11.size());
        if (r12.getAvg() >= 25) goto L32;
        String r22 = r17.getString(R.string.pressure_level_relax);
        Intrinsics.O10IXXX0X(r22, "getString(...)");
        r12.setStatus(r22);
        goto L38
    L32:
        if (r12.getAvg() >= 50) goto L35;
        String r23 = r17.getString(R.string.pressure_level_normal);
        Intrinsics.O10IXXX0X(r23, "getString(...)");
        r12.setStatus(r23);
        goto L38
    L35:
        if (r12.getAvg() >= 75) goto L37;
        String r24 = r17.getString(R.string.pressure_level_moderate_stress);
        Intrinsics.O10IXXX0X(r24, "getString(...)");
        r12.setStatus(r24);
        goto L38
    L37:
        String r25 = r17.getString(R.string.pressure_level_overstress);
        Intrinsics.O10IXXX0X(r25, "getString(...)");
        r12.setStatus(r25);
    L38:
        r20.add(r12);
        goto L13
    L39:
        Iterator<PressureDayData> r1 = r20.iterator();
        int r26 = 0;
        int r27 = 0;
        int r28 = 0;
        float r29 = 0.0f;
    L41:
        if (r1.hasNext() == false) goto L55;
        PressureDayData r30 = r1.next();
        float r110 = r30.getMin();
        float r111 = r30.getMax();
        r21.add(new BarEntry(r29, new float[]{0.0f, r30.getAvg()}, PressureDataKt.getBarColors(r17, r30.getAvg())));
        if (r26 >= r111) goto L45;
        r26 = (int) r111;
    L45:
        if (r27 != 0) goto L48;
        r27 = r30.getAvg();
    L48:
        if (r110 == 0.0f) goto L53;
        if (r27 <= r110) goto L53;
        r27 = (int) r110;
    L53:
        r28 = r28 + r30.getAvg();
        r29 = r29 + 1.0f;
        goto L41
    L55:
        if (r21.size() == 0) goto L59;
        r3 = r28 / r21.size();
    L59:
        return new PressureDayData(r26, r27, r3, null, 8, null);
    }

    @aa1
    public final PressureDayData filterMinuteData(@aa1 long[] r20, @aa1 List<Pressure> r21, @aa1 List<Entry> r22) {
        Intrinsics.X0O(r20, "range");
        Intrinsics.X0O(r21, "pressures");
        Intrinsics.X0O(r22, "values");
        LinkedHashMap r2 = new LinkedHashMap();
        int r4 = 0;
        long r5 = r20[0];
        long r7 = ProgressionUtilKt.XO0O10(r5, r20[1], 60000);
        if (r5 > r7) goto L7;
    L4:
        r2.put(Long.valueOf(r5), new PressureMinuteData(0, 0));
        if (r5 == r7) goto L7;
        r5 = r5 + 60000;
    L7:
        Iterator<Pressure> r0 = r21.iterator();
    L9:
        if (r0.hasNext() == false) goto L16;
        Pressure r3 = r0.next();
        Iterator r6 = r2.entrySet().iterator();
    L12:
        if (r6.hasNext() == false) goto L9;
        Map.Entry r8 = (Map.Entry) r6.next();
        long r9 = ((Number) r8.getKey()).longValue();
        PressureMinuteData r10 = (PressureMinuteData) r8.getValue();
        if (r3.getMTime() > r9) goto L12;
        r10.setTotal(r10.getTotal() + r3.getMValue());
        r10.setNum(r10.getNum() + 1);
        goto L9
    L16:
        Iterator r1 = r2.entrySet().iterator();
        float r11 = 0.0f;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
    L18:
        if (r1.hasNext() == false) goto L34;
        PressureMinuteData r15 = (PressureMinuteData) ((Map.Entry) r1.next()).getValue();
        if (r15.getNum() == 0) goto L32;
        if (r15.getTotal() == 0) goto L32;
        int r16 = r15.getTotal() / r15.getNum();
        r22.add(new Entry(r11, r16));
        if (r13 >= r16) goto L26;
        r13 = r16;
    L26:
        if (r14 != 0) goto L28;
        r14 = r16;
    L28:
        if (1 > r16) goto L31;
        if (r16 >= r14) goto L31;
        r14 = r16;
    L31:
        r12 = r12 + r16;
    L32:
        r11 = r11 + 1.0f;
        goto L18
    L34:
        if (r22.size() == 0) goto L38;
        r4 = r12 / r22.size();
    L38:
        return new PressureDayData(r13, r14, r4, null, 8, null);
    }
}
