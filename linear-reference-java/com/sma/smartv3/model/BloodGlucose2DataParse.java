package com.sma.smartv3.model;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.BarEntry;
import com.sma.smartv3.db.entity.BloodGlucose2;
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
    public static final BloodGlucose2DataParse INSTANCE = null;

    static {
        INSTANCE = new BloodGlucose2DataParse();
    }

    private BloodGlucose2DataParse() {
    }

    public final void filterDayData(@aa1 Context r8, @aa1 List<BloodGlucose2> r9, @aa1 LinkedHashMap<Long, ArrayList<BloodGlucose2>> r10, @aa1 List<BloodGlucose2DayData> r11, @aa1 List<BarEntry> r12) {
        Intrinsics.X0O(r8, "context");
        Intrinsics.X0O(r9, "data");
        Intrinsics.X0O(r10, "weekData");
        Intrinsics.X0O(r11, "bloodGlucoseDayDataList");
        Intrinsics.X0O(r12, "values");
        Iterator<BloodGlucose2> r13 = r9.iterator();
    L4:
        if (r13.hasNext() == false) goto L11;
        BloodGlucose2 r14 = r13.next();
        Iterator<Map.Entry<Long, ArrayList<BloodGlucose2>>> r1 = r10.entrySet().iterator();
    L7:
        if (r1.hasNext() == false) goto L4;
        Map.Entry<Long, ArrayList<BloodGlucose2>> r2 = r1.next();
        long r3 = r2.getKey().longValue();
        ArrayList<BloodGlucose2> r4 = r2.getValue();
        if (r14.getMTime() >= r3) goto L7;
        r4.add(r14);
        goto L4
    L11:
        r11.clear();
        Iterator<Map.Entry<Long, ArrayList<BloodGlucose2>>> r15 = r10.entrySet().iterator();
    L13:
        if (r15.hasNext() == false) goto L18;
        ArrayList<BloodGlucose2> r16 = r15.next().getValue();
        BloodGlucose2DayData r5 = new BloodGlucose2DayData(0, 0, null, 7, null);
        BloodGlucose2 r17 = (BloodGlucose2) CollectionsKt___CollectionsKt.OI1O(r16, 0);
        if (r17 == null) goto L17;
        double r6 = 10;
        r5.setMin((int) (r17.getMLowerBound() * r6));
        r5.setMax((int) (r17.getMUpperBound() * r6));
    L17:
        r11.add(r5);
        goto L13
    L18:
        Iterator<BloodGlucose2DayData> r18 = r11.iterator();
        float r19 = 0.0f;
    L20:
        if (r18.hasNext() == false) goto L22;
        BloodGlucose2DayData r110 = r18.next();
        r12.add(new BarEntry(r19, new float[]{r110.getMin(), r110.getMax() - r110.getMin()}));
        r19 = r19 + 1.0f;
        goto L20
    }

    public final void filterHourData(@aa1 Context r9, @aa1 List<BloodGlucose2> r10, @aa1 LinkedHashMap<Long, ArrayList<BloodGlucose2>> r11, @aa1 List<BloodGlucose2DayData> r12, @aa1 List<BarEntry> r13) {
        Intrinsics.X0O(r9, "context");
        Intrinsics.X0O(r10, "data");
        Intrinsics.X0O(r11, "hourData");
        Intrinsics.X0O(r12, "hourDataList");
        Intrinsics.X0O(r13, "values");
        Iterator<BloodGlucose2> r14 = r10.iterator();
    L4:
        if (r14.hasNext() == false) goto L11;
        BloodGlucose2 r15 = r14.next();
        Iterator<Map.Entry<Long, ArrayList<BloodGlucose2>>> r2 = r11.entrySet().iterator();
    L7:
        if (r2.hasNext() == false) goto L4;
        Map.Entry<Long, ArrayList<BloodGlucose2>> r3 = r2.next();
        long r4 = r3.getKey().longValue();
        ArrayList<BloodGlucose2> r5 = r3.getValue();
        if (r15.getMTime() > r4) goto L7;
        r5.add(r15);
        goto L4
    L11:
        r12.clear();
        Iterator<Map.Entry<Long, ArrayList<BloodGlucose2>>> r16 = r11.entrySet().iterator();
        boolean r17 = false;
    L13:
        if (r16.hasNext() == false) goto L20;
        ArrayList<BloodGlucose2> r18 = r16.next().getValue();
        BloodGlucose2DayData r6 = new BloodGlucose2DayData(0, 0, null, 7, null);
        if (r17 == true) goto L19;
        BloodGlucose2 r19 = (BloodGlucose2) CollectionsKt___CollectionsKt.OI1O(r18, 0);
        if (r19 == null) goto L19;
        double r7 = 10;
        r6.setMin((int) (r19.getMLowerBound() * r7));
        r6.setMax((int) (r19.getMUpperBound() * r7));
        r17 = true;
    L19:
        r12.add(r6);
        goto L13
    L20:
        Iterator<BloodGlucose2DayData> r20 = r12.iterator();
        float r110 = 0.0f;
    L22:
        if (r20.hasNext() == false) goto L24;
        BloodGlucose2DayData r111 = r20.next();
        r13.add(new BarEntry(r110, new float[]{r111.getMin(), r111.getMax() - r111.getMin()}));
        r110 = r110 + 1.0f;
        goto L22
    }
}
