package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class MenstrualPeriod {

    @aa1
    public static final MenstrualPeriod INSTANCE = null;

    static {
        INSTANCE = new MenstrualPeriod();
    }

    private MenstrualPeriod() {
    }

    @aa1
    public final List<MenstrualPeriodResults> menstrualPeriodCalculation(@aa1 String r17, int r18, int r19) {
        Intrinsics.X0O(r17, "lastMenstrualPeriod");
        ArrayList r2 = new ArrayList();
        if (r18 >= 1) goto L5;
    L19:
        return r2;
    L5:
        if (r18 > 8) goto L19;
        Date r0 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(r17);
        int r6 = 0;
    L8:
        if (r6 >= r19) goto L19;
        if (r6 >= r18) goto L13;
        int r8 = 0;
    L18:
        Calendar r9 = Calendar.getInstance();
        r9.setTimeInMillis(r0.getTime() + (TimeUnit.DAYS.toMillis(1) * ((long) r6)));
        StringCompanionObject r10 = StringCompanionObject.OXO1;
        String r7 = String.format("%d%02d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(r9.get(1)), Integer.valueOf(r9.get(2) + 1), Integer.valueOf(r9.get(5))}, 3));
        Intrinsics.O10IXXX0X(r7, "format(...)");
        r2.add(new MenstrualPeriodResults(r7, r8));
        r6 = r6 + 1;
        goto L8
    L13:
        if (r6 >= 9) goto L15;
    L17:
        r8 = 2;
        goto L18
    L15:
        if (r6 >= 18) goto L17;
        r8 = 1;
        goto L18
    }
}
