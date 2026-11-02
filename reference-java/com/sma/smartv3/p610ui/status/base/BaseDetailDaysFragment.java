package com.sma.smartv3.p610ui.status.base;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.util.TimePeriod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDetailDaysFragment<T> extends BaseDetailsFragment<T> {

    @aa1
    private final TimePeriod mTimePeriod = TimePeriod.DAY;
    public long[] range;

    @Override // com.sma.smartv3.p610ui.status.base.BaseStatusFragment
    @aa1
    public TimePeriod getMTimePeriod() {
        return this.mTimePeriod;
    }

    @aa1
    public final long[] getRange() {
        long[] jArr = this.range;
        if (jArr != null) {
            return jArr;
        }
        Intrinsics.XXO("range");
        return null;
    }

    public final void setRange(@aa1 long[] jArr) {
        Intrinsics.X0O(jArr, "<set-?>");
        this.range = jArr;
    }
}
