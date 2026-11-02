package com.sma.smartv3.p610ui.status.base;

import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.by6;
import com.sma.smartv3.util.TimePeriod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDetailsWeekFragment<T> extends BaseDetailsFragment<T> {

    @aa1
    private List<by6> weekDay = O0X11OiO.IXXOO(getMCalendar().getTimeInMillis());

    @aa1
    private final TimePeriod mTimePeriod = TimePeriod.WEEK;

    @Override // com.sma.smartv3.p610ui.status.base.BaseStatusFragment
    @aa1
    public TimePeriod getMTimePeriod() {
        return this.mTimePeriod;
    }

    @aa1
    public final List<by6> getWeekDay() {
        return this.weekDay;
    }

    public final void setWeekDay(@aa1 List<by6> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.weekDay = list;
    }
}
