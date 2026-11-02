package com.sma.smartv3.ui.status.base;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.util.TimePeriod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDetailDaysFragment<T> extends BaseDetailsFragment<T> {

    @aa1
    private final TimePeriod mTimePeriod;
    public long[] range;

    public BaseDetailDaysFragment() {
        this.mTimePeriod = TimePeriod.DAY;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseStatusFragment
    @aa1
    public TimePeriod getMTimePeriod() {
        return this.mTimePeriod;
    }

    @aa1
    public final long[] getRange() {
        long[] r0 = this.range;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("range");
        return null;
    }

    public final void setRange(@aa1 long[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.range = r2;
    }
}
