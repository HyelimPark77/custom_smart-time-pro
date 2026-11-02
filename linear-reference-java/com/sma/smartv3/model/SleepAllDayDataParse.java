package com.sma.smartv3.model;

import android.app.Application;
import android.content.Context;
import android.util.SparseIntArray;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import com.github.mikephil.charting.data.BarEntry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.entity.BleSleep;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nSleepAllDayData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAllDayData.kt\ncom/sma/smartv3/model/SleepAllDayDataParse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n1#1,344:1\n1563#2:345\n1634#2,3:346\n1878#2,3:349\n31#3:352\n31#3:353\n31#3:354\n31#3:355\n31#3:356\n*S KotlinDebug\n*F\n+ 1 SleepAllDayData.kt\ncom/sma/smartv3/model/SleepAllDayDataParse\n*L\n42#1:345\n42#1:346,3\n56#1:349,3\n179#1:352\n180#1:353\n181#1:354\n182#1:355\n183#1:356\n*E\n"})
public final class SleepAllDayDataParse {

    @aa1
    public static final SleepAllDayDataParse INSTANCE = null;

    static {
        INSTANCE = new SleepAllDayDataParse();
    }

    private SleepAllDayDataParse() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepAllDayData filterData$default(SleepAllDayDataParse r6, List r7, float r8, List r9, long r10, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        r8 = 100.0f;
    L5:
        float r2 = r8;
        if ((r12 & 4) == 0) goto L8;
        r9 = null;
    L8:
        List r3 = r9;
        if ((r12 & 8) == 0) goto L12;
        r10 = 0;
    L12:
        return r6.filterData(r7, r2, r3, r10);
    }

