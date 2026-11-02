package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import java.text.ParseException;
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
    public static final MenstrualPeriod INSTANCE = new MenstrualPeriod();

    private MenstrualPeriod() {
    }

    @aa1
    public final List<MenstrualPeriodResults> menstrualPeriodCalculation(@aa1 String lastMenstrualPeriod, int i, int i2) throws ParseException {
        int i3;
        Intrinsics.X0O(lastMenstrualPeriod, "lastMenstrualPeriod");
        ArrayList arrayList = new ArrayList();
        if (i >= 1 && i <= 8) {
            Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(lastMenstrualPeriod);
            int i4 = 0;
            while (i4 < i2) {
                if (i4 < i) {
                    i3 = 0;
                } else {
                    i3 = (i4 < 9 || i4 >= 18) ? 2 : 1;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(date.getTime() + (TimeUnit.DAYS.toMillis(1L) * ((long) i4)));
                StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
                String str = String.format("%d%02d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3));
                Intrinsics.O10IXXX0X(str, "format(...)");
                arrayList.add(new MenstrualPeriodResults(str, i3));
                i4++;
            }
        }
        return arrayList;
    }
}
