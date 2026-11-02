package com.sma.smartv3.model;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.entity.HeartRate;
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
    public static final HRDataParse INSTANCE = null;

    static {
        INSTANCE = new HRDataParse();
    }

    private HRDataParse() {
    }

    public final void filterDayData(@aa1 Context r9, @aa1 List<HeartRate> r10, @aa1 LinkedHashMap<Long, ArrayList<HeartRate>> r11, @aa1 List<HRDayData> r12, @aa1 List<BarEntry> r13) {
        Intrinsics.X0O(r9, "context");
        Intrinsics.X0O(r10, "data");
        Intrinsics.X0O(r11, "weekData");
        Intrinsics.X0O(r12, "hrDayDataList");
        Intrinsics.X0O(r13, "values");
        Iterator<HeartRate> r14 = r10.iterator();
    L4:
        if (r14.hasNext() == false) goto L11;
        HeartRate r1 = r14.next();
        Iterator<Map.Entry<Long, ArrayList<HeartRate>>> r2 = r11.entrySet().iterator();
    L7:
        if (r2.hasNext() == false) goto L4;
        Map.Entry<Long, ArrayList<HeartRate>> r3 = r2.next();
        long r4 = r3.getKey().longValue();
        ArrayList<HeartRate> r5 = r3.getValue();
        if (r1.getMTime() > r4) goto L7;
        r5.add(r1);
        goto L4
    L11:
        r12.clear();
        Iterator<Map.Entry<Long, ArrayList<HeartRate>>> r15 = r11.entrySet().iterator();
    L13:
        if (r15.hasNext() == false) goto L36;
        ArrayList<HeartRate> r16 = r15.next().getValue();
        HRDayData r6 = new HRDayData(0, 0, 0, null, 15, null);
        if (r16.size() == 0) goto L35;
        Iterator<HeartRate> r7 = r16.iterator();
        Intrinsics.O10IXXX0X(r7, "iterator(...)");
        int r8 = 0;
    L18:
        if (r7.hasNext() == false) goto L28;
        HeartRate r17 = r7.next();
        Intrinsics.O10IXXX0X(r17, "next(...)");
        HeartRate r18 = r17;
        if (r6.getMin() != 0) goto L22;
    L23:
        r6.setMin(r18.getMBpm());
    L25:
        if (r6.getMax() >= r18.getMBpm()) goto L27;
        r6.setMax(r18.getMBpm());
    L27:
        r8 = r8 + r18.getMBpm();
        goto L18
    L22:
        if (r6.getMin() <= r18.getMBpm()) goto L25;
    L28:
        r6.setAvg(r8 / r16.size());
        if (r6.getAvg() >= 60) goto L32;
        String r19 = r9.getString(R.string.low);
        Intrinsics.O10IXXX0X(r19, "getString(...)");
        r6.setStatus(r19);
        goto L35
    L32:
        if (r6.getAvg() <= 100) goto L34;
        String r110 = r9.getString(R.string.high);
        Intrinsics.O10IXXX0X(r110, "getString(...)");
        r6.setStatus(r110);
        goto L35
    L34:
        String r111 = r9.getString(R.string.normal);
        Intrinsics.O10IXXX0X(r111, "getString(...)");
        r6.setStatus(r111);
    L35:
        r12.add(r6);
        goto L13
    L36:
        Iterator<HRDayData> r20 = r12.iterator();
        float r112 = 0.0f;
    L38:
        if (r20.hasNext() == false) goto L40;
        HRDayData r113 = r20.next();
        r13.add(new BarEntry(r112, new float[]{r113.getMin(), r113.getMax() - r113.getMin()}));
        r112 = r112 + 1.0f;
        goto L38
    }

    @aa1
    public final HRDayData filterMinuteData(@aa1 long[] r20, @aa1 List<HeartRate> r21, @aa1 List<Entry> r22) {
        Intrinsics.X0O(r20, "range");
        Intrinsics.X0O(r21, "heartRates");
        Intrinsics.X0O(r22, "values");
        LinkedHashMap r2 = new LinkedHashMap();
        int r4 = 0;
        long r5 = r20[0];
        long r7 = ProgressionUtilKt.XO0O10(r5, r20[1], 60000);
        if (r5 > r7) goto L7;
    L4:
        r2.put(Long.valueOf(r5), new HRMinuteData(0, 0));
        if (r5 == r7) goto L7;
        r5 = r5 + 60000;
    L7:
        Iterator<HeartRate> r0 = r21.iterator();
        int r13 = 0;
        int r14 = 0;
    L9:
        if (r0.hasNext() == false) goto L23;
        HeartRate r3 = r0.next();
        Iterator r6 = r2.entrySet().iterator();
    L12:
        if (r6.hasNext() == false) goto L17;
        Map.Entry r8 = (Map.Entry) r6.next();
        long r9 = ((Number) r8.getKey()).longValue();
        HRMinuteData r10 = (HRMinuteData) r8.getValue();
        if (r3.getMTime() > r9) goto L12;
        r10.setTotal(r10.getTotal() + r3.getMBpm());
        r10.setNum(r10.getNum() + 1);
    L17:
        if (r13 >= r3.getMBpm()) goto L19;
        r13 = r3.getMBpm();
    L19:
        if (r14 == 0) goto L22;
        if (r14 <= r3.getMBpm()) goto L9;
    L22:
        r14 = r3.getMBpm();
        goto L9
    L23:
        Iterator r1 = r2.entrySet().iterator();
        float r11 = 0.0f;
        int r12 = 0;
    L25:
        if (r1.hasNext() == false) goto L33;
        HRMinuteData r15 = (HRMinuteData) ((Map.Entry) r1.next()).getValue();
        if (r15.getNum() == 0) goto L31;
        if (r15.getTotal() == 0) goto L31;
        int r16 = r15.getTotal() / r15.getNum();
        r22.add(new Entry(r11, r16));
        r12 = r12 + r16;
    L31:
        r11 = r11 + 1.0f;
        goto L25
    L33:
        if (r22.size() == 0) goto L37;
        r4 = r12 / r22.size();
    L37:
        return new HRDayData(r13, r14, r4, null, 8, null);
    }

    @aa1
    public final String getHeartRateStatus(int r2) {
        if (r2 >= 60) goto L7;
        return UtilsKt.XXO(R.string.data_lower);
    L7:
        if (r2 <= 100) goto L11;
        return UtilsKt.XXO(R.string.data_high);
    L11:
        return UtilsKt.XXO(R.string.normal);
    }

    public final int getStateColor(@aa1 Context r2, int r3) {
        Intrinsics.X0O(r2, "context");
        if (r3 >= 60) goto L7;
        return ContextCompat.getColor(r2, R.color.abh_level_color_high);
    L7:
        if (r3 <= 100) goto L11;
        return ContextCompat.getColor(r2, R.color.abh_level_color_severely_high);
    L11:
        return ContextCompat.getColor(r2, R.color.abh_level_color_low);
    }
}
