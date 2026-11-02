package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.szabh.smable3.entity.BleRepeat;
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
    public static final int MONDAY = 1;
    public static final int ONCE = 0;
    public static final int SATURDAY = 32;
    public static final int SUNDAY = 64;
    public static final int THURSDAY = 8;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 4;
    public static final int WEEKEND = 96;
    public static final int WORKDAY = 31;

    @aa1
    public static final BleRepeat INSTANCE = new BleRepeat();

    @aa1
    private static final List<Integer> WEEKDAYS = CollectionsKt__CollectionsKt.iXiX011(1, 2, 4, 8, 16, 32, 64);

    private BleRepeat() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int indicesToRepeat$default(BleRepeat bleRepeat, Set set, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: com.android.mltcode.paycertificationapi.OX0ii
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return Integer.valueOf(BleRepeat.indicesToRepeat$lambda$0(((Integer) obj2).intValue()));
                }
            };
        }
        return bleRepeat.indicesToRepeat(set, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int indicesToRepeat$lambda$0(int i) {
        return WEEKDAYS.get(i).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set toIndices$default(BleRepeat bleRepeat, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = new Function1() { // from class: com.android.mltcode.paycertificationapi.IOIiII
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return Integer.valueOf(BleRepeat.toIndices$lambda$0(((Integer) obj2).intValue()));
                }
            };
        }
        return bleRepeat.toIndices(i, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toIndices$lambda$0(int i) {
        return WEEKDAYS.indexOf(Integer.valueOf(i));
    }

    @aa1
    public final List<Integer> getWEEKDAYS() {
        return WEEKDAYS;
    }

    public final int indicesToRepeat(@aa1 Set<Integer> indices, @aa1 Function1<? super Integer, Integer> transfer) {
        Intrinsics.X0O(indices, "indices");
        Intrinsics.X0O(transfer, "transfer");
        Iterator<Integer> it = indices.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= transfer.invoke2(Integer.valueOf(it.next().intValue())).intValue();
        }
        return iIntValue;
    }

    @aa1
    public final Set<Integer> toIndices(int i, @aa1 Function1<? super Integer, Integer> transfer) {
        Intrinsics.X0O(transfer, "transfer");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Integer> it = WEEKDAYS.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if ((i & 127 & iIntValue) > 0) {
                linkedHashSet.add(transfer.invoke2(Integer.valueOf(iIntValue)));
            }
        }
        return linkedHashSet;
    }

    @aa1
    public final String toWeekdayText(int i, @aa1 Function1<? super Integer, String> transfer) {
        Intrinsics.X0O(transfer, "transfer");
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = WEEKDAYS.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if ((i & 127 & iIntValue) > 0) {
                sb.append(transfer.invoke2(Integer.valueOf(iIntValue)));
            }
        }
        String string = sb.toString();
        Intrinsics.O10IXXX0X(string, "toString(...)");
        return string;
    }
}