    @aa1
    public final SleepAllDayData filterData(@aa1 List<Sleep> r30, float r31, @tb1 List<BarEntry> r32, long r33) {
        Intrinsics.X0O(r30, "data");
        if (r30.isEmpty() == true) goto L5;
        BleSleep.Companion r2 = BleSleep.Companion;
        List<Sleep> r0 = r30;
        ArrayList r3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r1 = r0.iterator();
    L8:
        if (r1.hasNext() == false) goto L10;
        Sleep r4 = (Sleep) r1.next();
        r3.add(new BleSleep((int) BleReadable.Companion.millisToTime(r4.getMTime()), r4.getMMode(), r4.getMSoft(), r4.getMStrong()));
        goto L8
    L10:
        List<BleSleep> r10 = r2.analyseSleepAllDay(r3, r33);
        if (r10.isEmpty() == true) goto L13;
        int r5 = 0;
        List r6 = BleSleep.Companion.getSleepAllDayViewDatas$default(BleSleep.Companion, r10, false, 2, null);
        Iterator r7 = r6.iterator();
        int r8 = 0;
    L16:
        if (r7.hasNext() == false) goto L21;
        Object r9 = r7.next();
        int r11 = r8 + 1;
        if (r8 >= 0) goto L20;
        CollectionsKt__CollectionsKt.XOX0O0();
    L20:
        i1O0OXO1O.OXO1.OXO1("analyseSleepAllDayView -> " + r8 + " " + ((BleSleep) r9));
        r8 = r11;
        goto L16
    L21:
        long r12 = 1000;
        int r13 = (int) (((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(r10)).getMLocalTime() / r12);
        int r14 = (int) (((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r10)).getMLocalTime() / r12);
        List r15 = r6;
        if (r15.isEmpty() == true) goto L25;
        r13 = (int) (((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(r6)).getMLocalTime() / r12);
        r14 = (int) (((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r6)).getMLocalTime() / r12);
    L25:
        if (r15.isEmpty() == true) goto L87;
        float r16 = r31 / 4;
        int r17 = 0;
        int r18 = 0;
    L27:
        int r34 = r5;
        if (r17 >= (r6.size() - 1)) goto L86;
        BleSleep r19 = (BleSleep) r6.get(r17);
        if (r17 != 0) goto L32;
        long r20 = (r19.getMLocalTime() / r12) / ((long) 60);
    L33:
        int r110 = r17 + 1;
        BleSleep r111 = (BleSleep) r6.get(r110);
        long r21 = (r111.getMLocalTime() / r12) / ((long) 60);
        if (r20 <= r21) goto L36;
        r6 = r6;
        r13 = r13;
    L85:
        r5 = r34;
        r14 = r14;
        r17 = r110;
        r6 = r6;
        r13 = r13;
    L36:
        if (i72.OXO1.iX01() == false) goto L58;
        int r22 = r19.getMMode();
        if (r22 != 1) goto L40;
        float[] r23 = new float[2];
        r23[r34] = 0.0f;
        r23[1] = r16;
    L78:
        if (r32 == null) goto L81;
        Application r112 = Utils.getApp();
        Intrinsics.O10IXXX0X(r112, "getApp(...)");
        r32.add(new BarEntry(r18, r23, getBarColors(r112, r19.getMMode(), r111.getMMode())));
    L81:
        r18 = r18 + 1;
        if (r20 == r21) goto L85;
        r20 = r20 + 1;
        r6 = r6;
        r13 = r13;
        r111 = r111;
        goto L36
    L40:
        if (r22 != 2) goto L42;
        r23 = new float[2];
        r23[r34] = r16;
        r23[1] = r16;
        goto L78
    L42:
        if (r22 != 3) goto L44;
        r23 = new float[2];
        r23[r34] = 3 * r16;
        r23[1] = r16;
        goto L78
    L44:
        if (r22 != 8) goto L46;
        r23 = new float[2];
        r23[r34] = 0.0f;
        r23[1] = 3 * r16;
        goto L78
    L46:
        if (r22 == 9) goto L53;
        if (r22 == 17) goto L50;
        r23 = new float[2];
        r23[r34] = 0.0f;
        r23[1] = r31;
        goto L78
    L50:
        if (r111.getMMode() != 8) goto L52;
        r23 = new float[2];
        r23[r34] = 0.0f;
        r23[1] = 3 * r16;
        goto L78
    L52:
        r23 = new float[2];
        r23[r34] = 0.0f;
        r23[1] = r31;
        goto L78
    L53:
        r23 = new float[2];
        r23[r34] = 2 * r16;
        r23[1] = r16;
        goto L78
    L58:
        int r24 = r19.getMMode();
        if (r24 == 1) goto L77;
        if (r24 != 2) goto L62;
        r23 = new float[2];
        r23[r34] = r16;
        r23[1] = r16;
        goto L78
    L62:
        if (r24 != 3) goto L64;
        r23 = new float[2];
        r23[r34] = 2 * r16;
        r23[1] = r16;
        goto L78
    L64:
        if (r24 != 8) goto L66;
        r23 = new float[2];
        r23[r34] = 0.0f;
        r23[1] = 3 * r16;
        goto L78
    L66:
        if (r24 == 9) goto L73;
        if (r24 == 17) goto L70;
        r23 = new float[2];
        r23[r34] = 0.0f;
        r23[1] = r31;
        goto L78
    L70:
        if (r111.getMMode() != 8) goto L72;
        r23 = new float[2];
        r23[r34] = 0.0f;
        r23[1] = 3 * r16;
        goto L78
    L72:
        r23 = new float[2];
        r23[r34] = 0.0f;
        r23[1] = r31;
        goto L78
    L73:
        r23 = new float[2];
        float r113 = 2 * r16;
        r23[r34] = r113;
        r23[1] = r113;
        goto L78
    L77:
        r23 = new float[2];
        r23[r34] = 0.0f;
        r23[1] = r16;
        goto L78
    L32:
        r20 = ((r19.getMLocalTime() / r12) / ((long) 60)) + 1;
    L86:
        int r25 = r13;
        int r114 = r14;
        HashMap<Integer, Integer> r26 = BleSleep.Companion.getSleepAllDayStatus(r10);
        SparseIntArray r27 = new SparseIntArray();
        Integer r28 = r26.get(2);
        if (r28 == null) goto L91;
        int r29 = r28.intValue();
    L92:
        r27.put(2, r29);
        Integer r35 = r26.get(1);
        if (r35 == null) goto L95;
        int r36 = r35.intValue();
    L96:
        r27.put(1, r36);
        Integer r37 = r26.get(3);
        if (r37 == null) goto L99;
        int r38 = r37.intValue();
    L100:
        r27.put(3, r38);
        Integer r39 = r26.get(9);
        if (r39 == null) goto L103;
        int r40 = r39.intValue();
    L104:
        r27.put(9, r40);
        Integer r41 = r26.get(8);
        if (r41 == null) goto L107;
        int r42 = r41.intValue();
    L108:
        r27.put(8, r42);
        return new SleepAllDayData((((r27.get(2) + r27.get(1)) + r27.get(3)) + r27.get(9)) + r27.get(8), r25, r114, r27, null, r10, 16, null);
    L107:
        r42 = r34;
        goto L108
    L103:
        r40 = r34;
        goto L104
    L99:
        r38 = r34;
        goto L100
    L95:
        r36 = r34;
        goto L96
    L91:
        r29 = r34;
        goto L92
    L87:
        r34 = 0;
        goto L86
    L13:
        return new SleepAllDayData(0, 0, 0, null, null, null, 63, null);
    L5:
        return new SleepAllDayData(0, 0, 0, null, null, null, 63, null);
    }

    public final int filterDayData(@aa1 Context r28, @aa1 List<Sleep> r29, @aa1 LinkedHashMap<Long, ArrayList<Sleep>> r30, @aa1 List<SleepAllDayData> r31, @aa1 List<BarEntry> r32) {
        Intrinsics.X0O(r28, "context");
        Intrinsics.X0O(r29, "data");
        Intrinsics.X0O(r30, "monthData");
        Intrinsics.X0O(r31, "sleepDayDataList");
        Intrinsics.X0O(r32, "values");
        if (r29.isEmpty() == true) goto L51;
        Iterator<Sleep> r1 = r29.iterator();
    L5:
        long r7 = 1;
        if (r1.hasNext() == false) goto L16;
        Sleep r4 = r1.next();
        Iterator<Map.Entry<Long, ArrayList<Sleep>>> r9 = r30.entrySet().iterator();
    L9:
        if (r9.hasNext() == false) goto L5;
        Map.Entry<Long, ArrayList<Sleep>> r10 = r9.next();
        long r11 = r10.getKey().longValue();
        ArrayList<Sleep> r12 = r10.getValue();
        if (r4.getMTime() < ((r11 - TimeUnit.DAYS.toMillis(r7)) - ((long) O0X11OiO.iXiX011))) goto L15;
        if (r4.getMTime() > r11) goto L15;
        r12.add(r4);
    L15:
        r7 = 1;
        goto L9
    L16:
        Iterator<Map.Entry<Long, ArrayList<Sleep>>> r2 = r30.entrySet().iterator();
    L17:
        int r5 = 1;
        if (r2.hasNext() == false) goto L39;
        Map.Entry<Long, ArrayList<Sleep>> r6 = r2.next();
        long r8 = r6.getKey().longValue();
        ArrayList<Sleep> r13 = r6.getValue();
        long r14 = r8 - TimeUnit.DAYS.toMillis(1);
        i1O0OXO1O.OXO1.OXO1("zeroClockTime -> " + O0X11OiO.IO0iXO0O().format(Long.valueOf(r14)) + ", " + r13.size());
        SleepAllDayData r18 = new SleepAllDayData(0, 0, 0, null, null, null, 63, null);
        if (r13.isEmpty() == true) goto L37;
        SleepAllDayData r15 = filterData$default(this, r13, 0.0f, null, r14, 6, null);
        if (r15.getTotal() > 60) goto L24;
        r15.setTotal(0);
        r15.setEvaluation(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
    L38:
        r31.add(r15);
        goto L17
    L24:
        if (r15.getTotal() <= 540) goto L27;
        String r16 = r28.getString(R.string.sleepyhead);
        Intrinsics.O10IXXX0X(r16, "getString(...)");
        r15.setEvaluation(r16);
        goto L38
    L27:
        if (r15.getTotal() > 420) goto L29;
        String r17 = r28.getString(R.string.bad);
        Intrinsics.O10IXXX0X(r17, "getString(...)");
        r15.setEvaluation(r17);
        goto L38
    L29:
        if (r15.getStatus().get(1) < 120) goto L32;
        String r19 = r28.getString(R.string.good);
        Intrinsics.O10IXXX0X(r19, "getString(...)");
        r15.setEvaluation(r19);
        goto L38
    L32:
        if (r15.getStatus().get(1) < 60) goto L34;
        String r20 = r28.getString(R.string.general);
        Intrinsics.O10IXXX0X(r20, "getString(...)");
        r15.setEvaluation(r20);
        goto L38
    L34:
        String r21 = r28.getString(R.string.bad);
        Intrinsics.O10IXXX0X(r21, "getString(...)");
        r15.setEvaluation(r21);
        goto L38
    L37:
        r15 = r18;
        goto L38
    L39:
        Iterator<SleepAllDayData> r0 = r31.iterator();
        float r3 = 0.0f;
        int r22 = 0;
        int r110 = 0;
    L41:
        if (r0.hasNext() == false) goto L45;
        SleepAllDayData r23 = r0.next();
        r32.add(new BarEntry(r3, r23.getTotal() / 60.0f));
        r3 = r3 + 1.0f;
        if (r23.getTotal() == 0) goto L41;
        r22 = r22 + r23.getTotal();
        r110 = r110 + 1;
        goto L41
    L45:
        LogUtils.d(new Object[]{" sleep " + r22});
        if (r110 == 0) goto L50;
        r5 = r110;
    L50:
        return r22 / r5;
    L51:
        return 0;
    }

    @aa1
    public final int[] getBarColors(@aa1 Context r8, int r9, int r10) {
        Intrinsics.X0O(r8, "context");
        if (r9 == 1) goto L29;
        if (r9 == 2) goto L27;
        if (r9 == 3) goto L25;
        if (r9 == 8) goto L23;
        if (r9 == 9) goto L21;
        if (r9 != 17) goto L14;
        if (r10 != 8) goto L19;
        return new int[]{ContextCompat.getColor(r8, R.color.sleep_show_8), ContextCompat.getColor(r8, R.color.sleep_show_8)};
    L19:
        return new int[]{ContextCompat.getColor(r8, R.color.transparent), ContextCompat.getColor(r8, R.color.transparent)};
    L14:
        return new int[]{ContextCompat.getColor(r8, R.color.transparent), ContextCompat.getColor(r8, R.color.transparent)};
    L21:
        return new int[]{ContextCompat.getColor(r8, R.color.sleep_show_10), ContextCompat.getColor(r8, R.color.sleep_show_10)};
    L23:
        return new int[]{ContextCompat.getColor(r8, R.color.sleep_show_8), ContextCompat.getColor(r8, R.color.sleep_show_8)};
    L25:
        return new int[]{ContextCompat.getColor(r8, R.color.sleep_show_1), ContextCompat.getColor(r8, R.color.sleep_show_1)};
    L27:
        return new int[]{ContextCompat.getColor(r8, R.color.sleep_show_3), ContextCompat.getColor(r8, R.color.sleep_show_3)};
    L29:
        return new int[]{ContextCompat.getColor(r8, R.color.sleep_show_5), ContextCompat.getColor(r8, R.color.sleep_show_5)};
    }
}
