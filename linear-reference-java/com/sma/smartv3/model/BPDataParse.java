package com.sma.smartv3.model;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.BarEntry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.time.DateUtils;

/* JADX INFO: loaded from: classes19.dex */
public final class BPDataParse {

    @aa1
    public static final BPDataParse INSTANCE = null;

    static {
        INSTANCE = new BPDataParse();
    }

    private BPDataParse() {
    }

    public final void filterDayData(@aa1 Context r11, @aa1 List<BloodPressure> r12, @aa1 LinkedHashMap<Long, ArrayList<BloodPressure>> r13, @aa1 List<BPDayData> r14, @aa1 List<BarEntry> r15) {
        Intrinsics.X0O(r11, "context");
        Intrinsics.X0O(r12, "data");
        Intrinsics.X0O(r13, "monthData");
        Intrinsics.X0O(r14, "bpDayDataList");
        Intrinsics.X0O(r15, "values");
        Iterator<BloodPressure> r16 = r12.iterator();
    L4:
        if (r16.hasNext() == false) goto L11;
        BloodPressure r2 = r16.next();
        Iterator<Map.Entry<Long, ArrayList<BloodPressure>>> r3 = r13.entrySet().iterator();
    L7:
        if (r3.hasNext() == false) goto L4;
        Map.Entry<Long, ArrayList<BloodPressure>> r4 = r3.next();
        long r5 = r4.getKey().longValue();
        ArrayList<BloodPressure> r6 = r4.getValue();
        if (r2.getMTime() > r5) goto L7;
        r6.add(r2);
        goto L4
    L11:
        r14.clear();
        Iterator<Map.Entry<Long, ArrayList<BloodPressure>>> r17 = r13.entrySet().iterator();
    L13:
        if (r17.hasNext() == false) goto L55;
        ArrayList<BloodPressure> r18 = r17.next().getValue();
        BPDayData r7 = new BPDayData(0, 0, 0, 0, null, 31, null);
        if (r18.size() == 0) goto L54;
        Iterator<BloodPressure> r19 = r18.iterator();
        Intrinsics.O10IXXX0X(r19, "iterator(...)");
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
    L18:
        if (r19.hasNext() == false) goto L41;
        BloodPressure r20 = r19.next();
        Intrinsics.O10IXXX0X(r20, "next(...)");
        BloodPressure r21 = r20;
        if (r21.getMDiastolic() == 0) goto L18;
        if (r21.getMSystolic() == 0) goto L18;
        if (r7.getDbpMin() != 0) goto L27;
    L28:
        r7.setDbpMin(r21.getMDiastolic());
    L30:
        if (r7.getDbpMax() >= r21.getMDiastolic()) goto L33;
        r7.setDbpMax(r21.getMDiastolic());
    L33:
        if (r7.getSbpMin() != 0) goto L35;
    L36:
        r7.setSbpMin(r21.getMSystolic());
    L38:
        if (r7.getSbpMax() >= r21.getMSystolic()) goto L40;
        r7.setSbpMax(r21.getMSystolic());
    L40:
        r9 = r9 + r21.getMDiastolic();
        r10 = r10 + r21.getMSystolic();
        r8 = r8 + 1;
        goto L18
    L35:
        if (r7.getSbpMin() <= r21.getMSystolic()) goto L38;
    L27:
        if (r7.getDbpMin() <= r21.getMDiastolic()) goto L30;
    L41:
        if (r8 == 0) goto L53;
        int r22 = r9 / r8;
        int r23 = r10 / r8;
        if (r23 < 140) goto L46;
        if (r22 < 90) goto L46;
        String r110 = r11.getString(R.string.high);
        Intrinsics.O10IXXX0X(r110, "getString(...)");
        r7.setStatus(r110);
    L46:
        if (90 > r23) goto L52;
        if (r23 >= 140) goto L52;
        if (60 > r22) goto L52;
        if (r22 >= 90) goto L52;
        String r111 = r11.getString(R.string.normal);
        Intrinsics.O10IXXX0X(r111, "getString(...)");
        r7.setStatus(r111);
    L52:
        String r112 = r11.getString(R.string.low);
        Intrinsics.O10IXXX0X(r112, "getString(...)");
        r7.setStatus(r112);
        goto L54
    L53:
        r7.setStatus(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
    L54:
        r14.add(r7);
        goto L13
    L55:
        Iterator<BPDayData> r113 = r14.iterator();
        float r114 = 0.0f;
    L57:
        if (r113.hasNext() == false) goto L59;
        BPDayData r115 = r113.next();
        r15.add(new BarEntry(r114, new float[]{r115.getDbpMin(), r115.getSbpMax() - r115.getDbpMin()}));
        r114 = r114 + 1.0f;
        goto L57
    }

    public final void filterHourData(@aa1 long[] r25, @aa1 List<BloodPressure> r26, @aa1 List<BPHourData> r27, @aa1 List<BarEntry> r28) {
        Intrinsics.X0O(r25, "range");
        Intrinsics.X0O(r26, "data");
        Intrinsics.X0O(r27, "hourData");
        Intrinsics.X0O(r28, "values");
        LinkedHashMap r3 = new LinkedHashMap();
        long r6 = r25[0];
        long r8 = ProgressionUtilKt.XO0O10(r6, r25[1], DateUtils.iO);
        if (r6 > r8) goto L7;
    L4:
        r3.put(Long.valueOf(r6), new BPHourData(0, 0, 0, 0, 0, 0, 0, 0, 255, null));
        if (r6 == r8) goto L7;
        r6 = r6 + DateUtils.iO;
    L7:
        Iterator<BloodPressure> r0 = r26.iterator();
    L9:
        if (r0.hasNext() == false) goto L32;
        BloodPressure r4 = r0.next();
        Iterator r7 = r3.entrySet().iterator();
    L12:
        if (r7.hasNext() == false) goto L9;
        Map.Entry r9 = (Map.Entry) r7.next();
        long r10 = ((Number) r9.getKey()).longValue();
        BPHourData r11 = (BPHourData) r9.getValue();
        if (r4.getMTime() >= r10) goto L12;
        if (r11.getDbpMax() >= r4.getMDiastolic()) goto L19;
        r11.setDbpMax(r4.getMDiastolic());
    L19:
        if (r11.getDbpMin() <= r4.getMDiastolic()) goto L21;
    L22:
        r11.setDbpMin(r4.getMDiastolic());
    L24:
        if (r11.getSbpMax() >= r4.getMSystolic()) goto L27;
        r11.setSbpMax(r4.getMSystolic());
    L27:
        if (r11.getSbpMin() <= r4.getMSystolic()) goto L29;
    L30:
        r11.setSbpMin(r4.getMSystolic());
    L31:
        r11.setDbpTotal(r11.getDbpTotal() + r4.getMDiastolic());
        r11.setDbpNum(r11.getDbpNum() + 1);
        r11.setSbpTotal(r11.getSbpTotal() + r4.getMSystolic());
        r11.setSbpNum(r11.getSbpNum() + 1);
        goto L9
    L29:
        if (r11.getSbpMin() != 0) goto L31;
    L21:
        if (r11.getDbpMin() != 0) goto L24;
    L32:
        r27.clear();
        Iterator r1 = r3.entrySet().iterator();
        int r5 = 0;
    L34:
        if (r1.hasNext() == false) goto L36;
        BPHourData r12 = (BPHourData) ((Map.Entry) r1.next()).getValue();
        r27.add(r12);
        r28.add(new BarEntry(r5, new float[]{r12.getDbpMin(), r12.getDbpMax() - r12.getDbpMin(), r12.getSbpMin() - r12.getDbpMax(), r12.getSbpMax() - r12.getSbpMin()}));
        r5 = r5 + 1;
        goto L34
    }
}
