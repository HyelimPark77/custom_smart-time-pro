package com.sma.smartv3.model;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.entity.BloodGlucose;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BloodGlucoseDataParse {

    @aa1
    public static final BloodGlucoseDataParse INSTANCE = null;

    static {
        INSTANCE = new BloodGlucoseDataParse();
    }

    private BloodGlucoseDataParse() {
    }

    public final void filterDayData(@aa1 Context r8, @aa1 List<BloodGlucose> r9, @aa1 LinkedHashMap<Long, ArrayList<BloodGlucose>> r10, @aa1 List<BloodGlucoseDayData> r11, @aa1 List<Entry> r12) {
        Intrinsics.X0O(r8, "context");
        Intrinsics.X0O(r9, "data");
        Intrinsics.X0O(r10, "weekData");
        Intrinsics.X0O(r11, "bloodGlucoseDayDataList");
        Intrinsics.X0O(r12, "values");
        Iterator<BloodGlucose> r13 = r9.iterator();
    L4:
        if (r13.hasNext() == false) goto L11;
        BloodGlucose r0 = r13.next();
        Iterator<Map.Entry<Long, ArrayList<BloodGlucose>>> r1 = r10.entrySet().iterator();
    L7:
        if (r1.hasNext() == false) goto L4;
        Map.Entry<Long, ArrayList<BloodGlucose>> r2 = r1.next();
        long r3 = r2.getKey().longValue();
        ArrayList<BloodGlucose> r4 = r2.getValue();
        if (r0.getMTime() >= r3) goto L7;
        r4.add(r0);
        goto L4
    L11:
        r11.clear();
        Iterator<Map.Entry<Long, ArrayList<BloodGlucose>>> r14 = r10.entrySet().iterator();
    L13:
        if (r14.hasNext() == false) goto L36;
        ArrayList<BloodGlucose> r15 = r14.next().getValue();
        BloodGlucoseDayData r5 = new BloodGlucoseDayData(0, 0, 0, null, 15, null);
        if (r15.size() == 0) goto L35;
        Iterator<BloodGlucose> r6 = r15.iterator();
        Intrinsics.O10IXXX0X(r6, "iterator(...)");
        int r7 = 0;
    L18:
        if (r6.hasNext() == false) goto L28;
        BloodGlucose r16 = r6.next();
        Intrinsics.O10IXXX0X(r16, "next(...)");
        BloodGlucose r17 = r16;
        if (r5.getMin() != 0) goto L22;
    L23:
        r5.setMin(r17.getMValue());
    L25:
        if (r5.getMax() >= r17.getMValue()) goto L27;
        r5.setMax(r17.getMValue());
    L27:
        r7 = r7 + r17.getMValue();
        goto L18
    L22:
        if (r5.getMin() <= r17.getMValue()) goto L25;
    L28:
        r5.setAvg(r7 / r15.size());
        if (r5.getAvg() >= 33) goto L32;
        String r18 = r8.getString(R.string.low);
        Intrinsics.O10IXXX0X(r18, "getString(...)");
        r5.setStatus(r18);
        goto L35
    L32:
        if (r5.getAvg() <= 70) goto L34;
        String r19 = r8.getString(R.string.high);
        Intrinsics.O10IXXX0X(r19, "getString(...)");
        r5.setStatus(r19);
        goto L35
    L34:
        String r110 = r8.getString(R.string.normal);
        Intrinsics.O10IXXX0X(r110, "getString(...)");
        r5.setStatus(r110);
    L35:
        r11.add(r5);
        goto L13
    L36:
        Iterator<BloodGlucoseDayData> r20 = r11.iterator();
        float r21 = 0.0f;
    L38:
        if (r20.hasNext() == false) goto L43;
        BloodGlucoseDayData r111 = r20.next();
        if (r111.getAvg() == 0) goto L42;
        r12.add(new Entry(r21, r111.getAvg()));
    L42:
        r21 = r21 + 1.0f;
        goto L38
    }

    @aa1
    public final BloodGlucoseDayData filterMinuteData(@aa1 long[] r20, @aa1 List<BloodGlucose> r21, @aa1 List<Entry> r22) {
        Intrinsics.X0O(r20, "range");
        Intrinsics.X0O(r21, "bloodGlucoses");
        Intrinsics.X0O(r22, "values");
        LinkedHashMap r2 = new LinkedHashMap();
        int r4 = 0;
        long r5 = r20[0];
        long r7 = ProgressionUtilKt.XO0O10(r5, r20[1], 60000);
        if (r5 > r7) goto L7;
    L4:
        r2.put(Long.valueOf(r5), new BloodGlucoseMinuteData(0, 0));
        if (r5 == r7) goto L7;
        r5 = r5 + 60000;
    L7:
        Iterator<BloodGlucose> r0 = r21.iterator();
    L9:
        if (r0.hasNext() == false) goto L16;
        BloodGlucose r3 = r0.next();
        Iterator r6 = r2.entrySet().iterator();
    L12:
        if (r6.hasNext() == false) goto L9;
        Map.Entry r8 = (Map.Entry) r6.next();
        long r9 = ((Number) r8.getKey()).longValue();
        BloodGlucoseMinuteData r10 = (BloodGlucoseMinuteData) r8.getValue();
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
        BloodGlucoseMinuteData r15 = (BloodGlucoseMinuteData) ((Map.Entry) r1.next()).getValue();
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
        return new BloodGlucoseDayData(r13, r14, r4, null, 8, null);
    }
}
