package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.IOIiII;
import com.android.mltcode.paycertificationapi.OX0ii;
import com.android.mltcode.paycertificationapi.aa1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleRepeat {
    public static final int EVERYDAY = 127;
    public static final int FRIDAY = 16;

    @aa1
    public static final BleRepeat INSTANCE = null;
    public static final int MONDAY = 1;
    public static final int ONCE = 0;
    public static final int SATURDAY = 32;
    public static final int SUNDAY = 64;
    public static final int THURSDAY = 8;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 4;

    @aa1
    private static final List<Integer> WEEKDAYS = null;
    public static final int WEEKEND = 96;
    public static final int WORKDAY = 31;

    static {
        INSTANCE = new BleRepeat();
        WEEKDAYS = CollectionsKt__CollectionsKt.iXiX011(new Integer[]{1, 2, 4, 8, 16, 32, 64});
    }

    private BleRepeat() {
    }

    public static /* synthetic */ int OXO1(int r0) {
        return indicesToRepeat$lambda$0(r0);
    }

    public static /* synthetic */ int XIi00iiXO(int r0) {
        return toIndices$lambda$0(r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int indicesToRepeat$default(BleRepeat r0, Set r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = new OX0ii();
    L6:
        return r0.indicesToRepeat(r1, r2);
    }

    private static final int indicesToRepeat$lambda$0(int r1) {
        return WEEKDAYS.get(r1).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set toIndices$default(BleRepeat r0, int r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = new IOIiII();
    L6:
        return r0.toIndices(r1, r2);
    }

    private static final int toIndices$lambda$0(int r1) {
        return WEEKDAYS.indexOf(Integer.valueOf(r1));
    }

    @aa1
    public final List<Integer> getWEEKDAYS() {
        return WEEKDAYS;
    }

    public final int indicesToRepeat(@aa1 Set<Integer> r3, @aa1 Function1<? super Integer, Integer> r4) {
        Intrinsics.X0O(r3, "indices");
        Intrinsics.X0O(r4, "transfer");
        Iterator<Integer> r5 = r3.iterator();
        int r0 = 0;
    L4:
        if (r5.hasNext() == false) goto L6;
        r0 = r0 | r4.invoke(Integer.valueOf(r5.next().intValue())).intValue();
        goto L4
    L6:
        return r0;
    }

    @aa1
    public final Set<Integer> toIndices(int r5, @aa1 Function1<? super Integer, Integer> r6) {
        Intrinsics.X0O(r6, "transfer");
        LinkedHashSet r0 = new LinkedHashSet();
        Iterator<Integer> r1 = WEEKDAYS.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        int r2 = r1.next().intValue();
        if (((r5 & 127) & r2) <= 0) goto L4;
        r0.add(r6.invoke(Integer.valueOf(r2)));
        goto L4
    L8:
        return r0;
    }

    @aa1
    public final String toWeekdayText(int r5, @aa1 Function1<? super Integer, String> r6) {
        Intrinsics.X0O(r6, "transfer");
        StringBuilder r0 = new StringBuilder();
        Iterator<Integer> r1 = WEEKDAYS.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        int r2 = r1.next().intValue();
        if (((r5 & 127) & r2) <= 0) goto L4;
        r0.append(r6.invoke(Integer.valueOf(r2)));
        goto L4
    L8:
        String r7 = r0.toString();
        Intrinsics.O10IXXX0X(r7, "toString(...)");
        return r7;
    }
}
