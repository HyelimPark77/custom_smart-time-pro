package com.szabh.smable3.entity;

import android.util.SparseIntArray;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import com.szabh.smable3.component.BleCache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSleep extends BleWritable {
    public static final int AWAKE = 3;
    public static final int AWAKE_LENGTH = 7;

    @aa1
    public static final Companion Companion = null;
    public static final int DEEP = 1;
    public static final int DEEP_LENGTH = 5;
    public static final int END = 34;
    private static final int ERROR_DATA = 14400;
    public static final int ITEM_LENGTH = 7;
    public static final int LEVEL = 19;
    public static final int LIGHT = 2;
    public static final int LIGHT_LENGTH = 6;
    private static final int OFFSET = 60;
    private static final int PERIOD = 900;
    public static final int PIECEMEAL = 8;
    public static final int REM = 9;
    public static final int SCORE = 18;
    public static final int START = 17;
    public static final int TOTAL_LENGTH = 4;
    private int mMode;
    private int mSoft;
    private int mStrong;
    private int mTime;

    @SourceDebugExtension({"SMAP\nBleSleep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSleep.kt\ncom/szabh/smable3/entity/BleSleep$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n1573#2:458\n1604#2,4:459\n1878#2,3:463\n1878#2,3:466\n1878#2,3:469\n1869#2,2:472\n1878#2,3:474\n1878#2,3:477\n1878#2,3:481\n1563#2:484\n1634#2,3:485\n774#2:488\n865#2,2:489\n1#3:480\n*S KotlinDebug\n*F\n+ 1 BleSleep.kt\ncom/szabh/smable3/entity/BleSleep$Companion\n*L\n75#1:458\n75#1:459,4\n92#1:463,3\n199#1:466,3\n236#1:469,3\n259#1:472,2\n342#1:474,3\n368#1:477,3\n401#1:481,3\n430#1:484\n430#1:485,3\n441#1:488\n441#1:489,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ List analyseSleep$default(Companion r0, List r1, int r2, int r3, Object r4) {
            if ((r3 & 2) == 0) goto L6;
            r2 = 0;
        L6:
            return r0.analyseSleep(r1, r2);
        }

        public static /* synthetic */ List getSleepAllDayViewDatas$default(Companion r0, List r1, boolean r2, int r3, Object r4) {
            if ((r3 & 2) == 0) goto L6;
            r2 = false;
        L6:
            return r0.getSleepAllDayViewDatas(r1, r2);
        }

        @aa1
        public final List<BleSleep> analyseSleep(@aa1 List<BleSleep> r22, int r23) {
            Intrinsics.X0O(r22, "origin");
            if (r22.size() < 2) goto L5;
            List<BleSleep> r1 = r22;
            ArrayList r3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r2 = r1.iterator();
            int r4 = 0;
            int r5 = 0;
            int r6 = 0;
        L8:
            if (r2.hasNext() == false) goto L16;
            Object r7 = r2.next();
            int r9 = r6 + 1;
            if (r6 >= 0) goto L13;
            CollectionsKt__CollectionsKt.XOX0O0();
        L13:
            if (((BleSleep) r7).getMMode() != 17) goto L15;
            r5 = r6;
        L15:
            r3.add(Unit.OXO1);
            r6 = r9;
            goto L8
        L16:
            List r0 = CollectionsKt___CollectionsKt.IiII0(r22, r22.size() - r5);
            int r8 = r0.size() - 2;
            if (r8 < 0) goto L25;
            int r10 = 0;
        L19:
            int r11 = r10 + 1;
            if ((((BleSleep) r0.get(r11)).getMTime() - ((BleSleep) r0.get(r10)).getMTime()) >= BleSleep.ERROR_DATA) goto L22;
            if (r10 == r8) goto L25;
            r10 = r11;
            goto L19
        L22:
            return CollectionsKt__CollectionsKt.iI();
        L25:
            ArrayList r12 = new ArrayList();
            if (r23 != 0) goto L130;
            Iterator r13 = r0.iterator();
            boolean r14 = false;
            int r15 = 0;
        L29:
            if (r13.hasNext() == false) goto L121;
            Object r16 = r13.next();
            int r17 = r15 + 1;
            if (r15 >= 0) goto L33;
            CollectionsKt__CollectionsKt.XOX0O0();
        L33:
            BleSleep r18 = (BleSleep) r16;
            int r19 = r18.getMMode();
            if (r19 == 1) goto L72;
            if (r19 == 2) goto L51;
            if (r19 == 3) goto L46;
            if (r19 != 17) goto L120;
            r12.clear();
            r18.setMMode(2);
            r12.add(r18);
            if (r0.size() > r17) goto L42;
        L44:
            r14 = true;
            goto L120
        L42:
            if ((((BleSleep) r0.get(r17)).getMTime() - r18.getMTime()) <= 900) goto L44;
            r12.add(new BleSleep(r18.getMTime() + 900, 1, 0, 0, 12, null));
        L120:
            r15 = r17;
            goto L29
        L46:
            if (r12.isEmpty() == false) goto L48;
        L49:
            r12.add(r18);
            goto L120
        L48:
            if (((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMMode() == r18.getMMode()) goto L120;
        L51:
            if (r18.getMStrong() > 2) goto L61;
            if (r18.getMSoft() > 25) goto L61;
            if (r12.isEmpty() == false) goto L58;
        L59:
            r12.add(r18);
            goto L120
        L58:
            if (((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMMode() == r18.getMMode()) goto L120;
        L61:
            if (r12.isEmpty() == false) goto L63;
        L70:
            r12.add(BleSleep.copy$default(r18, r18.getMTime() + AppLovinErrorCodes.INVALID_URL, 3, 0, 0, 12, null));
            goto L120
        L63:
            if ((r18.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMTime()) > 900) goto L70;
            if (r12.isEmpty() == true) goto L120;
            if ((r18.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMTime()) > 900) goto L120;
            ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).setMMode(3);
            goto L120
        L72:
            if (r18.getMStrong() <= 2) goto L86;
            if (r12.isEmpty() == false) goto L76;
        L84:
            r12.add(BleSleep.copy$default(r18, r18.getMTime() + AppLovinErrorCodes.INVALID_URL, 3, 0, 0, 12, null));
            goto L120
        L76:
            if ((r18.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMTime()) > 960) goto L84;
            if (r12.isEmpty() == false) goto L81;
        L83:
            r12.add(BleSleep.copy$default(r18, 0, 3, 0, 0, 13, null));
            goto L120
        L81:
            if ((r18.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMTime()) > 840) goto L83;
            ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).setMMode(3);
            goto L120
        L86:
            if (r18.getMSoft() <= 2) goto L100;
            if (r12.isEmpty() == false) goto L90;
        L98:
            r12.add(BleSleep.copy$default(r18, r18.getMTime() + AppLovinErrorCodes.INVALID_URL, 2, 0, 0, 12, null));
            goto L120
        L90:
            if ((r18.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMTime()) > 900) goto L98;
            if (r12.isEmpty() == false) goto L95;
        L97:
            r12.add(BleSleep.copy$default(r18, 0, 2, 0, 0, 13, null));
            goto L120
        L95:
            if ((r18.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMTime()) > 900) goto L97;
            ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).setMMode(2);
            goto L120
        L100:
            if (r12.isEmpty() == true) goto L107;
            if (((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMMode() != r18.getMMode()) goto L107;
            if ((r18.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMTime()) <= 840) goto L107;
            r12.add(BleSleep.copy$default(r18, r18.getMTime(), 2, 0, 0, 12, null));
        L107:
            if (r12.size() <= 2) goto L116;
            if (((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMMode() != 2) goto L116;
            if (((BleSleep) r12.get(r12.size() - 2)).getMMode() != 1) goto L116;
            if ((r18.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMTime()) <= 840) goto L116;
            r12.add(BleSleep.copy$default(r18, r18.getMTime(), 2, 0, 0, 12, null));
        L116:
            if (r12.isEmpty() == false) goto L118;
        L119:
            r12.add(r18);
            goto L120
        L118:
            if (((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMMode() == r18.getMMode()) goto L120;
        L121:
            if (r14 == false) goto L123;
        L152:
            return r12;
        L123:
            if (r12.isEmpty() == true) goto L152;
            ((BleSleep) r12.get(0)).setMMode(2);
            if (r12.size() <= 1) goto L152;
            if ((((BleSleep) r12.get(1)).getMTime() - ((BleSleep) r12.get(0)).getMTime()) <= 900) goto L152;
            r12.add(1, new BleSleep(((BleSleep) r12.get(0)).getMTime() + 900, 1, 0, 0, 12, null));
            return r12;
        L130:
            Iterator r20 = r0.iterator();
        L132:
            if (r20.hasNext() == false) goto L152;
            Object r21 = r20.next();
            int r24 = r4 + 1;
            if (r4 >= 0) goto L136;
            CollectionsKt__CollectionsKt.XOX0O0();
        L136:
            BleSleep r25 = (BleSleep) r21;
            int r26 = r25.getMMode();
            if (r26 == 1) goto L150;
            if (r26 == 2) goto L149;
            if (r26 == 3) goto L148;
            if (r26 != 17) goto L142;
            r12.clear();
        L151:
            r4 = r24;
            goto L132
        L142:
            if (r26 != 34) goto L151;
            if (r12.isEmpty() == true) goto L151;
            r12.add(BleSleep.copy$default(r25, 0, ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMMode(), 0, 0, 13, null));
            goto L151
        L148:
            r12.add(r25);
            goto L151
        L149:
            r12.add(r25);
            goto L151
        L150:
            r12.add(r25);
            goto L151
        L5:
            return CollectionsKt__CollectionsKt.iI();
        }

        @aa1
        public final List<BleSleep> analyseSleepAllDay(@aa1 List<BleSleep> r10, long r11) {
            Intrinsics.X0O(r10, "sleeps");
            long r0 = TimeUnit.DAYS.toMillis(1) + r11;
            i1O0OXO1O.OXO1.OXO1("analyseSleepAllDay -> " + r11 + ' ' + r0);
            int r2 = r10.size();
            int r3 = 0;
        L4:
            if (r3 >= r2) goto L9;
            if (r10.get(r3).getMLocalTime() >= r11) goto L10;
            r3 = r3 + 1;
        L10:
            i1O0OXO1O.OXO1.OXO1("analyseSleepAllDay -> start = " + r3);
            if (r3 != (-1)) goto L15;
            return CollectionsKt__CollectionsKt.iI();
        L15:
            if (r3 <= 0) goto L25;
            int r5 = r3 - 1;
        L17:
            BleSleep r6 = r10.get(r5);
            if (r6.getMMode() == 17) goto L19;
            if (r6.getMMode() == 34) goto L25;
            r5 = r5 - 1;
            if (r5 >= 0) goto L17;
        L19:
            r3 = r5;
        L25:
            i1O0OXO1O.OXO1.OXO1("analyseSleepAllDay -> start = " + r3);
            int r4 = r10.size();
            int r7 = r4 + (-1);
        L26:
            BleSleep r8 = r10.get(r7);
            if (r8.getMLocalTime() < r0) goto L29;
        L34:
            r7 = r7 - 1;
            if (r7 >= r3) goto L26;
        L36:
            i1O0OXO1O.OXO1.OXO1("analyseSleepAllDay -> " + r3 + " - " + r4);
            return r10.subList(r3, r4);
        L29:
            if (r8.getMMode() == 17) goto L30;
            if (r8.getMMode() != 34) goto L34;
            r4 = r7 + 1;
            goto L36
        L30:
            r4 = r7;
            goto L36
        L9:
            r3 = -1;
            goto L10
        }

        @aa1
        public final HashMap<Integer, Integer> getSleepAllDaySegmentStatus(@aa1 List<BleSleep> r12) {
            Intrinsics.X0O(r12, "sleeps");
            HashMap<Integer, Integer> r0 = new HashMap();
            int r4 = 0;
            Integer r5 = 0;
            if (r12.size() != 2) goto L10;
            if (r12.get(0).getMMode() != 17) goto L10;
            if (r12.get(1).getMMode() != 34) goto L10;
            r4 = r12.get(1).getMTime() - r12.get(0).getMTime();
        L25:
            if (r4 <= 0) goto L28;
            r0.put(8, Integer.valueOf(r4 / 60));
            return r0;
        L28:
            int r1 = (((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(r12)).getMTime()) / 60;
            Integer r13 = r0.get(2);
            if (r13 != null) goto L31;
            r13 = r5;
        L31:
            int r14 = r13.intValue() / 60;
            Integer r2 = r0.get(1);
            if (r2 != null) goto L34;
            r2 = r5;
        L34:
            int r3 = r2.intValue() / 60;
            Integer r6 = r0.get(9);
            if (r6 == null) goto L38;
            r5 = r6;
        L38:
            int r7 = r5.intValue() / 60;
            r0.put(2, Integer.valueOf(r14));
            r0.put(1, Integer.valueOf(r3));
            r0.put(9, Integer.valueOf(r7));
            r0.put(3, Integer.valueOf(((r1 - r14) - r3) - r7));
            return r0;
        L10:
            if (r12.size() <= 2) goto L25;
            Iterator<T> r8 = r12.iterator();
            int r9 = 0;
        L13:
            if (r8.hasNext() == false) goto L25;
            Object r10 = r8.next();
            int r11 = r9 + 1;
            if (r9 >= 0) goto L17;
            CollectionsKt__CollectionsKt.XOX0O0();
        L17:
            BleSleep r15 = (BleSleep) r10;
            if (r9 >= CollectionsKt__CollectionsKt.X11iII1O1(r12)) goto L24;
            int r16 = r15.getMMode();
            Integer r17 = r0.get(Integer.valueOf(r16));
            if (r17 == null) goto L22;
            int r18 = r17.intValue();
        L23:
            r0.put(Integer.valueOf(r16), Integer.valueOf(r18 + (r12.get(r11).getMTime() - r12.get(r9).getMTime())));
            goto L24
        L22:
            r18 = 0;
        L24:
            r9 = r11;
            goto L13
        }

        @aa1
        public final List<List<BleSleep>> getSleepAllDaySegments(@aa1 List<BleSleep> r14) {
            Intrinsics.X0O(r14, "sleeps");
            ArrayList r0 = new ArrayList();
            ArrayList r1 = new ArrayList();
            Iterator<T> r2 = r14.iterator();
            int r3 = 0;
        L4:
            if (r2.hasNext() == false) goto L16;
            Object r4 = r2.next();
            int r5 = r3 + 1;
            if (r3 >= 0) goto L8;
            CollectionsKt__CollectionsKt.XOX0O0();
        L8:
            BleSleep r6 = (BleSleep) r4;
            r1.add(BleSleep.copy$default(r6, 0, 0, 0, 0, 15, null));
            if (r6.getMMode() != 34) goto L11;
        L14:
            r0.add(r1);
            r1 = new ArrayList();
        L15:
            r3 = r5;
            goto L4
        L11:
            if (r1.isEmpty() == true) goto L15;
            if (r3 != CollectionsKt__CollectionsKt.X11iII1O1(r14)) goto L15;
        L16:
            return r0;
        }

        @aa1
        public final HashMap<Integer, Integer> getSleepAllDayStatus(@aa1 List<BleSleep> r17) {
            Intrinsics.X0O(r17, "sleeps");
            List<List<BleSleep>> r0 = getSleepAllDaySegments(r17);
            HashMap<Integer, Integer> r1 = new HashMap();
            Iterator<T> r2 = r0.iterator();
            int r4 = 0;
        L4:
            if (r2.hasNext() == false) goto L44;
            Object r5 = r2.next();
            int r6 = r4 + 1;
            if (r4 >= 0) goto L8;
            CollectionsKt__CollectionsKt.XOX0O0();
        L8:
            HashMap<Integer, Integer> r7 = BleSleep.Companion.getSleepAllDaySegmentStatus((List) r5);
            Integer r8 = r7.get(2);
            if (r8 == null) goto L11;
            int r9 = r8.intValue();
        L12:
            Integer r10 = r7.get(1);
            if (r10 == null) goto L15;
            int r11 = r10.intValue();
        L16:
            Integer r12 = r7.get(3);
            if (r12 == null) goto L19;
            int r13 = r12.intValue();
        L20:
            Integer r14 = r7.get(9);
            if (r14 == null) goto L23;
            int r15 = r14.intValue();
        L24:
            Integer r16 = r7.get(8);
            if (r16 == null) goto L27;
            int r18 = r16.intValue();
        L28:
            Integer r19 = r1.get(2);
            if (r19 != null) goto L31;
            r19 = 0;
        L31:
            r1.put(2, Integer.valueOf(r19.intValue() + r9));
            Integer r20 = r1.get(1);
            if (r20 != null) goto L34;
            r20 = 0;
        L34:
            r1.put(1, Integer.valueOf(r20.intValue() + r11));
            Integer r21 = r1.get(3);
            if (r21 != null) goto L37;
            r21 = 0;
        L37:
            r1.put(3, Integer.valueOf(r21.intValue() + r13));
            Integer r22 = r1.get(9);
            if (r22 != null) goto L40;
            r22 = 0;
        L40:
            r1.put(9, Integer.valueOf(r22.intValue() + r15));
            Integer r23 = r1.get(8);
            if (r23 != null) goto L43;
            r23 = 0;
        L43:
            r1.put(8, Integer.valueOf(r23.intValue() + r18));
            r4 = r6;
            goto L4
        L27:
            r18 = 0;
            goto L28
        L23:
            r15 = 0;
            goto L24
        L19:
            r13 = 0;
            goto L20
        L15:
            r11 = 0;
            goto L16
        L11:
            r9 = 0;
            goto L12
        L44:
            return r1;
        }

        @aa1
        public final List<BleSleep> getSleepAllDayViewDatas(@aa1 List<BleSleep> r14, boolean r15) {
            Intrinsics.X0O(r14, "sleeps");
            ArrayList r0 = new ArrayList();
            Iterator<List<BleSleep>> r16 = getSleepAllDaySegments(r14).iterator();
        L4:
            if (r16.hasNext() == false) goto L31;
            List<BleSleep> r1 = r16.next();
            Integer r2 = getSleepAllDaySegmentStatus(r1).get(8);
            if (r2 == null) goto L8;
            int r3 = r2.intValue();
        L10:
            if (r3 > 0) goto L11;
            if (BleCache.INSTANCE.getMSupportSHSYAlgorithm() != 1) goto L29;
            ArrayList r4 = new ArrayList();
            Iterator r5 = r1.iterator();
        L21:
            if (r5.hasNext() == false) goto L28;
            Object r6 = r5.next();
            if (((BleSleep) r6).getMMode() == 17) goto L25;
            boolean r7 = true;
        L26:
            if (r7 == false) goto L21;
            r4.add(r6);
            goto L21
        L25:
            r7 = false;
            goto L26
        L28:
            r1 = r4;
        L29:
            r0.addAll(r1);
            goto L4
        L11:
            if (r15 == false) goto L4;
            r0.add(BleSleep.copy$default(r1.get(0), 0, 17, 0, 0, 13, null));
            List<BleSleep> r8 = r1;
            ArrayList r9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r8, 10));
            Iterator r10 = r8.iterator();
        L14:
            if (r10.hasNext() == false) goto L16;
            BleSleep r11 = (BleSleep) r10.next();
            r11.setMMode(8);
            r9.add(r11);
            goto L14
        L16:
            r0.addAll(r9);
            r0.add(BleSleep.copy$default(r1.get(1), 0, 34, 0, 0, 13, null));
            goto L4
        L8:
            r3 = 0;
            goto L10
        L31:
            if (r0.isEmpty() == false) goto L33;
        L35:
            return r0;
        L33:
            if (((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r0)).getMMode() == 34) goto L35;
            r0.add(BleSleep.copy$default((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r0), 0, 34, 0, 0, 13, null));
            goto L35
        }

        @aa1
        public final SparseIntArray getSleepStatusDuration(@aa1 List<BleSleep> r7) {
            Intrinsics.X0O(r7, "sleeps");
            SparseIntArray r0 = new SparseIntArray();
            Iterator<T> r1 = r7.iterator();
            int r2 = 0;
        L4:
            if (r1.hasNext() == false) goto L12;
            Object r3 = r1.next();
            int r4 = r2 + 1;
            if (r2 >= 0) goto L8;
            CollectionsKt__CollectionsKt.XOX0O0();
        L8:
            BleSleep r5 = (BleSleep) r3;
            if (r2 >= CollectionsKt__CollectionsKt.X11iII1O1(r7)) goto L11;
            int r6 = r5.getMMode();
            int r8 = r7.get(r4).getMTime() - r5.getMTime();
            r0.put(r6, r0.get(r6) + r8);
        L11:
            r2 = r4;
            goto L4
        L12:
            r0.put(2, r0.get(2) / 60);
            r0.put(1, r0.get(1) / 60);
            r0.put(3, r0.get(3) / 60);
            return r0;
        }

        private Companion() {
        }

        @aa1
        public final SparseIntArray getSleepStatusDuration(@aa1 List<BleSleep> r8, @aa1 List<BleSleep> r9) {
            Intrinsics.X0O(r8, "sleeps");
            Intrinsics.X0O(r9, "origin");
            SparseIntArray r0 = new SparseIntArray();
            Iterator<T> r10 = r9.iterator();
        L4:
            if (r10.hasNext() == false) goto L19;
            BleSleep r1 = (BleSleep) r10.next();
            int r6 = r1.getMMode();
            if (r6 != 4) goto L8;
            r0.put(4, (r1.getMSoft() << 8) + r1.getMStrong());
            goto L4
        L8:
            if (r6 != 5) goto L10;
            r0.put(1, (r1.getMSoft() << 8) + r1.getMStrong());
            goto L4
        L10:
            if (r6 != 6) goto L12;
            r0.put(2, (r1.getMSoft() << 8) + r1.getMStrong());
            goto L4
        L12:
            if (r6 != 7) goto L4;
            r0.put(3, (r1.getMSoft() << 8) + r1.getMStrong());
            goto L4
        L19:
            if (r0.get(4) != 0) goto L22;
            SparseIntArray r11 = getSleepStatusDuration(r8);
            r11.put(4, (r11.get(2) + r11.get(1)) + r11.get(3));
            return r11;
        L22:
            return r0;
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleSleep() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleSleep copy$default(BleSleep r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mMode;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mSoft;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mStrong;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mMode;
    }

    public final int component3() {
        return this.mSoft;
    }

    public final int component4() {
        return this.mStrong;
    }

    @aa1
    public final BleSleep copy(int r2, int r3, int r4, int r5) {
        return new BleSleep(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mMode = readUInt8();
        this.mSoft = readUInt8();
        this.mStrong = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeInt32$default(this, this.mTime, null, 2, null);
        writeInt8(this.mMode);
        writeInt8(this.mSoft);
        writeInt8(this.mStrong);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSleep) == true) goto L8;
        return false;
    L8:
        BleSleep r6 = (BleSleep) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (this.mMode == r6.mMode) goto L15;
        return false;
    L15:
        if (this.mSoft == r6.mSoft) goto L18;
        return false;
    L18:
        if (this.mStrong == r6.mStrong) goto L20;
        return false;
    L20:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 7;
    }

    public final long getMLocalTime() {
        return BleReadable.Companion.timeToMillis(this.mTime);
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMSoft() {
        return this.mSoft;
    }

    public final int getMStrong() {
        return this.mStrong;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mSoft)) * 31) + Integer.hashCode(this.mStrong);
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMSoft(int r1) {
        this.mSoft = r1;
    }

    public final void setMStrong(int r1) {
        this.mStrong = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BleSleep(mTime=" + this.mTime + ", mMode=" + this.mMode + ", mSoft=" + this.mSoft + ", mStrong=" + this.mStrong + ", mLocalTime=" + getMLocalTime() + HexStringBuilder.COMMENT_BEGIN_CHAR + BleReadable.Companion.timeFormat$default(BleReadable.Companion, null, 1, null).format(Long.valueOf(getMLocalTime())) + "))";
    }

    public BleSleep(int r1, int r2, int r3, int r4) {
        this.mTime = r1;
        this.mMode = r2;
        this.mSoft = r3;
        this.mStrong = r4;
    }

    public /* synthetic */ BleSleep(int r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
