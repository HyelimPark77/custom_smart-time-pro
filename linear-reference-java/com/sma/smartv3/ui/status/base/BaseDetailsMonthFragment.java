package com.sma.smartv3.ui.status.base;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.util.TimePeriod;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDetailsMonthFragment<T> extends BaseDetailsFragment<T> {

    @aa1
    private final TimePeriod mTimePeriod;

    public BaseDetailsMonthFragment() {
        this.mTimePeriod = TimePeriod.MONTH;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseStatusFragment
    @aa1
    public TimePeriod getMTimePeriod() {
        return this.mTimePeriod;
    }
}
