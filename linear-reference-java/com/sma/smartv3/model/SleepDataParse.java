package com.sma.smartv3.model;

import android.content.Context;
import android.util.SparseIntArray;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.github.mikephil.charting.data.BarEntry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.entity.BleSleep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nSleepData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepData.kt\ncom/sma/smartv3/model/SleepDataParse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1573#2:175\n1604#2,4:176\n*S KotlinDebug\n*F\n+ 1 SleepData.kt\ncom/sma/smartv3/model/SleepDataParse\n*L\n31#1:175\n31#1:176,4\n*E\n"})
public final class SleepDataParse {

    @aa1
    public static final SleepDataParse INSTANCE = null;

    static {
        INSTANCE = new SleepDataParse();
    }

    private SleepDataParse() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepDayData filterData$default(SleepDataParse r0, List r1, float r2, List r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 100.0f;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = null;
    L9:
        return r0.filterData(r1, r2, r3);
    }

    @aa1
    public final SleepDayData filterData(@aa1 List<Sleep> r17, float r18, @tb1 List<BarEntry> r19) {
        Intrinsics.X0O(r17, "data");
        if (r17.isEmpty() == true) goto L5;
        int r3 = r17.get(0).getMAlgorithmType();
        List<Sleep> r0 = r17;
        ArrayList r4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r1 = r0.iterator();
        int r5 = 0;
    L8:
        if (r1.hasNext() == false) goto L16;
        Object r6 = r1.next();
        int r7 = r5 + 1;
        if (r5 >= 0) goto L12;
        CollectionsKt__CollectionsKt.XOX0O0();
    L12:
        Sleep r8 = (Sleep) r6;
        if (r8.getMMode() != 17) goto L15;
        r3 = r8.getMAlgorithmType();
    L15:
        r4.add(new BleSleep((int) (r8.getMTime() / ((long) 1000)), r8.getMMode(), r8.getMSoft(), r8.getMStrong()));
        r5 = r7;
        goto L8
    L16:
        LogUtils.d(new Object[]{"source " + r3 + " " + r4});
        List<BleSleep> r2 = BleSleep.Companion.analyseSleep(r4, r3);
        if (r2.isEmpty() == true) goto L19;
        int r9 = 0;
        int r10 = 0;
    L22:
        if (r9 >= (r2.size() - 1)) goto L40;
        BleSleep r11 = r2.get(r9);
        if (r9 != 0) goto L26;
        int r12 = r11.getMTime() / 60;
    L27:
        r9 = r9 + 1;
        int r13 = r2.get(r9).getMTime() / 60;
        if (r12 > r13) goto L22;
    L29:
        int r14 = r11.getMMode();
        if (r14 == 1) goto L34;
        if (r14 == 2) goto L33;
        float[] r15 = {0.0f, 0.0f, r18};
    L35:
        if (r19 == null) goto L37;
        r19.add(new BarEntry(r10, r15));
    L37:
        r10 = r10 + 1;
        if (r12 == r13) goto L22;
        r12 = r12 + 1;
        goto L29
    L33:
        r15 = new float[]{0.0f, r18, 0.0f};
        goto L35
    L34:
        r15 = new float[]{r18, 0.0f, 0.0f};
        goto L35
    L26:
        r12 = (r11.getMTime() / 60) + 1;
        goto L27
    L40:
        if (r3 != 1) goto L43;
        SparseIntArray r16 = BleSleep.Companion.getSleepStatusDuration(r2, r4);
        int r20 = r16.get(4);
    L45:
        return new SleepDayData(r20, ((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(r2)).getMTime(), r16, null, 8, null);
    L43:
        r16 = BleSleep.Companion.getSleepStatusDuration(r2);
        r20 = (r16.get(2) + r16.get(1)) + r16.get(3);
        goto L45
    L19:
        return new SleepDayData(0, 0, null, null, 15, null);
    L5:
        return new SleepDayData(0, 0, null, null, 15, null);
    }

    public final int filterDayData(@aa1 Context r17, @aa1 List<Sleep> r18, @aa1 LinkedHashMap<Long, ArrayList<Sleep>> r19, @aa1 List<SleepDayData> r20, @aa1 List<BarEntry> r21) {
        Intrinsics.X0O(r17, "context");
        Intrinsics.X0O(r18, "data");
        Intrinsics.X0O(r19, "monthData");
        Intrinsics.X0O(r20, "sleepDayDataList");
        Intrinsics.X0O(r21, "values");
        int r6 = 0;
        if (r18.isEmpty() == true) goto L66;
        Iterator<Sleep> r1 = r18.iterator();
    L6:
        if (r1.hasNext() == false) goto L13;
        Sleep r4 = r1.next();
        Iterator<Map.Entry<Long, ArrayList<Sleep>>> r7 = r19.entrySet().iterator();
    L9:
        if (r7.hasNext() == false) goto L6;
        Map.Entry<Long, ArrayList<Sleep>> r8 = r7.next();
        long r9 = r8.getKey().longValue();
        ArrayList<Sleep> r10 = r8.getValue();
        if (r4.getMTime() > r9) goto L9;
        r10.add(r4);
        goto L6
    L13:
        Iterator<Map.Entry<Long, ArrayList<Sleep>>> r2 = r19.entrySet().iterator();
    L14:
        int r5 = 1;
        if (r2.hasNext() == false) goto L35;
        ArrayList<Sleep> r11 = r2.next().getValue();
        SleepDayData r12 = new SleepDayData(0, 0, null, null, 15, null);
        if (r11.isEmpty() == true) goto L34;
        r12 = filterData$default(this, r11, 0.0f, null, 6, null);
        if (r12.getTotal() > 60) goto L21;
        r12.setTotal(0);
        r12.setEvaluation(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        goto L34
    L21:
        if (r12.getTotal() <= 540) goto L24;
        String r13 = r17.getString(R.string.sleepyhead);
        Intrinsics.O10IXXX0X(r13, "getString(...)");
        r12.setEvaluation(r13);
        goto L34
    L24:
        if (r12.getTotal() > 420) goto L26;
        String r14 = r17.getString(R.string.bad);
        Intrinsics.O10IXXX0X(r14, "getString(...)");
        r12.setEvaluation(r14);
        goto L34
    L26:
        if (r12.getStatus().get(1) < 120) goto L29;
        String r15 = r17.getString(R.string.good);
        Intrinsics.O10IXXX0X(r15, "getString(...)");
        r12.setEvaluation(r15);
        goto L34
    L29:
        if (r12.getStatus().get(1) < 60) goto L31;
        String r16 = r17.getString(R.string.general);
        Intrinsics.O10IXXX0X(r16, "getString(...)");
        r12.setEvaluation(r16);
        goto L34
    L31:
        String r22 = r17.getString(R.string.bad);
        Intrinsics.O10IXXX0X(r22, "getString(...)");
        r12.setEvaluation(r22);
    L34:
        r20.add(r12);
        goto L14
    L35:
        Iterator<SleepDayData> r0 = r20.iterator();
        float r3 = 0.0f;
        int r23 = 0;
    L37:
        if (r0.hasNext() == false) goto L41;
        SleepDayData r24 = r0.next();
        r21.add(new BarEntry(r3, r24.getTotal() / 60.0f));
        r3 = r3 + 1.0f;
        if (r24.getTotal() == 0) goto L37;
        r6 = r6 + r24.getTotal();
        r23 = r23 + 1;
        goto L37
    L41:
        LogUtils.d(new Object[]{" sleep " + r6});
        if (r23 == 0) goto L46;
        r5 = r23;
    L46:
        return r6 / r5;
    L66:
        return 0;
    }
}
